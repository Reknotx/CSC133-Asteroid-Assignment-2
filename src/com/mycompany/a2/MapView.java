package com.mycompany.a2;

import java.util.Observable;
import java.util.Observer;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Container;
import com.codename1.ui.plaf.Border;

//View in MVC architecture
public class MapView extends Container implements Observer 
{
	
	public MapView() 
	{
		this.getAllStyles().setBorder(Border.createLineBorder(2, ColorUtil.GREEN));
	}

	@Override
	public void update(Observable observable, Object data) 
	{
		
	}

}
