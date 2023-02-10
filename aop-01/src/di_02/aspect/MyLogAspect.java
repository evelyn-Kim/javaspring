package di_02.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyLogAspect {

	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		Object ret = null;
		ret = joinPoint.proceed();//반드시 실행
		return ret+"-------";
	}
	
	public void afterRetuning(JoinPoint joinPoint, Object ret) {
		System.out.println("정상종료후: 반환값="+ret);
	}
	public void beforeAdvice(JoinPoint joinPoint ) {
		String name = joinPoint.getSignature().getName();
		//전달되는 값을 알아보기
		Object[] args = joinPoint.getArgs();
		
		System.out.println("AOP:BeforeAdvice:메서드명:"+name);
		System.out.println("AOP:전달되는 데이터갯수:"+args.length);
	}
	
	
	
	
}
