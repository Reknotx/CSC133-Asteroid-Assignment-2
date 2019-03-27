package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class AddSpaceStationCommand extends Command 
{
	private GameWorld gw;
	
	public AddSpaceStationCommand(GameWorld gw)
	{
		super("Add space station");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.SpawnStation();
		System.out.println("Add space station");
	}
}
