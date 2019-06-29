package entity;

import java.util.Observable;

import java.util.Timer;
import java.util.TimerTask;

import entity.IEntity;

public class Map extends Observable{

	private IEntity[][] onTheMap;
	
	private int width;
	
	private int height;
	
	public Map() {
		this(600, 400);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

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
			}
		}
		
		timer = new Timer();
		timer.schedule(task,200, 200);
	}
	
	/**
     * Timer to update the map constantly
     */
    TimerTask task = new TimerTask() {
        public void run(){
            updateMap();
        }

		private void updateMap() {
			
			setChanged();
			notifyObservers();
		}
    };
    Timer timer;
	
	public void moveUp(int x, int y, String color) {
		this.onTheMap[x][y-1] = this.onTheMap[x][y];
		if (color == "Red") {
			this.onTheMap[x][y] = new JetTrails('O');
		}else {
			this.onTheMap[x][y] = new JetTrails();
		}
	}
	
	public void moveDown(int x, int y, String color) {
		this.onTheMap[x][y+1] = this.onTheMap[x][y];
		if (color == "Red") {
			this.onTheMap[x][y] = new JetTrails('O');
		}else {
			this.onTheMap[x][y] = new JetTrails();
		}
	}
	
	public void moveRight(int x, int y, String color) {
		this.onTheMap[x+1][y] = this.onTheMap[x][y];
		if (color == "Red") {
			this.onTheMap[x][y] = new JetTrails('O');
		}else {
			this.onTheMap[x][y] = new JetTrails();
		}
	}
	
	public void moveLeft(int x, int y, String color) {
		this.onTheMap[x-1][y] = this.onTheMap[x][y];
		if (color == "Red") {
			this.onTheMap[x][y] = new JetTrails('O');
		}else {
			this.onTheMap[x][y] = new JetTrails();
		}
	}

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}