package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	// The font for the text display
	Font  f1  = new Font("Impact", Font.ITALIC,  35);
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
		viewFrame.getModel().getMap().addObserver(this);
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		super.paintComponent(graphics);
		try {																					//load the images in the whole map
			for(int y=0; y < this.getViewFrame().getModel().getMap().getHeight(); y++)
			{
				for(int x=0; x < this.getViewFrame().getModel().getMap().getWidth(); x++)
				{
					this.getViewFrame().getModel().getMap().getOnTheMap()[x][y].getSprite().loadImage();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int y=0; y < this.getViewFrame().getModel().getMap().getHeight(); y++)			//Draw the images in the whole map	
		{
			for(int x=0; x < this.getViewFrame().getModel().getMap().getWidth(); x++)
			{
				graphics.drawImage(this.getViewFrame().getModel().getMap().getOnTheMap()[x][y].getSprite().getImage(), x*16, y*16, this);
			}
		}
		/**try{
			viewFrame.getModel().getMap().getObservable().addObserver(this);	//receive the notify from the map

		}catch(Exception e){ 
			e.printStackTrace();
		}*/

		//System.out.println("Je me nomme Jeremy");
		
	}
	

}