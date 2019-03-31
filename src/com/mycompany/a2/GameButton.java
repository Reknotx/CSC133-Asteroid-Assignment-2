package com.mycompany.a2;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.plaf.Border;

public class GameButton extends Button 
{
	public GameButton(Command cmd)
	{		
		this.getAllStyles().setBgTransparency(255);
		this.getAllStyles().setBorder(Border.createBevelRaised());
		this.getAllStyles().setBorder(Border.createBevelLowered());
		this.getAllStyles().setBorder(Border.createDoubleBorder(2, ColorUtil.BLACK	));
//  		this.getAllStyles().setPadding(TOP, 1);
//  		this.getAllStyles().setPadding(BOTTOM, 1);
  		this.getAllStyles().setMargin(TOP, 1);
  		this.getAllStyles().setMargin(BOTTOM, 1);
  		
		this.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		this.getUnselectedStyle().setFgColor(ColorUtil.BLUE);
		
		this.getPressedStyle().setBgTransparency(255/2);
		this.getPressedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		this.getPressedStyle().setFgColor(ColorUtil.BLUE);
		
		this.getSelectedStyle().setBgTransparency(255/2);
		this.getSelectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		this.getSelectedStyle().setFgColor(ColorUtil.BLUE);
		
		this.getDisabledStyle().setBgTransparency(255);
		this.getDisabledStyle().setBgColor(ColorUtil.GRAY);
		this.getDisabledStyle().setFgColor(ColorUtil.BLUE);
		this.getDisabledStyle().setStrikeThru(true);
		
		this.setCommand(cmd);
	}
}
