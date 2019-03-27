package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class EnemyMissileKillsPlayerCommand extends Command 
{
	private GameWorld gw;
	
	public EnemyMissileKillsPlayerCommand(GameWorld gw)
	{
		super("Enemy missile hits player");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.KillPlayerWithEnemyMissile();
		System.out.println("Enemy missile hits player");
	}
}
