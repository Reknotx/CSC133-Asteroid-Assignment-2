package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class AddAsteroidCommand extends Command
{
	private GameWorld gw;
	
	public AddAsteroidCommand(GameWorld gw)
	{
		super("Add asteroid");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.SpawnAsteroid();
		System.out.println("Add asteroid");
	}
}
