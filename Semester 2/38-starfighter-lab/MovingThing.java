//(c) A+ Computer Science
//www.apluscompsci.com

/* This class represents something that can move.
 ** Since "something" is very generic, you will of course
 ** create children class based off of this class.
 ** This class will provide the basics of something that moves,
 ** like position and size. It will also have methods that will
 ** be overridden by child classes (like how to draw).
 */


import java.awt.Color;
import java.awt.Graphics;

public class MovingThing
{
    private int xPos;
    private int yPos;
    private int width;
    private int height;

    public MovingThing()
    {
        xPos = 50;
        yPos = 50;
        width = 50;
        height = 50;
    }

    public MovingThing(int x, int y)
    {
        xPos = x;
        yPos = y;
        width = 50;
        height = 50;
    }

    public MovingThing(int x, int y, int w, int h)
    {
        //add code here
        xPos = x;
        yPos = y;
        width = w;
        height = h;
    }

    public void setPos( int x, int y)
    {
        //add code here
        xPos = x;
        yPos = y;
    }

    public void setX(int x)
    {
        //add code here
        xPos = x;
    }

    public void setY(int y)
    {
        //add code here
        yPos = y;
    }

    public int getX()
    {
        return xPos;   //finish this method
    }

    public int getY()
    {
        return yPos;  //finish this method
    }

    public void setWidth(int w)
    {
        //add code here
        width = w;
    }

    public void setHeight(int h)
    {
        //add code here
        height = h;
    }

    public int getWidth()
    {
        return width;  //finish this method
    }

    public int getHeight()
    {
        return height;  //finish this method
    }

    public void move(String direction)
    {
        //this method will be fully implemented
        //in the sub class
        //so, leave it blank here and override in
        //the child class
    }

    public void draw(Graphics window)
    {
        //this method will be fully implemented
        //in the sub class
        //so, leave it blank here and override in
        //the child class
    }

    public String toString()
    {
        return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
    }
}