package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;
import com.mycompany.a2.GameWorld.EntityType;

public class AsteroidHitsEnemyCmd extends Command 
{
	private GameWorld gw;
	
	public AsteroidHitsEnemyCmd(GameWorld gw)
	{
		super("Asteroid hits enemy ship");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.Collision(EntityType.ASTEROID, EntityType.ENEMY);
		System.out.println("Asteroid hits enemy ship");
	}
}
