package com.mycompany.views;

import java.util.Observable;
import java.util.Observer;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Container;
import com.codename1.ui.TextArea;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.Border;
import com.mycompany.a2.GameWorldProxy;
import com.mycompany.interfaces.IIterator;

//View in MVC architecture
public class MapView extends Container implements Observer 
{
	TextArea gameText;
	
	public MapView() 
	{
		this.getAllStyles().setBorder(Border.createLineBorder(2, ColorUtil.GREEN));
		this.setLayout(new BorderLayout());
		gameText = new TextArea();
		gameText.setEditable(false);
		gameText.getAllStyles().setBgTransparency(0);
		
		this.add(BorderLayout.NORTH, gameText);
	}

	@Override
	public void update(Observable observable, Object data) 
	{
		GameWorldProxy tempProxy = (GameWorldProxy) data;
		IIterator iterator = tempProxy.getCollection().getIterator();
		String fullText = "";
		
		while (iterator.hasNext())
		{
			fullText += iterator.getNext().toString() + "\n";
		}
		gameText.setText(fullText);
		this.repaint();
	}
}
