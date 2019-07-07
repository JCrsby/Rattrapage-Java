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
	/**
	 *Constructor of Map 
	 * 
	 * @param width x
	 * @param height y
	 */
	public Map (int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
		setOnTheMap(new IEntity[width][height]);
		for(int y=0; y < this.height; y++)
		{
			for(int x=0; x < this.width; x++)
			{
				this.getOnTheMap()[x][y] = new Empty();
				this.getOnTheMap()[0][0] = new Wall();
				this.getOnTheMap()[1][0] = new Wall();
				this.getOnTheMap()[2][0] = new Wall();
				this.getOnTheMap()[3][0] = new Wall();
				this.getOnTheMap()[4][0] = new Wall();
				this.getOnTheMap()[5][0] = new Wall();
				this.getOnTheMap()[6][0] = new Wall();
				this.getOnTheMap()[7][0] = new Wall();
				this.getOnTheMap()[8][0] = new Wall();
				this.getOnTheMap()[9][0] = new Wall();
				this.getOnTheMap()[10][0] = new Wall();
				this.getOnTheMap()[11][0] = new Wall();
				this.getOnTheMap()[12][0] = new Wall();
				this.getOnTheMap()[13][0] = new Wall();
				this.getOnTheMap()[14][0] = new Wall();
				this.getOnTheMap()[15][0] = new Wall();
				this.getOnTheMap()[16][0] = new Wall();
				this.getOnTheMap()[17][0] = new Wall();
				this.getOnTheMap()[18][0] = new Wall();
				this.getOnTheMap()[19][0] = new Wall();
				this.getOnTheMap()[20][0] = new Wall();
				this.getOnTheMap()[21][0] = new Wall();
				this.getOnTheMap()[22][0] = new Wall();
				this.getOnTheMap()[23][0] = new Wall();
				this.getOnTheMap()[24][0] = new Wall();
				this.getOnTheMap()[25][0] = new Wall();
				this.getOnTheMap()[26][0] = new Wall();
				this.getOnTheMap()[27][0] = new Wall();
				this.getOnTheMap()[28][0] = new Wall();
				this.getOnTheMap()[29][0] = new Wall();
				this.getOnTheMap()[30][0] = new Wall();
				this.getOnTheMap()[31][0] = new Wall();
				this.getOnTheMap()[32][0] = new Wall();
				this.getOnTheMap()[33][0] = new Wall();
				this.getOnTheMap()[34][0] = new Wall();
				this.getOnTheMap()[35][0] = new Wall();
				this.getOnTheMap()[36][0] = new Wall();
				this.getOnTheMap()[36][1] = new Wall();
				this.getOnTheMap()[36][2] = new Wall();
				this.getOnTheMap()[36][3] = new Wall();
				this.getOnTheMap()[36][4] = new Wall();
				this.getOnTheMap()[36][5] = new Wall();
				this.getOnTheMap()[36][6] = new Wall();
				this.getOnTheMap()[36][7] = new Wall();
				this.getOnTheMap()[36][8] = new Wall();
				this.getOnTheMap()[36][9] = new Wall();
				this.getOnTheMap()[36][10] = new Wall();
				this.getOnTheMap()[36][11] = new Wall();
				this.getOnTheMap()[36][12] = new Wall();
				this.getOnTheMap()[36][13] = new Wall();
				this.getOnTheMap()[36][14] = new Wall();
				this.getOnTheMap()[36][15] = new Wall();
				this.getOnTheMap()[36][16] = new Wall();
				this.getOnTheMap()[36][17] = new Wall();
				this.getOnTheMap()[36][18] = new Wall();
				this.getOnTheMap()[36][19] = new Wall();
				this.getOnTheMap()[36][20] = new Wall();
				this.getOnTheMap()[36][21] = new Wall();
				this.getOnTheMap()[36][22] = new Wall();
				this.getOnTheMap()[0][1] = new Wall();
				this.getOnTheMap()[0][2] = new Wall();
				this.getOnTheMap()[0][3] = new Wall();
				this.getOnTheMap()[0][4] = new Wall();
				this.getOnTheMap()[0][5] = new Wall();
				this.getOnTheMap()[0][6] = new Wall();
				this.getOnTheMap()[0][7] = new Wall();
				this.getOnTheMap()[0][8] = new Wall();
				this.getOnTheMap()[0][9] = new Wall();
				this.getOnTheMap()[0][10] = new Wall();
				this.getOnTheMap()[0][11] = new Wall();
				this.getOnTheMap()[0][12] = new Wall();
				this.getOnTheMap()[0][13] = new Wall();
				this.getOnTheMap()[0][14] = new Wall();
				this.getOnTheMap()[0][15] = new Wall();
				this.getOnTheMap()[0][16] = new Wall();
				this.getOnTheMap()[0][17] = new Wall();
				this.getOnTheMap()[0][18] = new Wall();
				this.getOnTheMap()[0][19] = new Wall();
				this.getOnTheMap()[0][20] = new Wall();
				this.getOnTheMap()[0][21] = new Wall();
				this.getOnTheMap()[0][22] = new Wall();
				this.getOnTheMap()[1][22] = new Wall();
				this.getOnTheMap()[2][22] = new Wall();
				this.getOnTheMap()[3][22] = new Wall();
				this.getOnTheMap()[4][22] = new Wall();
				this.getOnTheMap()[5][22] = new Wall();
				this.getOnTheMap()[6][22] = new Wall();
				this.getOnTheMap()[7][22] = new Wall();
				this.getOnTheMap()[8][22] = new Wall();
				this.getOnTheMap()[9][22] = new Wall();
				this.getOnTheMap()[10][22] = new Wall();
				this.getOnTheMap()[11][22] = new Wall();
				this.getOnTheMap()[12][22] = new Wall();
				this.getOnTheMap()[13][22] = new Wall();
				this.getOnTheMap()[14][22] = new Wall();
				this.getOnTheMap()[15][22] = new Wall();
				this.getOnTheMap()[16][22] = new Wall();
				this.getOnTheMap()[17][22] = new Wall();
				this.getOnTheMap()[18][22] = new Wall();
				this.getOnTheMap()[19][22] = new Wall();
				this.getOnTheMap()[20][22] = new Wall();
				this.getOnTheMap()[21][22] = new Wall();
				this.getOnTheMap()[22][22] = new Wall();
				this.getOnTheMap()[23][22] = new Wall();
				this.getOnTheMap()[24][22] = new Wall();
				this.getOnTheMap()[25][22] = new Wall();
				this.getOnTheMap()[26][22] = new Wall();
				this.getOnTheMap()[27][22] = new Wall();
				this.getOnTheMap()[28][22] = new Wall();
				this.getOnTheMap()[29][22] = new Wall();
				this.getOnTheMap()[30][22] = new Wall();
				this.getOnTheMap()[31][22] = new Wall();
				this.getOnTheMap()[32][22] = new Wall();
				this.getOnTheMap()[33][22] = new Wall();
				this.getOnTheMap()[34][22] = new Wall();
				this.getOnTheMap()[35][22] = new Wall();
				this.getOnTheMap()[36][22] = new Wall();
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
			
			for(int x=0; x < this.width; x++)
			{
				this.getOnTheMap()[x][y] = new Wall();
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