package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class TickCmd extends Command 
{
	private GameWorld gw;
	
	public TickCmd(GameWorld gw)
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
