package kr.hs.study.beans;

public class publisher implements Employee{
	
	private int starttime = 0;
	private int endtime = 0;
	
	public publisher(int starttime, int endtime) {
		this.starttime=starttime;
		this.endtime=endtime;
	}
	
	public void Checkin() {
		System.out.println("�ۺ��� "+ starttime +"�� ���");
	}
	public void Checkout() {
		System.out.println("�ۺ��� "+ endtime +"�� ���");
	}
}
