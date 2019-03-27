package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;
import com.mycompany.a2.GameWorld.EntityType;

public class MissileKillsEnemyCommand extends Command 
{
	private GameWorld gw;
	
	public MissileKillsEnemyCommand(GameWorld gw)
	{
		super("Missile kills enemy");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.DestroyEnemy(EntityType.ENEMY);
		System.out.println("Missile kills enemy");
	}
}
