package entity;

/**
 * The Class Empty.
 * 
 * @author jeremy
 *
 */
public class Empty extends Entity {

	private static final Sprite SPRITE = new Sprite('E',"empty.png");
	
	Empty(){
		super(SPRITE);
	}
}
