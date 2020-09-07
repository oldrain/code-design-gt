package app.proxy;

/**
 * IMetricsCollector
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface IMetricsCollector {

    void recordRequest(RequestInfo requestInfo);

}
