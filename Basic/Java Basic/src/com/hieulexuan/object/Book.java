package com.hieulexuan.object;

public class Book {

	String nameBook;
	String descript;
	double price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String nameBook, String descript) {
		super();
		this.nameBook = nameBook;
		this.descript = descript;
	}

	public Book(double price) {
		super();
		this.price = price;
	}

	public Book(String nameBook, String descript, double price) {
		super();
		this.nameBook = nameBook;
		this.descript = descript;
		this.price = price;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
