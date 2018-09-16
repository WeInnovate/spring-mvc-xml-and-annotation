package com.wellnwill.jm3006.springmvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution (* com.wellnwill.jm3006.springmvc.*.*.*(..))")
	public void allMethodsInSpringmvc() {
	};

	@Before("allMethodsInSpringmvc()")
	public void runBeforeEveryMethod(JoinPoint joinPoint) {
		System.out.println(">> " + joinPoint.getSignature().getName());
	}

	@AfterReturning(pointcut = "allMethodsInSpringmvc()", returning = "result")
	public void runAfterReturningEveryMethod(JoinPoint joinPoint, Object result) {
		System.out.println("<< " + joinPoint.getSignature().getName() + " " + result);
	}

	@Around("allMethodsInSpringmvc()")
	public Object runAroundEveryMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long beforeMillis = System.currentTimeMillis();
		Object returnValue = proceedingJoinPoint.proceed();
		
		/*if (returnValue instanceof String && returnValue.equals("index")) {
			returnValue = "home";
		}*/
		
		long afterMillis = System.currentTimeMillis();
		System.out.println("Total time taken: " + (afterMillis - beforeMillis));
		return returnValue;
	}
	
	@AfterThrowing(pointcut = "allMethodsInSpringmvc()", throwing = "ex")
	public void runAfterReturningEveryMethod(Throwable ex) {
		System.out.println("Exception from Aspect: " + ex);
	}

}
