package com.vasu.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect 
@Component
public class CustLoggingAspect {
	//add a logger
private Logger logger = Logger.getLogger(getClass().getName());
//setup pointcut declarations
@Pointcut("execution(* com.vasu.controller.*.*(..))")
private void forControllerPackage() {
}
@Pointcut("execution(* com.vasu.service.*.*(..))")
private void forServicePackage() {
}
@Pointcut("execution(* com.vasu.dao.*.*(..))")
private void forDaoPackage() {}
@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
private void appFlow() {
	}
//add @Before advice
@Before("appFlow()")
public void beforeExcution(JoinPoint theJoinPoint) {
	//display the method we are calling
	String theMethod=theJoinPoint.getSignature().toShortString();
	logger.info("@Before The calling method is--->"+theMethod);
	//display the arguments to the method.
	   Object[] args=theJoinPoint.getArgs();
	   //display the arguments of the method.
	   for(Object tempArgs : args) {
		   logger.info("arguments are: "+tempArgs);
	   }
}
//add @AfterReturning advice
@AfterReturning(pointcut="appFlow()", returning="result")
public void afterExecution(JoinPoint theJoinPoint, Object result) {
	//display the method that we are returning from
	String method=theJoinPoint.getSignature().toShortString();
	logger.info("@AfterReturning method----> " +method);
	//data we are returning 
	logger.info("data returning result--->"+result);
}
}
