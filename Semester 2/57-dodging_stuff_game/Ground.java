//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Ground 
{
	private ArrayList<Image> tiles;
	private final int WIDTH = 800, HEIGHT = 600;
	private final int GRASS = 0, GTOROAD = 1, ROAD = 2, RTOGRASS = 3;
	
	public Ground() throws IOException
	{
		//point the tiles at new array list
		tiles = new ArrayList<Image>();
		
		//add in each of the images for the grass.gif, gtoroad.gif, road.gif, rtograss.gif
		tiles.add( ImageIO.read(new File("grass.gif")));
		tiles.add( ImageIO.read(new File("gtoroad.gif")) );
		tiles.add( ImageIO.read(new File("road.gif")) );
		tiles.add( ImageIO.read(new File("rtograss.gif")) );
		//tiles.add( ImageIO.read(new File("grass.gif")) );
	
	}
	
	public void drawGround(Graphics2D g)
	{
		//draw the ground on the screen	
		// placing Grass tiles for 2 layers
		for (int ty = 0; ty < 100; ty += 50){
			for (int tx = 0; tx < WIDTH; tx += 50){
				g.drawImage(tiles.get(GRASS), tx, ty, null);
			}
		}
		//y = 2/12 tiles

		// placing grass-to-road tiles for 1 layer
		for (int ty = 100; ty < 150; ty += 50){//just want to run this once
			for (int tx = 0; tx < WIDTH; tx += 50){
				g.drawImage(tiles.get(GTOROAD), tx, ty, null);
			}
		}
		//y = 3/12 tiles

		// placing Road tiles for 7 layers
		for (int ty = 150; ty < 500; ty += 50){
			for (int tx = 0; tx < WIDTH; tx += 50){
				g.drawImage(tiles.get(ROAD), tx, ty, null);
			}
		}
		//y = 10/12 tiles

		// placing road-to-grass tiles for 1 layer
		for (int ty = 500; ty < 550; ty += 50){
			for (int tx = 0; tx < WIDTH; tx += 50){
				g.drawImage(tiles.get(RTOGRASS), tx, ty, null);
			}
		}
		//y = 11/12 tiles

		// placing Grass tiles for 1 layer
		for (int ty = 550; ty < 600; ty += 50){
			for (int tx = 0; tx < WIDTH; tx += 50){
				g.drawImage(tiles.get(GRASS), tx, ty, null);
			}
		}
		//y = 12/12 tiles
		
	}	
}