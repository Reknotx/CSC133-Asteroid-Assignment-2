package com.mycompany.commands;

import com.codename1.ui.CheckBox;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class SoundCmd extends Command 
{
	private CheckBox cb;
	private GameWorld gw;
	
	public SoundCmd(GameWorld gw, CheckBox cb)
	{
		super("Sound ON/OFF");
		this.gw = gw;
		this.cb = cb;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (cb.isSelected())
		{
			System.out.println("Sound turned on");
		}
		else
		{
			System.out.println("Sound turned off");
		}
		gw.changeSoundSetting();
	}
}
