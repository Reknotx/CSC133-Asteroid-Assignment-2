package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;
import com.mycompany.a2.GameWorld.EntityType;

public class PlayerHitsAsteroidCmd extends Command 
{
	private GameWorld gw;
	
	public PlayerHitsAsteroidCmd(GameWorld gw)
	{
		super("Player collides with asteroid");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.Collision(EntityType.PLAYER, EntityType.ASTEROID);
		System.out.println("Player collides with asteroid");
	}
}
