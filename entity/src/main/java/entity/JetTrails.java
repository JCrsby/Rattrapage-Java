package entity;

import entity.Sprite;

public class JetTrails extends Entity{

	private static final Sprite ORANGESPRITE = new Sprite('O',"jetTrails_orange.png");
	private static final Sprite LIGHTBLUESPRITE = new Sprite('L',"jetTrails_lightblue.png");

	JetTrails(char color){
		super(ORANGESPRITE);
	}

	JetTrails(){
		super(LIGHTBLUESPRITE);
	}

}
