package com.test07;


public abstract class AreaImpl implements Area{
	
	private String result;
	
	@Override
	public void print() {
		System.out.printf(Area.PRINT + result);
	}
	
	@Override
	public abstract void make();
	
	public void setResult(String result) {
		this.result = result;
	}
}
