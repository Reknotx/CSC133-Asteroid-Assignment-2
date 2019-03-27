package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class ReloadCommand extends Command 
{
	private GameWorld gw;
	
	public ReloadCommand(GameWorld gw)
	{
		super("Reload missiles");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.ReloadMissiles();
		System.out.println("Reload missiles");
	}
}
