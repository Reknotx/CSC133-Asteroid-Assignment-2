package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class TickCommand extends Command 
{
	private GameWorld gw;
	
	public TickCommand(GameWorld gw)
	{
		super("Advance game clock");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.AdvanceGameClock();
		System.out.println("Advance game clock");
	}
}
