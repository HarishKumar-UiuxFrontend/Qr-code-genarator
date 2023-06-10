package com.main;

import com.model.Batman;
import com.model.Contra;
import com.model.Mario;
import com.service.GameService;

public class GameMain {

	public static void main(String[] args) {
		
		Mario mario = new Mario();
		Contra contra = new Contra();
		Batman batman = new Batman();
		
		GameService service = new GameService();
		service.rungame(batman);
	}
}