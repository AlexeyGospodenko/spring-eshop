package com.gospodenko.springeshop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class LogAspect {
    private final SimpleDateFormat formater = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss.sss");

    @Pointcut("execution(* com.gospodenko.springeshop.controllers..*.*(..))")
    private void LogMethod() {
    }

    @Before("LogMethod()")
    public void logBefore(JoinPoint joinPoint) {
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formater.format(date) + "  Log before: " + joinPoint);
    }

    @AfterReturning("LogMethod()")
    public void logAfterReturning(JoinPoint joinPoint) {
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formater.format(date) + "  Log AfterReturning: " + joinPoint);
    }
}
