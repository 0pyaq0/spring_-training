package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Novel implements Book {
	@Autowired
	public BookInfo noInfo;
	
	public void buy() {
		System.out.println(noInfo.getName() + "�� �Ҽ� '" + noInfo.getBook() + "'�� " + noInfo.getPrice() + "���� ���.");
	}
	
	public void sell() {
		System.out.println(noInfo.getName() + "�� �Ҽ� '" + noInfo.getBook() + "'�� " + noInfo.getPrice() + "���� �Ǵ�.");
	}
	
	public void create() {
		System.out.println(noInfo.getName() + "�� �Ҽ� '" + noInfo.getBook() + "'�� " + noInfo.getPrice() + "���� ����.");
	}
}
