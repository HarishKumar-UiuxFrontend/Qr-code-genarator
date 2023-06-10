package com.model;

import com.service.GameInterface;

public class Batman implements GameInterface {

	@Override
	public void up() {
		System.out.println("Batman is moving Up");
	}
	
	@Override
	public void down() {
		System.out.println("Batman is Moving down");
	}
	
	@Override
	public void left()
	{
		System.out.println("Batman is moving left");
	}
	
	@Override
	public void right() {
		System.out.println("Batman is moving Right");
	}
}
