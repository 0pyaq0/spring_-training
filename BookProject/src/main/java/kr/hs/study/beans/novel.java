package kr.hs.study.beans;

public class novel implements Book{

	private int price = 0;
	private String name = "";
	private String bookname = "";

	public novel(int price, String name, String bookname) {
		this.bookname = bookname;
		this.name = name;
		this.price = price;
	}

	public void buy() {
		System.out.println("kim�� �Ҽ� " + bookname + "�� " + price + " �� ����");
	}
	public void sell() {
		System.out.println("novel �Ǹ�");
	}
	public void create() {
		System.out.println("novel �ۼ�");
	}
}
