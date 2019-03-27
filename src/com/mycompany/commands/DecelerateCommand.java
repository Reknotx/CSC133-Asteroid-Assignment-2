package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class DecelerateCommand extends Command 
{
	private GameWorld gw;
	
	public DecelerateCommand(GameWorld gw)
	{
		super("Decelerate");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.ChangeSpeed(false);
		System.out.println("Decelerate");
	}
}
