package kr.hs.study.beans;

public class Designer implements Employee{
	
	private int starttime = 0;
	private int endtime = 0;
	
	public Designer(int starttime, int endtime) {
		this.starttime=starttime;
		this.endtime=endtime;
	}
	
	public void Checkin() {
		System.out.println("�����̳� "+ starttime +"�� ���");
	}
	public void Checkout() {
		System.out.println("�����̳� "+ endtime +"�� ���");
	}
}
