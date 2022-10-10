package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FollowingPolymorph extends Polymorph implements MouseMotionListener{

	public FollowingPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}

    @Override
    public void update() {
        
    }

	@Override
	public void mouseDragged(MouseEvent eve) {
		x = eve.getX();
		y = eve.getY();
	}

	@Override
	public void mouseMoved(MouseEvent eve) {
		x = eve.getX();
		y = eve.getY();
	}
	
}