package kr.hs.study.main;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		// HelloWorld ��ü hello1 ����� �޼��� ȣ���ؼ� hello ���
		
		// HelloWorldEn hello1 = new HelloWorldEn();
		// HelloWorldKr hello1 = new HelloWorldKr();
		HelloWorld hello1 = new HelloWorldKr(); // �θ��� ���� ������ �ڽ� ��ü�� ����Ŵ
		callMethod(hello1);
	}

	public static void callMethod (HelloWorld hello) { // static�� ��ü�� ������ �ʾƵ� ���� ����
		hello.sayHello();
	}
	
}
