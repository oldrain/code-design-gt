package app.generator;

import com.google.common.annotations.VisibleForTesting;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * RandomIdGenerator
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class RandomIdGenerator implements LogIdGenerator {

    private static final Logger logger = LoggerFactory.getLogger(RandomIdGenerator.class);

    private static final String ALPHANUMERIC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private static final int RANDOM_LENGTH = 8;

    @Override
    public String generate() throws IdGenerationFailureException {
        String substrOfHostName = null;
        try {
            substrOfHostName = this.getLastFieldOfHostName();
        } catch (UnknownHostException e) {
            logger.error("exception: getLastFieldOfHostName");
            throw new IdGenerationFailureException("...");
        }

        long currTimeMillis = System.currentTimeMillis();
        String randomStr = this.generateRandomAlphanumeric(RANDOM_LENGTH);

        return String.format("%s-%d-%s", substrOfHostName, currTimeMillis, randomStr);
    }

    private String getLastFieldOfHostName() throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostName();
        if (StringUtils.isEmpty(hostName)) {
            logger.error("exception: getHostName");
            throw new UnknownHostException("...");
        }
        return this.getLastSubstrSplitByDot(hostName);
    }

    @VisibleForTesting
    protected String getLastSubstrSplitByDot(String hostName) {
        if (StringUtils.isEmpty(hostName)) {
            throw new IllegalArgumentException("...");
        }
        String[] tokens = hostName.split("\\.");
        return tokens[tokens.length - 1];
    }

    @VisibleForTesting
    protected String generateRandomAlphanumeric(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("...");
        }

        char[] randomChars = new char[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int idx = random.nextInt(ALPHANUMERIC.length());
            randomChars[i] = ALPHANUMERIC.charAt(idx);
        }

        return new String(randomChars);
    }

}
