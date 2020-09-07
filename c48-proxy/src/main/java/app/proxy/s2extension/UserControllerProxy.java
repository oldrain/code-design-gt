package app.proxy.s2extension;

import app.proxy.*;

/**
 * UserControllerProxy
 *
 * ex.
 * UserController userController = new UserControllerProxy();
 * userController.login("xxx", "xxx");
 * userController.register("xxx", "xxx");
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class UserControllerProxy extends UserController {

    private IMetricsCollector metricsCollector;

    public UserControllerProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public UserVo login(String telephone, String password) {
        Long startTimestamp = System.currentTimeMillis();

        UserVo userVo = super.login(telephone, password);

        Long endTimestamp = System.currentTimeMillis();
        Long responseTime = endTimestamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        this.metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        Long startTimestamp = System.currentTimeMillis();

        UserVo userVo = super.register(telephone, password);

        Long endTimestamp = System.currentTimeMillis();
        Long responseTime = endTimestamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        this.metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

}
