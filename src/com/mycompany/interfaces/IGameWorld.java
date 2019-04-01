package com.mycompany.interfaces;

import com.mycompany.a2.GameCollection;

public interface IGameWorld 
{
	public int getPoints();
	
	public int getMissileCount();
	
	public int getTime();
	
	public int getLives();

	public boolean getSoundSetting();
	
	public GameCollection getCollection();
}
