package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("Advice�� before method");
	}
	
	public void AfterMethod() {
		System.out.println("Advice�� AfterMethod");
	}
	
	public void aroundmethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around �޼��� ȣ��1");
		pjp.proceed(); // ���� �ٽ� �޼��� ����
		System.out.println("around �޼��� ȣ��2");
	}
	
	public void afterReturningMethod(){
		System.out.println("afterReturningMethod");
	}
	
	public void afterThrowableMethod(Throwable e) {
		System.out.println("afterThrowableMethod");
		System.out.println("e : " + e);
	}
}
