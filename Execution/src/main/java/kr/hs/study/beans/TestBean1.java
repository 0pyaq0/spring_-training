package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("beans�� TestBean1�� method1");
	}
	public void method1(int a1) {
		System.out.println("int �Ű����� method1");
	}
	public void method1(String s1) {
		System.out.println("String �Ű����� method1");
	}
	public void method1(int a1, int a2) {
		System.out.println("������ �Ű�����2�� method1");
	}
	public void method1(int a1, String a2) {
		System.out.println("������ 1�� , ���ڿ� �Ű�����1�� method1");
	}
	public int method1(int a1, int a2, int a3) {
		return a1+a2+a3;
	}
	
	public void method2() {
		System.out.println("beans�� TestBean1�� method2");
	}
}
