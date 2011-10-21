package withgod.spring;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.logging.Logger;

public class Interceptor implements MethodBeforeAdvice, AfterReturningAdvice{
    protected static Logger logger = Logger.getLogger(Interceptor.class.getName());
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        logger.info("detection [" + method.getName() + "] starting");
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        logger.info("detection [" + method.getName() + "] end");
    }
}
