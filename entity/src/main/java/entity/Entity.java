package entity;

import java.awt.Image;

/**
 * The Abstract Class Entity.
 * 
 * @author jeremy
 *
 */
public abstract class Entity implements IEntity {
    

    /** The sprite. */
    private Sprite       sprite;

    /**
     * Instantiates a new entity.
     *
     * @param sprite
     *            the sprite
     */
    public Entity(final Sprite sprite) {
        this.setSprite(sprite);
    }

    /**
     * return the sprite.
     */
    public final Sprite getSprite() {
        return this.sprite;
    }

    /**
     * Sets the sprite.
     *
     * @param sprite
     *            the new sprite
     */
    protected final void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }
    
    /** 
     * return the image. 
     */
    public final Image getImage() {
        return this.getSprite().getImage();
    }

}