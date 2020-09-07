package app.generator;

import org.junit.Assert;
import org.junit.Test;

/**
 * RandomIdGeneratorTest
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class RandomIdGeneratorTest {

    @Test
    public void testGetLastSubstrSplitByDot() {
        RandomIdGenerator idGenerator = new RandomIdGenerator();

        String actualSubstr = idGenerator.getLastSubstrSplitByDot("field1.field2.field3");
        Assert.assertEquals("field3", actualSubstr);

        actualSubstr = idGenerator.getLastSubstrSplitByDot("field3");
        Assert.assertEquals("field3", actualSubstr);

        actualSubstr = idGenerator.getLastSubstrSplitByDot("field1#field2#field3");
        Assert.assertEquals("field1#field2#field3", actualSubstr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLastSubstrSplitByDot_nullOrEmpty() {
        RandomIdGenerator idGenerator = new RandomIdGenerator();

        idGenerator.getLastSubstrSplitByDot(null);
        idGenerator.getLastSubstrSplitByDot("");
    }

    @Test
    public void testGenerateRandomAlphanumeric() {
        RandomIdGenerator idGenerator = new RandomIdGenerator();

        String actualRandomStr = idGenerator.generateRandomAlphanumeric(8);
        Assert.assertNotNull(actualRandomStr);
        Assert.assertEquals(8, actualRandomStr.length());
        for (char c : actualRandomStr.toCharArray()) {
            Assert.assertTrue(('0' <= c && c <= '9') || ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z'));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateRandomAlphanumeric_lengthEqualsOrLessThanZero() {
        RandomIdGenerator idGenerator = new RandomIdGenerator();

        idGenerator.generateRandomAlphanumeric(0);
        idGenerator.generateRandomAlphanumeric(-1);
    }

}
