package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;
import com.mycompany.a2.GameWorld.EntityType;

public class MissileKillsAsteroidCmd extends Command 
{
	private GameWorld gw;
	
	/**
	 * Creates a button command to kill asteroid with player missile
	 * @param gw - Reference to game world to invoke appropriate method
	 */
	public MissileKillsAsteroidCmd(GameWorld gw)
	{
		super("Missile destroys asteroid");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.DestroyEnemy(EntityType.ASTEROID);
		System.out.println("Missile destroys asteroid");
	}
}
