package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Poet implements Book{
	@Autowired
	public BookInfo poInfo;
	
	public void buy() {
		System.out.println(poInfo.getName() + "�� �� '" + poInfo.getBook() + "'�� " + poInfo.getPrice() + "���� ���.");
	}
	
	public void sell() {
		System.out.println(poInfo.getName() + "�� �� '" + poInfo.getBook() + "'�� " + poInfo.getPrice() + "���� �Ǵ�.");
	}
	
	public void create() {
		System.out.println(poInfo.getName() + "�� �� '" + poInfo.getBook() + "'�� " + poInfo.getPrice() + "���� ����.");
	}
}
