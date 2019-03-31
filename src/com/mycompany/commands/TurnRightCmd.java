package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class TurnRightCmd extends Command 
{
	private GameWorld gw;
	
	public TurnRightCmd(GameWorld gw)
	{
		super("Turn right");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.TurnPlayer(true);
		System.out.println("Turn right");
	}
}
