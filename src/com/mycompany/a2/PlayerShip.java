package com.mycompany.a2;

public class PlayerShip extends Ship implements ISteerable
{
	private MissileLauncher launcher;
	
	public PlayerShip()
	{
		super(10);
		launcher = new MissileLauncher(0);
		SetLocation(512.0, 384.0);
		SetSpeed(0);
		SetDirection(0);
		SetColor(0, 255, 255);
	}
	
	/**
	 * 
	 * @return the direction of the launcher on ship
	 */
	public int GetLauncherDir()
	{
		return launcher.GetLauncherDir();
	}
	
	/**
	 * Refill player missile silo back to full
	 */
	public void Reload()
	{
		super.SetMissileCount(10);
	}
	
	/**
	 * Resets the player's position in the gameworld back to spawn.
	 */
	public void ResetPosition()
	{
		SetLocation(512.0, 384.0);
	}
	
	/**
	 * 
	 * @param increase - if true increase the speed of ship, decrease if false
	 */
	public void AdjustSpeed(boolean increase)
	{
		if (increase && GetSpeed() < 15)
		{
			//Increase speed
			SetSpeed(GetSpeed() + 1);
		}
		else if (!increase && GetSpeed() > 0)
		{
			//Decrease speed
			SetSpeed(GetSpeed() - 1);
		}
	}
	
	@Override
	public void Steer(int amount) 
	{
		if (GetDirection() == 0 && amount < 0)
		{
			SetDirection(359);
		}
		else
		{
			SetDirection(GetDirection() + amount);			
		}
	}
	
	/**
	 * @param amount - value to change the launcher direction by
	 */
	public void ChangeLauncherDir(int amount)
	{
		launcher.Steer(amount);
	}

	public String toString()
	{
		String parentString = super.toString();
		return "Player Ship: " + parentString + launcher.toString();
	}
}
