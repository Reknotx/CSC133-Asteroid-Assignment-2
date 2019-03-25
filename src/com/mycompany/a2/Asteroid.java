package com.mycompany.a2;

public class Asteroid extends MoveableGameObject
{
	private int size = 0;
	
	public Asteroid()
	{
		SetColor(255, 255, 0);
		this.size = rng.nextInt(25) + 6;
	}
	
	/**
	 * @return The size of the asteroid
	 */
	public int GetSize()
	{
		return size;
	}
	
	public String toString()
	{
		String parentString = super.toString();
		String thisString = " size = " + size;
		return "Asteroid: " + parentString + thisString;
	}
}
