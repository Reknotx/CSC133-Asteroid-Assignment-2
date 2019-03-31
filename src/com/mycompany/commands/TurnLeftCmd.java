package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class TurnLeftCmd extends Command 
{
	private GameWorld gw;
	
	public TurnLeftCmd(GameWorld gw)
	{
		super("Turn left");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.TurnPlayer(false);
		System.out.println("Turn left");
	}
}
