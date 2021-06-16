package com.game;

import java.util.Scanner;

public class Player extends GawiBawiBo {

	public void setSelect() {
		System.out.println("input select\n:1 Gawi \t 2: Bawi \t 3: Bo");
		Scanner sc = new Scanner(System.in);
		super.setSelect(sc.nextInt()-1);
	}
}
