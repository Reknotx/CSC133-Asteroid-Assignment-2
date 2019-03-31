package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class AddPlayerCmd extends Command 
{
private GameWorld gw;
	
	public AddPlayerCmd(GameWorld gw)
	{
		super("Add player ship");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.SpawnPlayer();
		System.out.println("Add player ship");
	}
}
