package kr.hs.study.beans;

public class Developer implements Employee{
	
	private int starttime = 0;
	private int endtime = 0;
	
	public Developer(int starttime, int endtime) {
		this.starttime=starttime;
		this.endtime=endtime;
	}
	
	public void Checkin() {
		System.out.println("������ "+ starttime +"�� ���");
	}
	public void Checkout() {
		System.out.println("������ "+ endtime +"�� ���");
	}
}
