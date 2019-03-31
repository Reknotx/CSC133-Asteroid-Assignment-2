package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class AccelerateCmd extends Command 
{
	private GameWorld gw;
	
	public AccelerateCmd(GameWorld gw)
	{
		super("Accelerate");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.ChangeSpeed(true);
		System.out.println("Accelerate");
	}
}
