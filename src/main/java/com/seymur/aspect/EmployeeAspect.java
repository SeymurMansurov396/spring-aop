package com.seymur.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Seymur on 6/2/2018.
 */
@Aspect
@Component
public class EmployeeAspect {

    private static  final Logger logger= LoggerFactory.getLogger(EmployeeAspect.class);
    @Before(value = "execution( * com.seymur.service.EmployeeDaoImpl.add(..))")
    public void logBeforeAddMethod(JoinPoint joinPoint){
        logger.warn("logging before add method");
        logger.warn("method name: "+joinPoint.getSignature().getName());


    }

    @Before(value = "execution( * com.seymur.service.EmployeeDaoImpl.*(..))")
    public void logBeforAllMethods(){
        logger.warn("logging for all methods");
    }
}
