package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class FirePlayerMissileCommand extends Command 
{
	private GameWorld gw;
	
	public FirePlayerMissileCommand(GameWorld gw)
	{
		super("Fire player missile");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.FirePlayerMissile();
		System.out.println("Fire player missile");
	}
}
