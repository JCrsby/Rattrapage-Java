package entity;

import java.awt.Image;

/**
 * The Interface IEntity.
 * 
 * @author jeremy
 *
 */
public interface IEntity  {

    /**
     * Gets the sprite.
     *
     * @return the sprite
     */
    Sprite getSprite();
    
    /**
     * Gets the image.
     *
     * @return the image
     */
    Image getImage();
}