package com.higgsup.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.aop.framework.ReflectiveMethodInvocation;

public class AspectServiceImpl {

    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("before advice service");
    }

    public void afterAdvice(JoinPoint joinPoint){
        System.out.println("after advice service");
    }

    public void afterRunningAdvice(JoinPoint joinPoint, Object retVal){
        System.out.println("after running advice service");
    }

    public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex){
        System.out.println("after throwing advice service");
    }

    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before advice service");
        System.out.println("Args : " + joinPoint.getArgs());
        Object result = joinPoint.proceed();
        System.out.println("around after advice service");
        return result;
    }

}
