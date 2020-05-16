package com.rpc.java.spring.framework.beans;

/**
 * Created by Tom.
 */
public class GPBeanWrapper {
    private Object wrapperInstance;
    private Class<?> wrappedClass;
    public GPBeanWrapper(Object instance) {
        this.wrapperInstance = instance;
        this.wrappedClass = instance.getClass();
    }

    public Object getWrapperInstance() {
        return wrapperInstance;
    }

    public Class<?> getWrappedClass() {
        return wrappedClass;
    }
}
