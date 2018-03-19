package com.higgsup.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectService {
    @Pointcut("execution( * com.higgsup.service.impl.*.*(..))")
    private void pointCut(){}

    @Before("pointCut()")
    private void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Before advice");
    }

    @After("pointCut()")
    private void afterAdvice(JoinPoint joinPoint) {
        System.out.println("After advice");
    }

    @AfterReturning(pointcut = "pointCut()", returning = "retVal")
    private void afterRunningAdvice(Object retVal) {
        System.out.println("After running Advice");
    }

    @AfterThrowing(pointcut =  "pointCut()", throwing = "ex")
    private void afterThrowingAdvice(Exception ex){
        System.out.println("After throwing advice");
    }

    @Around("pointCut()")
    private Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before around advice");
        Object result = joinPoint.proceed();
        System.out.println("After around advice");
        return result;
    }
}
