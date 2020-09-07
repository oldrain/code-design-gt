package app.factory.p3di;

import java.util.ArrayList;
import java.util.List;

/**
 * BeanDefinition
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class BeanDefinition {

    private String id;
    private String className;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();
    private Scope scope = Scope.PROTOTYPE;
    private boolean lazeInit = false;

    public boolean isSingleton() {
        return this.scope.equals(Scope.SINGLETON);
    }

    public enum Scope {
        /**
         */
        SINGLETON,
        PROTOTYPE
        ;
    }

    public static class ConstructorArg {
        private boolean isRef;
        private Class<?> type;
        private Object arg;

        private ConstructorArg(Builder builder) {
            this.isRef = builder.isRef;
            this.type = builder.type;
            this.arg = builder.arg;
        }

        public static class Builder {
            private boolean isRef;
            private Class<?> type;
            private Object arg;

            public ConstructorArg build() {
                if (this.isRef && (this.arg == null || this.type != null)) {
                    throw new IllegalArgumentException("...");
                }
                if (!this.isRef && this.type == null && this.type == null) {
                    throw new IllegalArgumentException("...");
                }

                return new ConstructorArg(this);
            }

            public Builder setIsRef(boolean isRef) {
                this.isRef = isRef;
                return this;
            }

            public Builder setType(Class<?> type) {
                this.type = type;
                return this;
            }

            public Builder setArg(Object arg) {
                this.arg = arg;
                return this;
            }

        }

        public boolean isRef() {
            return isRef;
        }

        public Class<?> getType() {
            return type;
        }

        public Object getArg() {
            return arg;
        }
    }

    public String getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    public Scope getScope() {
        return scope;
    }

    public boolean isLazeInit() {
        return lazeInit;
    }

}
