package app.proxy.s3dynamic;

import app.proxy.IMetricsCollector;
import app.proxy.MetricsCollector;
import app.proxy.RequestInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * MetricsCollectorProxy
 *
 * MetricsCollectorProxy proxy = new MetricsCollectorProxy();
 * IUserController userController = (IUserController) proxy.createProxy(new UserController());
 * userController.login("xxx", "xxx");
 * userController.register("xxx", "xxx");
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class MetricsCollectorProxy {

    private IMetricsCollector metricsCollector;

    public MetricsCollectorProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public Object createProxy(Object proxiedObject) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {

        private Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            Long startTimestamp = System.currentTimeMillis();

            Object result = null;

            try {
                result = method.invoke(this.proxiedObject, args);
            } catch (IllegalAccessException | InvocationTargetException e) {
                // todo
            }

            Long endTimestamp = System.currentTimeMillis();
            Long responseTime = endTimestamp - startTimestamp;
            String apiName = this.proxiedObject.getClass().getName() + ":" + method.getName();
            RequestInfo requestInfo = new RequestInfo(apiName, responseTime, startTimestamp);
            metricsCollector.recordRequest(requestInfo);

            return result;
        }
    }

}
