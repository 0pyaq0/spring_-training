package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pub")
public class Publisher implements Employee{
	private int CheckInTime;
	private int CheckOutTime;
	
	public Publisher(@Value("9") int checkInTime, @Value("6") int checkOutTime) {
		super();
		CheckInTime = checkInTime;
		CheckOutTime = checkOutTime;
	}
	
	public void CheckIn() {
		System.out.println("�ۺ��� " + CheckInTime +"�� ���");
	};
	public void CheckOut() {
		System.out.println("�ۺ��� " + CheckOutTime +"�� ���");
	};
}
