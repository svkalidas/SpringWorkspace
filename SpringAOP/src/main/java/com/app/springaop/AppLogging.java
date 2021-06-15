package com.app.springaop;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AppLogging {

	@PostConstruct
	void init() {
		System.out.println("AppLogging initialized");
	}

	@PreDestroy
	void destroy() {
		System.out.println("AppLogging destroyed");
	}

	@Pointcut("within(com.app.springaop.*)")
	public void beforeAll() {

	}

	@Before("beforeAll()")
	public void logBeanName(JoinPoint joinPoint) {
		System.out.println("Execution started for :" + joinPoint.getSignature().getName());
	}

	@After("execution(public void *.setTyre(*))")
	public void afterSetTyre(JoinPoint joinPoint) {
		System.out.println("Tyre type updated as " + joinPoint.getArgs());
	}

	@After("args(year)")
	public void afterSetGuarantee(int year) {
		System.out.println("Guarantee updated to " + year);
	}

	@AfterReturning(pointcut = "execution(public int *.getGuarantee())", returning = "returnValue")
	public void afterGuaranteeReturn(String returnValue) {
		System.out.println("The Guarantee return as " + returnValue);
	}

	@Around("execution( * com.app.springaop.TvsTyre.get*() )")
	public Object arroundGet(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("Get executed for :" + proceedingJoinPoint.getSignature());
		Object value = "";
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		return value;
	}

	@Around("execution(* com.app.springaop.Car.setTyre(..) )")
	public void arroundSet(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out
				.println("Setting tyre : " + proceedingJoinPoint.getArgs() + " for : " + proceedingJoinPoint.getThis());
		Object value = proceedingJoinPoint.proceed();
		System.out.println("successfully updated the tyre " + value != null ? value : "");
	}
}
