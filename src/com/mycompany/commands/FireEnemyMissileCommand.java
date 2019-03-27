package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class FireEnemyMissileCommand extends Command 
{
	private GameWorld gw;
	
	public FireEnemyMissileCommand(GameWorld gw)
	{
		super("Fire enemy missile");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.FireEnemymissile();
		System.out.println("Fire enemy missile");
	}
}
