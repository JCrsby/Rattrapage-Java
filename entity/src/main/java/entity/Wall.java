package entity;

/**
 * The Class Wall.
 * 
 * @author jeremy
 *
 */
public class Wall extends Entity {

	private static final Sprite SPRITE = new Sprite('W',"wall.png");
	
	Wall(){
		super(SPRITE);
	}
}