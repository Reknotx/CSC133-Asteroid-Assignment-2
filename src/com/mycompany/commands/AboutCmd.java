package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.Dialog;
import com.codename1.ui.events.ActionEvent;

public class AboutCmd extends Command 
{
	public AboutCmd() 
	{
		super("About");
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String info = "Chase O'Connor\nAsteroid Assignment\nVersion 2.0";
		Dialog.show("About", info, "Ok", null);
	}
}
