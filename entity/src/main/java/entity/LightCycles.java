package entity;

public class LightCycles extends Entity{

	private static final Sprite REDSPRITE = new Sprite('R',"lightcycle_red.png");
	private static final Sprite BLUESPRITE = new Sprite('B',"lightcycle_blue.png");
	
	LightCycles(char color){
		super(REDSPRITE);
	}

	LightCycles(){
		super(BLUESPRITE);
	}
	
	
}
