package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class JumpCommand extends Command 
{
	private GameWorld gw;
	
	public JumpCommand(GameWorld gw)
	{
		super("Hyperspace jump");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.ResetPosition();
		System.out.println("Hyperspace jump");
	}
}
