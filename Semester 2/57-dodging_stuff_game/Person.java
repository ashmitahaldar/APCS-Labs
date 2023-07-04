//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Person 
{
	private ArrayList<Image> list;	
	private int x, y, current;
	private int SPEED = 7;
	private final int DOWN = 0, UP = 3, LEFT = 1, RIGHT = 2;
	
	public Person(int x, int y) throws IOException
	{
		this.x=x;
		this.y=y;

		current = 0;
		
		//point the array list at a new ArrayList
		list = new ArrayList<Image>();

		//add all images to the list	
		Image front = ImageIO.read(new File("dude.gif"));
		Image left = ImageIO.read(new File("dudeL.gif"));
		Image right = ImageIO.read(new File("dudeR.gif"));
		Image back = ImageIO.read(new File("dudeU.gif"));
		list.add(front);	
		list.add(left);
		list.add(right);
		list.add(back);
	}
	
	// will return true if person collides with another object
	public boolean collide(int x, int y)
	{
		Rectangle a = new Rectangle(this.x, this.y, 50, 50);
		Rectangle b = new Rectangle(x, y, 50, 50);
		return a.intersects(b);
	}
	
	public void drawPerson(Graphics2D g)
	{
		//draw the current image on the screen 
		g.drawImage(list.get(current), x, y, null);
	}
	
	public Image getCurrent()
	{
		//return the current image
		return list.get(current);
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
	public void moveRight()
	{
		//finish
		current = RIGHT;
		x += SPEED;
	}
	
	public void moveLeft()
	{
		//finish
		current = LEFT;	
		x -= SPEED;
	}
	
	public void moveUp()
	{
		//finish
		current = UP;
		y -= SPEED;	
	}
	
	public void moveDown()
	{
		//finish
		current = DOWN;
		y += SPEED;	
	}
}
