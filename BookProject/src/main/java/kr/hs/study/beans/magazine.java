package kr.hs.study.beans;

public class magazine implements Book{

	private int price = 0;
	private String name = "";
	private String bookname = "";

	public magazine(int price, String name, String bookname) {
		this.bookname = bookname;
		this.name = name;
		this.price = price;
	}

	public void buy() {
		System.out.println("park�� ���� " + bookname + "�� " + price + " �� ����");
	}
	public void sell() {
		System.out.println("magazine �Ǹ�");
	}
	public void create() {
		System.out.println("magazine �ۼ�");
	}
}
