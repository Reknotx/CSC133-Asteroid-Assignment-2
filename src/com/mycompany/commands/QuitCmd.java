package com.mycompany.commands;

import com.codename1.ui.Command;
import com.codename1.ui.Dialog;
import com.codename1.ui.events.ActionEvent;

public class QuitCmd extends Command 
{
	public QuitCmd()
	{
		super("Quit");
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (Dialog.show("Quit", "Are you sure you want to quit?", "Yes", "No"))
		{
			System.exit(0);
		}
	}
}
