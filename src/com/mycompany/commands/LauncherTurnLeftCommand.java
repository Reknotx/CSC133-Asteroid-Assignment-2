package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class LauncherTurnLeftCommand extends Command 
{
	private GameWorld gw;
	
	public LauncherTurnLeftCommand(GameWorld gw)
	{
		super("Rotate launcher left");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.RotateLauncher(-2);
		System.out.println("Rotate launcher left");
	}
}
