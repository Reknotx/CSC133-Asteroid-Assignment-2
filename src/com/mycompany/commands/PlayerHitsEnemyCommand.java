package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;
import com.mycompany.a2.GameWorld.EntityType;

public class PlayerHitsEnemyCommand extends Command 
{
	private GameWorld gw;
	
	public PlayerHitsEnemyCommand(GameWorld gw)
	{
		super("Player hits enemy ship");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.Collision(EntityType.PLAYER, EntityType.ENEMY);
		System.out.println("Player hits enemy ship");
	}
}
