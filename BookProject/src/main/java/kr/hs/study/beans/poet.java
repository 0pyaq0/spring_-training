package kr.hs.study.beans;

public class poet implements Book{

	private int price = 0;
	private String name = "";
	private String bookname = "";

	public poet(int price, String name, String bookname) {
		this.bookname = bookname;
		this.name = name;
		this.price = price;
	}

	public void buy() {
		System.out.println("lee�� �� "  + bookname + "�� " + price + " �� ����");
	}
	public void sell() {
		System.out.println("poet �Ǹ�");
	}
	public void create() {
		System.out.println("poet �ۼ�");
	}
}