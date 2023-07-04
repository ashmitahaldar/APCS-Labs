//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Font;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.ArrayList;

public class Enemies 
{
	private ArrayList<Enemy> enemies;
	private Person guy;
	private boolean collided = false;
	private final int POSUPPERLIMIT = 150, POSLOWERLIMIT = 500, SPEEDLOWERLIMIT = 4, SPEEDUPPERLIMIT = 20;
	
	public Enemies(Person p)
	{
		enemies = new ArrayList<Enemy>();
		guy = p;		
	}
	
	// DRAW AND COLLISION METHOD
	public void drawAndCollision(Graphics2D g) throws IOException
	{
		// ADD ENEMIES
		while (enemies.size() < 8){
			addEnemy();
		}
		
		// REMOVE ENEMIES THAT GO OUT OF BOUND
		for (int i = 0; i < enemies.size(); i++){
			if (enemies.get(i).getX() > 600){
				enemies.remove(i);
				i--;
			}
		}
		
		// GO THROUGH THE LIST OF ENEMIES AND CALL THEIR draw() and move() method and check if their collide with guy if so then call the GAMEOVER() METHOD
		for (Enemy e : enemies){
			e.move();
			e.draw(g);
			if (guy.collide(e.getX(), e.getY())){
				collided = true;
			}
		}

		
		// IF THE PLAYER REACHES THE GRASS ON THE BOTTOM SIDE CALL THE VICTORY() method	
		if (collided){
			GAMEOVER(g);
		} else if (guy.getY() > 500){ // if player passes the road and gets to the other side of grass
			VICTORY(g);
		}
	}
	
	public void GAMEOVER(Graphics2D g)
	{
		Game.RUNNING = false;
		Font f = new Font("Dialog", Font.PLAIN, 24);
		g.setFont(f);
		g.drawString("GAME OVER!", 400, 300);
	}
	
	public void VICTORY(Graphics2D g)
	{
		Font f = new Font("Dialog", Font.PLAIN, 24);
		g.setFont(f);
		g.drawString("VICTORY!", 400, 300);
		Game.RUNNING = false;
	}
	
	// ADDS AN ENEMY TO THE ENEMY LIST
	public void addEnemy() throws IOException
	{
		int eSpeed = (int)(Math.random()*(SPEEDUPPERLIMIT - SPEEDLOWERLIMIT) + SPEEDLOWERLIMIT);
		int yPos = (int)(Math.random()*(POSUPPERLIMIT - POSLOWERLIMIT) + POSLOWERLIMIT);
		int xPos = 0;
		enemies.add(new Enemy(xPos, yPos, eSpeed));	
	}
	
	// RETURN HOW MANY ENEMIES THERE ARE
	public int numEnemies()
	{
		return enemies.size();
	}
}
