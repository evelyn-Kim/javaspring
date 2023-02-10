package aop03.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Before("execution(* aop03.MyCalc.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println("Before:"+name);
	}
	@AfterReturning(value="execution(* aop03.MyCalc.*(..))", returning="ret")
	public void printAdvice( JoinPoint joinPoint, Object ret ) {
		double d = (Double)ret;
		if (d>50)
			System.out.println("50ÃÊ°ú");
	}//end printAdvice
}
