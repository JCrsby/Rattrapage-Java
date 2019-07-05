package entity;

import java.util.Observable;

import java.util.Timer;
import java.util.TimerTask;

import entity.IEntity;

/**
 * The Class Map
 * 
 * @author jeremy
 *
 */
public class Map extends Observable{

	private IEntity[][] onTheMap;

	private int width;

	private int height;

	/**
	 * Get the Width
	 * 
	 * @return width
	 */
	public int getWidth() {
		return width;
	}
	
/**
 * Set the width
 * 
 * @param width x
 */
	public void setWidth(int width) {
		this.width = width;
	}
	
/**
 * Get the Height
 * 
 * @return height
 */
	public int getHeight() {
		return height;
	}
	
/**
 * Set the Height
 * 
 * @param height y
 */
	public void setHeight(int height) {
		this.height = height;
	}

	public IEntity[][] getOnTheMap() {
		return onTheMap;
	}

	public void setOnTheMap(IEntity[][] onTheMap) {
		this.onTheMap = onTheMap;
	}

	public Map (int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
		setOnTheMap(new IEntity[width][height]);
		for(int y=0; y < this.height; y++)
		{
			for(int x=0; x < this.width; x++)
			{
				this.getOnTheMap()[x][y] = new Empty();
				if(x == 1 && y == 1) {
					this.getOnTheMap()[x][y] = new LightCycles('R');
				}
				if(x == 35 && y == 21) {
					this.getOnTheMap()[x][y] = new LightCycles();
				}
			}
		}

		timer = new Timer();
		timer.schedule(task,200, 200);
	}
/**
 * To have the final screen Red wins or Blue wins
 * 
 * @param width x
 * @param height x
 * @param color player
 */
	public void winMap (int width, int height, String color) {
		this.setWidth(width);
		this.setHeight(height);
		setOnTheMap(new IEntity[width][height]);
		for(int y=0; y < this.height; y++)
		{
			for(int x=0; x < this.width; x++)
			{
				this.getOnTheMap()[x][y] = new Empty();
				if(((x == 13 && y == 4) || (x == 13 && y == 5) || (x == 13 && y == 6) || (x == 13 && y == 7) || (x == 13 && y == 8) || (x == 13 && y == 12) || (x == 13 && y == 13) || (x == 13 && y == 14) || (x == 13 && y == 15) || (x == 12 && y == 16) || (x == 11 && y == 15) || (x == 10 && y == 16) || (x == 9 && y == 15) || (x == 9 && y == 14) || (x == 9 && y == 13) || (x == 9 && y == 12) || (x == 14 && y == 4) || (x == 14 && y == 6) || (x == 15 && y == 5) || (x == 15 && y == 7) || (x == 15 && y == 8) || (x == 16 && y == 12) || (x == 16 && y == 14) || (x == 16 && y == 15) || (x == 16 && y == 16) || (x == 17 && y == 4) || (x == 17 && y == 5) || (x == 17 && y == 6) || (x == 17 && y == 7) || (x == 17 && y == 8) || (x == 18 && y == 4) || (x == 18 && y == 6) || (x == 18 && y == 8) || (x == 18 && y == 12) || (x == 18 && y == 13) || (x == 18 && y == 14) || (x == 18 && y == 15) || (x == 18 && y == 16) || (x == 19 && y == 4) || (x == 19 && y == 8) || (x == 19 && y == 13) || (x == 20 && y == 14) || (x == 21 && y == 4) || (x == 21 && y == 5) || (x == 21 && y == 6) || (x == 21 && y == 7) || (x == 21 && y == 8) || (x == 21 && y == 15) || (x == 22 && y == 4) || (x == 22 && y == 8) || (x == 22 && y == 12) || (x == 22 && y == 13) || (x == 22 && y == 14) || (x == 22 && y == 15) || (x == 22 && y == 16) || (x == 23 && y == 5) || (x == 23 && y == 6) || (x == 23 && y == 7) || (x == 24 && y == 13) || (x == 24 && y == 16) || (x == 25 && y == 12) || (x == 25 && y == 14) || (x == 25 && y == 16) || (x == 26 && y == 12) || (x == 26 && y == 15)) && color == "Blue") {
					this.getOnTheMap()[x][y] = new LightCycles('R');
				
				}else if(((x == 13 && y == 12) || (x == 13 && y == 13) || (x == 13 && y == 14) || (x == 13 && y == 15) || (x == 12 && y == 16) || (x == 11 && y == 15) || (x == 10 && y == 16) || (x == 9 && y == 15) || (x == 9 && y == 14) || (x == 9 && y == 13) || (x == 9 && y == 12) || (x == 16 && y == 12) || (x == 16 && y == 14) || (x == 16 && y == 15) || (x == 16 && y == 16) || (x == 18 && y == 12) || (x == 18 && y == 13) || (x == 18 && y == 14) || (x == 18 && y == 15) || (x == 18 && y == 16) || (x == 19 && y == 13) || (x == 20 && y == 14) || (x == 21 && y == 15) || (x == 22 && y == 12) || (x == 22 && y == 13) || (x == 22 && y == 14) || (x == 22 && y == 15) || (x == 22 && y == 16) || (x == 24 && y == 13) || (x == 24 && y == 16) || (x == 25 && y == 12) || (x == 25 && y == 14) || (x == 25 && y == 16) || (x == 26 && y == 12) || (x == 26 && y == 15) || (x == 10 && y == 5) || (x == 10 && y == 4) || (x == 10 && y == 6) || (x == 10 && y == 7) || (x == 10 && y == 8) || (x == 11 && y == 4) || (x == 11 && y == 6) || (x == 11 && y == 8) || (x == 12 && y == 5) || (x == 12 && y == 7) || (x == 14 && y == 4) || (x == 14 && y == 5) || (x == 14 && y == 6) || (x == 14 && y == 7) || (x == 14 && y == 8) || (x == 15 && y == 8) || (x == 16 && y == 8) || (x == 18 && y == 4) || (x == 18 && y == 5) || (x == 18 && y == 6) || (x == 18 && y == 7) | (x == 19 && y == 8) || (x == 20 && y == 8) || (x == 21 && y == 4) || (x == 21 && y == 5) || (x == 21 && y == 6) || (x == 21 && y == 7) || (x == 23 && y == 4) || (x == 23 && y == 5) || (x == 23 && y == 6) || (x == 23 && y == 7) || (x == 23 && y == 8) || (x == 24 && y == 4) || (x == 24 && y == 6) || (x == 24 && y == 8) || (x == 25 && y == 4) || (x == 25 && y == 8)) && color == "Red") {
					this.getOnTheMap()[x][y] = new LightCycles();
				}
			}
		}

		timer = new Timer();
		timer.schedule(task,200, 200);
		
		setChanged();//save the changes
        notifyObservers();//notify the view
	}
	
