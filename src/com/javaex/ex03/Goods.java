package com.javaex.ex03;

public class Goods {

	//필드
	private String name;
	private String price;
	private int count;

	//생성자
	public Goods() {
	}
	public Goods(String name, String price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	//메소드-gs
	public String getName() {
		return name;
	}
	public String getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	//메소드일반
	public void income() {
		System.out.println(this.name+"(가격:"+this.price+")이 "+this.count+"개 입고 되었습니다.");
	}

}
