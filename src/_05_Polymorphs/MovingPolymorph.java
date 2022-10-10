package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingPolymorph extends Polymorph{

	boolean isMovingRight = true;
	boolean isVertical = false;
	private int end;
	private int startx;
	Random ran;
	
	public MovingPolymorph(int x, int y, int width, int height, int end) {
		super(x, y, width, height);
		this.end = end;
		startx = x;
		ran = new Random();
		int decide = ran.nextInt(2);
		if(decide==0) {
			isVertical = false;
		}
		if(decide==1) {
			isVertical = true;
		}
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}

    @Override
    public void update() {
        if(x<end && isMovingRight==true && isVertical == false) {
        	x = x+3;
        }
        if(x>=end && isMovingRight==true && isVertical == false) {
        	isMovingRight=false;
        }
        if(x>startx && isMovingRight==false && isVertical == false) {
        	x = x-3;
        }
        if(x<=startx && isMovingRight==false && isVertical == false) {
        	isMovingRight=true;
        }
        if(y<end && isMovingRight==true && isVertical == true) {
        	y = y+3;
        }
        if(y>=end && isMovingRight==true && isVertical == true) {
        	isMovingRight=false;
        }
        if(y>startx && isMovingRight==false && isVertical == true) {
        	y = y-3;
        }
        if(y<=startx && isMovingRight==false && isVertical == true) {
        	isMovingRight=true;
        }
    }
	
}
