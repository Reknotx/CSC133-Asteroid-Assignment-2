package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class AddEnemyShipCmd extends Command 
{
private GameWorld gw;
	
	public AddEnemyShipCmd(GameWorld gw)
	{
		super("Add enemy ship");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.SpawnEnemy();
		System.out.println("Add enemy ship");
	}
}
