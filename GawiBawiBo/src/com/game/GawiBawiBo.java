package com.game;

public class GawiBawiBo {

	private int select;
	private String[] gawibawibo = {"Gawi", "Bawi","Bo"};
	
	public int getSelect() {
		return select;
	}
	
	public void setSelect(int select) {
		this.select = select;
	}
	
	public String getHand() {
		return gawibawibo[select];
	}
	
}
