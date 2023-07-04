//(c) A+ Computer Science
//www.apluscompsci.com

/* This class extends the MovingThing class
 ** to create a "ship" which IS A moving thing!
 ** Remember that since this class extends another
 ** class, you will need to use "super" maybe a lot.
 */

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
    private int speed;
    private Image image;

    public Ship()
    {
        // call my 5 parameter constructor
        this(50,50,50,50,1);
    }

    public Ship(int x, int y)
    {
        //add code here
        this.setPos(x, y);
    }

    public Ship(int x, int y, int s)
    {
        //add code here
        this.setPos(x, y);
        this.speed = s;
    }

    public Ship(int x, int y, int w, int h, int s)
    {
        // call parent class constructor
        super(x, y, w, h);
        speed=s;

        // get the image that will be used for the ship
        try
        {
            URL url = getClass().getResource("ship.jpg");
            image = ImageIO.read(url);
        }
        catch(Exception e)
        {
            System.out.println("Could not open ship image file! Make sure it is there and in the right place.");
        }
    }

    public void setSpeed(int s)
    {
        //add more code
        speed = s;
    }

    public int getSpeed()
    {
        // finish
        return speed;
    }

    public void move(String direction)
    {
        //move the ship according to the speed (pay attention to direction!)
        //acceptable directions are "UP", "DOWN", "LEFT", "RIGHT"
        if (direction.toUpperCase().equals("UP"))
        {
            this.setY(this.getY()-speed);
        }
        if (direction.toUpperCase().equals("DOWN"))
        {
            this.setY(this.getY()+speed);
        }
        if (direction.toUpperCase().equals("LEFT"))
        {
            this.setX(this.getX()-speed);
        }
        if (direction.toUpperCase().equals("RIGHT"))
        {
            this.setX(this.getX()+speed);
        }
    }

    public void draw( Graphics window )
    {
        // this will do the magic of drawing the ship using the image provided
        // at the right location
        window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
    }

    public String toString()
    {
        return super.toString() + ", speed=" + getSpeed();
    }
}
