package di_02.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyLogAspect {

	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		Object ret = null;
		ret = joinPoint.proceed();//�ݵ�� ����
		return ret+"-------";
	}
	
	public void afterRetuning(JoinPoint joinPoint, Object ret) {
		System.out.println("����������: ��ȯ��="+ret);
	}
	public void beforeAdvice(JoinPoint joinPoint ) {
		String name = joinPoint.getSignature().getName();
		//���޵Ǵ� ���� �˾ƺ���
		Object[] args = joinPoint.getArgs();
		
		System.out.println("AOP:BeforeAdvice:�޼����:"+name);
		System.out.println("AOP:���޵Ǵ� �����Ͱ���:"+args.length);
	}
	
	
	
	
}
