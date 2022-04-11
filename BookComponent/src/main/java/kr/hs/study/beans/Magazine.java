package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Magazine implements Book {
	@Autowired
	private BookInfo maInfo;
	
	public void buy() {
		System.out.println(maInfo.getName() + "�� ���� '" + maInfo.getBook() + "'�� " + maInfo.getPrice() + "���� ���.");
	}
	
	public void sell() {
		System.out.println(maInfo.getName() + "�� ���� '" + maInfo.getBook() + "'�� " + maInfo.getPrice() + "���� �Ǵ�.");
	}
	
	public void create() {
		System.out.println(maInfo.getName() + "�� ���� '" + maInfo.getBook() + "'�� " + maInfo.getPrice() + "���� ����.");
	}

}
