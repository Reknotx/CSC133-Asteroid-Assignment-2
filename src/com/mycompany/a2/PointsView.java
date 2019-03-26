package com.mycompany.a2;

import java.util.Observable;
import java.util.Observer;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;

//View in MVC architecture
public class PointsView extends Container implements Observer 
{
	private Label pointsValue;
	private Label missileCountNum;
	private Label elapsedTimeNum;
	private Label soundSetting;
	private Label livesRemaining;
	
	public PointsView() 
	{
		this.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		this.add(SetUpPoints());
		this.add(SetUpMissileCount());
		this.add(SetUpTime());
		this.add(SetUpSound());
		this.add(SetUpLives());
	}

	@Override
	public void update(Observable observable, Object data) 
	{
		
	}
	
	private Container SetUpPoints()
	{
		Label pointsText = new Label("Points:");
		pointsText.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		
		pointsValue = new Label("0");
		
		Container pointsContainer = new Container();
		pointsContainer.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		
		pointsContainer.add(pointsText);
		pointsContainer.add(pointsValue);
		
		return pointsContainer;
	}

	private Container SetUpMissileCount()
	{
		Label missileText = new Label("Missile count:");
		missileText.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		
		missileCountNum = new Label("0");
		
		Container missileContainer = new Container();
		missileContainer.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		
		missileContainer.add(missileText);
		missileContainer.add(missileCountNum);
		
		return missileContainer;
	}
	
	private Container SetUpTime()
	{
		Label timeText = new Label("Elapsed time:");
		timeText.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		
		elapsedTimeNum = new Label("0");
		
		Container timeContainer = new Container();
		timeContainer.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		
		timeContainer.add(timeText);
		timeContainer.add(elapsedTimeNum);
		
		return timeContainer;
	}
	
	private Container SetUpSound()
	{
		Label soundText = new Label("Sound:");
		soundText.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		
		soundSetting = new Label("OFF");
		
		Container soundContainer = new Container();
		soundContainer.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		
		soundContainer.add(soundText);
		soundContainer.add(soundSetting);
		
		return soundContainer;
	}
	
	private Container SetUpLives()
	{
		Label livesText = new Label("Lives:");
		livesText.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		
		livesRemaining = new Label("0");
		
		Container livesContainer = new Container();
		livesContainer.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		
		livesContainer.add(livesText);
		livesContainer.add(livesRemaining);
		
		return livesContainer;
	}
}
