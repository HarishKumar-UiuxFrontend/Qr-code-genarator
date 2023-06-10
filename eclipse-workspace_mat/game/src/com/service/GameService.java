package com.service;

public class GameService {
	
	
	
	public void rungame(GameInterface obj) {
		obj.left();
		obj.right();
		obj.up();
		obj.down();	
	}
}
