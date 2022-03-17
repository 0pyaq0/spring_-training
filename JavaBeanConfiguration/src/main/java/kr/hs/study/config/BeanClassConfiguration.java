package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

// config.xml�� ���Ұ� ���� ( bean ����)

@Configuration  //(�� ������ spring ��ü ���� ���� �������� �˷��ش�.)
public class BeanClassConfiguration {
	
	// <bean id="t1" class="kr.hs.study.beans.Testbean1"/>
	
	@Bean // bean ����, bean �ȿ� �޼��� �����ؼ� ��ü�� �����Ϸ� ~~~~~
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1; // t1 ��ü ����, �����ؼ� �ڵ����� �̸����� ������ �޼ҵ� ������ �� (java1) �� �� �����̳ʿ� �ֱ�
		// java1�� ����ͼ� �����
	} 
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
}
