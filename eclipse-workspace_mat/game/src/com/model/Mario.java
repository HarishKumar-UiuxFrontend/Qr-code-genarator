package com.model;

import com.service.GameInterface;

public class Mario implements GameInterface{

	@Override
	public void left() {
		System.out.println("Mario is moving Left");
	}

	@Override
	public void right() {
		System.out.println("Mario is moving Right");
	}

	@Override
	public void up() {
		System.out.println("Mario is moving Up");
	}

	@Override
	public void down() {
		System.out.println("Mario is Moving down");
	}

	
	
	
//	public void up() {
//		System.out.println("Mario is moving Up");
//	}
//
//	public void down() {
//		System.out.println("Mario is Moving down");
//	}
//
//	public void left() {
//		System.out.println("Mario is moving left");
//	}
//
//	public void right() {
//		System.out.println("Mario is moving Right");
//	}
}
