package _05_Polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * 1. Create new member variables for the width and height of Polymorph then 
 * initialize them in its constructor.
 * done
 * 2. Encapsulate the member variables of the Polymorph class. 
 * done
 * 3. Substitute the hard-coded numbers in the draw method of the BluePolymorph 
 * class with its width and height.
 * doone
 * 4. Create a new sub-class of the Polymorph class called RedPolymorph.
 * done
 * 5. Make RedPolymorph draw a red rectangle when its draw method is called.
 * done
 * 6. Create an object of RedPolymorph in the PolymorphWindow class and test
 * it by drawing it like the BluePolymorph.
 * done
 * 7. Create a new sub-class of the Polymorph class called MovingMorph.
 * done
 * 8. Add code to its update method to make MovingMorph objects move around
 * the screen.
 * done
 * 9. Create a MovingMorph object in your PolymorphWindow class and test it
 * by calling its draw and update methods.
 * done
 * 10. Now, delete all references to Polymorphs subclasses inside your
 * PolymorphWindow class.
 * done
 * 11. Create an ArrayList of Polymorph inside your PolymorphWindow class.
 * done
 * 12. Initialize the ArrayList and add a bunch of different types of
 * Polymorph subclass objects to the ArrayList.
 * done
 * 13. Use loops to call the draw and update method for all the Polymorphs in 
 * the list.
 * done
 * 14. Create a Polymorph that follows your mouse. Hint: The MouseMotionListener
 *  interface.
 * done
 * 15. Create a Polymorph that displays a JOptionPane Message Dialog when
 *  clicked. Hint: MouseListener interface.
 *  done
 */

public class PolymorphWindow extends JPanel implements ActionListener {

    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;

    private JFrame window;
    private Timer timer;
    private Random ran;
    private int ranint;

    //Polymorph bluePoly;
    //Polymorph redPoly;
    //Polymorph movingPoly;
    ArrayList<Polymorph> poly = new ArrayList<Polymorph>();

    public static void main(String[] args) {
        new PolymorphWindow().buildWindow();
    }

    public void buildWindow() {
        window = new JFrame("IT'S MORPHIN' TIME!");
        window.add(this);
        window.getContentPane().setPreferredSize(new Dimension(500, 500));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);

        //bluePoly = new BluePolymorph(50, 50, 50, 50);
        //redPoly = new RedPolymorph(150, 50, 50, 50);
        //movingPoly = new MovingPolymorph(50, 150, 50, 50, 150);
        ran = new Random();
        int temp2 = 0;
        int temp3 = 0;
        for (int i = 0; i < 40; i++) {
			ranint = ran.nextInt(6);
			//ranint = 3;
			
			if(ranint == 0) {
				poly.add(new BluePolymorph(ran.nextInt(501),ran.nextInt(501),50,50));
			}
			if(ranint == 1) {
				poly.add(new RedPolymorph(ran.nextInt(501),ran.nextInt(501),50,50));
			}
			if(ranint == 2) {
				int x = ran.nextInt(501);
				poly.add(new MovingPolymorph(x,ran.nextInt(501),50,50,ran.nextInt(301)+x+5));
			}
			if(ranint == 3) {
				poly.add(new BluePolymorph(ran.nextInt(501),ran.nextInt(501),50,50));
				poly.add(new RedPolymorph(ran.nextInt(501),ran.nextInt(501),50,50));
				poly.add(new MovingPolymorph(ran.nextInt(501),ran.nextInt(501),50,50,ran.nextInt(451)+50));
			}
			if(ranint == 4) {
				if(temp2<1) {
				FollowingPolymorph temp = new FollowingPolymorph(ran.nextInt(501),ran.nextInt(501),50,50);
				window.addMouseMotionListener(temp);
				poly.add(temp);
				System.out.println("FOLLOWING!");
				temp2++;
				}
				else {
					poly.add(new BluePolymorph(ran.nextInt(501),ran.nextInt(501),50,50));
					poly.add(new RedPolymorph(ran.nextInt(501),ran.nextInt(501),50,50));
					poly.add(new MovingPolymorph(ran.nextInt(501),ran.nextInt(501),50,50,ran.nextInt(451)+50));
				}
			}
			if(ranint == 5) {
				if(temp3<1) {
				SpeakingPolymorph temp = new SpeakingPolymorph(ran.nextInt(501),ran.nextInt(501),50,50);
				window.addMouseListener(temp);
					poly.add(temp);
				temp3++;
				System.out.println("SPEAKING!");
				}
				else {
					poly.add(new BluePolymorph(ran.nextInt(501),ran.nextInt(501),50,50));
					poly.add(new RedPolymorph(ran.nextInt(501),ran.nextInt(501),50,50));
					poly.add(new MovingPolymorph(ran.nextInt(501),ran.nextInt(501),50,50,ran.nextInt(451)+50));
				}
			}
		}

        timer = new Timer(1000 / 30, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        // draw background
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 500, 500);

        // draw polymorph
        //bluePoly.draw(g);
        //redPoly.draw(g);
        //movingPoly.draw(g);
        for (int i = 0; i < poly.size(); i++) {
			poly.get(i).draw(g);
		}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        //bluePoly.update();
        //redPoly.update();
        //movingPoly.update();
        for (int i = 0; i < poly.size(); i++) {
			poly.get(i).update();
		}
    }
}
