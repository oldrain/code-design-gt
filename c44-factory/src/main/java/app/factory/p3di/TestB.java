package app.factory.p3di;

/**
 * TestB
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class TestB {

    private String host;
    private Integer port;

    public TestB(String host, Integer port) {
        this.host = host;
        this.port = port;
    }

    public String test() {
        return "Host: " + this.host + ", port: " + this.port;
    }

}
