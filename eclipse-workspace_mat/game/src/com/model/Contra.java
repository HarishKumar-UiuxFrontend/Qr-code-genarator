package com.model;

import com.service.GameInterface;

public class Contra implements GameInterface{

	public void up() {
		System.out.println("Contra is moving Up");
	}
	
	public void down() {
		System.out.println("Contra is Moving down");
	}
	
	public void left()
	{
		System.out.println("Contra is moving left");
	}
	
	public void right() {
		System.out.println("Contra is moving Right");
	}
	
}