	/**
	 * Timer to update the map constantly
	 */
	TimerTask task = new TimerTask() {
		public void run(){
			updateMap();
		}
/**
 * For updating the map
 */
		private void updateMap() {

			setChanged();
			notifyObservers();
		}
	};
	Timer timer;
	
/**
 * Function for going up
 * 
 * @param x width
 * @param y height
 * @param color player
 */
	public void moveUp(int x, int y, String color) {
		if(this.getOnTheMap()[x][y-1] instanceof JetTrails || this.getOnTheMap()[x][y-1] instanceof LightCycles || this.getOnTheMap()[x][y-1] instanceof Wall) {
			this.winMap(37, 23, color);
			System.out.println("Bonjour Thomas");
		}else {
			this.onTheMap[x][y-1] = this.onTheMap[x][y];	
		}
		if (color == "Red") {
			this.onTheMap[x][y] = new JetTrails('O');
		}else {
			this.onTheMap[x][y] = new JetTrails();
		}

	}
	
/**
 * Function for going down
 * 
 * @param x width
 * @param y height
 * @param color player
 */
	public void moveDown(int x, int y, String color) {
		if(this.getOnTheMap()[x][y+1] instanceof JetTrails || this.getOnTheMap()[x][y+1] instanceof LightCycles || this.getOnTheMap()[x][y+1] instanceof Wall) {
			this.winMap(37, 23, color);
			System.out.println("Bonjour Thomas");
		}else {
			this.onTheMap[x][y+1] = this.onTheMap[x][y];	
		}
		if (color == "Red") {
			this.onTheMap[x][y] = new JetTrails('O');
		}else {
			this.onTheMap[x][y] = new JetTrails();
		}

	}

/**
 * Function for going right
 * 
 * @param x width
 * @param y height
 * @param color player
 */
	public void moveRight(int x, int y, String color) {
		if(this.getOnTheMap()[x+1][y] instanceof JetTrails || this.getOnTheMap()[x+1][y] instanceof LightCycles || this.getOnTheMap()[x+1][y] instanceof Wall) {
			this.winMap(37, 23, color);
			System.out.println("Bonjour Thomas");
		}else {
			this.onTheMap[x+1][y] = this.onTheMap[x][y];
		}
		if (color == "Red") {
			this.onTheMap[x][y] = new JetTrails('O');
		}else {
			this.onTheMap[x][y] = new JetTrails();
		}

	}

/**
 * Function for going left
 * 
 * @param x width
 * @param y height
 * @param color player
 */
	public void moveLeft(int x, int y, String color) {
		if(this.getOnTheMap()[x-1][y] instanceof JetTrails || this.getOnTheMap()[x-1][y] instanceof LightCycles || this.getOnTheMap()[x-1][y] instanceof Wall) {
			this.winMap(37, 23, color);
			System.out.println("Bonjour Thomas");
		}else {
			this.onTheMap[x-1][y] = this.onTheMap[x][y];
		}
		if (color == "Red") {
			this.onTheMap[x][y] = new JetTrails('O');
		}else {
			this.onTheMap[x][y] = new JetTrails();
		}

	}

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return this;
	}


}