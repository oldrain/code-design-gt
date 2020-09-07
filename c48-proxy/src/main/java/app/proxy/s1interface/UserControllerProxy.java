package app.proxy.s1interface;

import app.proxy.*;

/**
 * UserControllerProxy
 *
 * ex.
 * IUserController userController = new UserControllerProxy(new UserController());
 * userController.login("xxx", "xxx");
 * userController.register("xxx", "xxx");
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class UserControllerProxy implements IUserController {

    private IMetricsCollector metricsCollector;
    private IUserController userController;

    public UserControllerProxy(IUserController userController) {
        this.userController = userController;
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public UserVo login(String telephone, String password) {
        Long startTimestamp = System.currentTimeMillis();

        UserVo userVo = this.userController.login(telephone, password);

        Long endTimestamp = System.currentTimeMillis();
        Long responseTime = endTimestamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        this.metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        Long startTimestamp = System.currentTimeMillis();

        UserVo userVo = this.userController.register(telephone, password);

        Long endTimestamp = System.currentTimeMillis();
        Long responseTime = endTimestamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        this.metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

}
