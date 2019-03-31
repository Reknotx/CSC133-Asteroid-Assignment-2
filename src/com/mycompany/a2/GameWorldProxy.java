package com.mycompany.a2;

import java.util.Observable;

public class GameWorldProxy extends Observable implements IGameWorld 
{
	private GameWorld gwp;
	
	public GameWorldProxy(GameWorld gw)
	{
		gwp = gw;
	}

	@Override
	public int getPoints() 
	{
		return gwp.getPoints();
	}

	@Override
	public int getMissileCount() 
	{
		return gwp.getMissileCount();
	}

	@Override
	public int getTime() 
	{
		return gwp.getTime();
	}

	@Override
	public int getLives() 
	{
		return gwp.getLives();
	}

	@Override
	public boolean getSoundSetting() 
	{
		return gwp.getSoundSetting();
	}

	@Override
	public GameCollection getCollection() 
	{
		return gwp.getCollection();
	}
}
