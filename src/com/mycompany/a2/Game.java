package com.mycompany.a2;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.mycompany.commands.*;

//Game is the Controller in MVC architecture
public class Game extends Form 
{
	private GameWorld gw;
	private MapView mv;
	private PointsView pv;
	
	public Game()
	{
		this.setLayout(new BorderLayout());
		this.setScrollable(false);

		gw = new GameWorld();
		mv = new MapView();
		pv = new PointsView();
		
		//Register the observers
		gw.addObserver(mv);
		gw.addObserver(pv);
		
		SetUpCommands();
		this.addComponent(BorderLayout.CENTER, mv);
		this.addComponent(BorderLayout.NORTH, pv);
		
		gw.init();
		this.show();
	}
	
	private void SetUpCommands()
	{
		/* Container creation start */
		Container buttonContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
		Label cmdLBL = new Label("Commands");
		buttonContainer.add(cmdLBL);
		/* Container creation end */
		
		/* Add asteroid button */
		AddAsteroidCommand asteroidCMD = new AddAsteroidCommand(gw);
		GameButton addAsteroid = new GameButton(asteroidCMD);
		buttonContainer.add(addAsteroid);
		/* Add asteroid button */

		/* Add enemy ship button */
		AddEnemyShipCommand addEnemyCMD = new AddEnemyShipCommand(gw);
		GameButton addEnemy = new GameButton(addEnemyCMD);
		buttonContainer.add(addEnemy);
		/* Add enemy ship button */
		
		/* Add space station button */
		AddSpaceStationCommand addStationCMD = new AddSpaceStationCommand(gw);
		GameButton addStation = new GameButton(addStationCMD);
		buttonContainer.add(addStation);
		/* Add space station button */
		
		/* Add player button */
		AddPlayerCommand addPlayerCMD = new AddPlayerCommand(gw);
		GameButton addPlayer = new GameButton(addPlayerCMD);
		buttonContainer.add(addPlayer);
		/* Add player button */
		
		/* Accelerate button */
		AccelerateCommand accelCMD = new AccelerateCommand(gw);
		GameButton accelerate = new GameButton(accelCMD);
		addKeyListener('w', accelCMD);
		addKeyListener(-91, accelCMD);
		buttonContainer.add(accelerate);
		/* Accelerate button */
		
		/* Decelerate button */
		DecelerateCommand decelCMD = new DecelerateCommand(gw);
		GameButton decelerate = new GameButton(decelCMD);
		addKeyListener('s', decelCMD);
		addKeyListener(-92, decelCMD);
		buttonContainer.add(decelerate);
		/* Decelerate button */
		
		/* Turn left button */
		TurnLeftCommand turnLCMD = new TurnLeftCommand(gw);
		GameButton turnLeft = new GameButton(turnLCMD);
		addKeyListener('a', turnLCMD);
		addKeyListener(-93, turnLCMD);
		buttonContainer.add(turnLeft);
		/* Turn left button */
		
		/* Turn right button */
		TurnRightCommand turnRCMD = new TurnRightCommand(gw);
		GameButton turnRight = new GameButton(turnRCMD);
		addKeyListener('d', turnRCMD);
		addKeyListener(-94, turnRCMD);
		buttonContainer.add(turnRight);
		/* Turn right button */
		
		/* Turn launcher left button */
		LauncherTurnLeftCommand launcherLCMD = new LauncherTurnLeftCommand(gw);
		GameButton launcherTurnLeft = new GameButton(launcherLCMD);
		addKeyListener(44, launcherLCMD);
		buttonContainer.add(launcherTurnLeft);
		/* Turn launcher left button */
		
		/* Turn launcher right button */
		LauncherTurnRightCommand launcherRCMD = new LauncherTurnRightCommand(gw);
		GameButton launcherTurnRight = new GameButton(launcherRCMD);
		addKeyListener(46, launcherRCMD);
		buttonContainer.add(launcherTurnRight);
		/* Turn launcher right button */
		
		/* Fire player missile button */
		FirePlayerMissileCommand fireCMD = new FirePlayerMissileCommand(gw);
		GameButton playerFire = new GameButton(fireCMD);
		addKeyListener(-90, fireCMD);
		buttonContainer.add(playerFire);
		/* Fire player missile button */
		
		/* Fire enemy missile button */
		FireEnemyMissileCommand enemyFireCMD = new FireEnemyMissileCommand(gw);
		GameButton enemyFire = new GameButton(enemyFireCMD);
		buttonContainer.add(enemyFire);
		/* Fire enemy missile button */
		
		/* Jump button */
		JumpCommand jumpCMD = new JumpCommand(gw);
		GameButton jump = new GameButton(jumpCMD);
		addKeyListener('j', jumpCMD);
		buttonContainer.add(jump);
		/* Jump button */
		
		/* Reload button */
		ReloadCommand reloadCMD = new ReloadCommand(gw);
		GameButton reload = new GameButton(reloadCMD);
		addKeyListener('r', reloadCMD);
		buttonContainer.add(reload);
		/* Reload button */
		
		/* Player missile hits asteroid button */
		MissileKillsAsteroidCommand playerShootAsteroidCMD = new MissileKillsAsteroidCommand(gw);
		GameButton playerShootsAsteroid = new GameButton(playerShootAsteroidCMD);
		buttonContainer.add(playerShootsAsteroid);
		/* Player missile hits asteroid button */
		
		/* Player missile hits enemy button */
		MissileKillsEnemyCommand playerShootEnemyCMD = new MissileKillsEnemyCommand(gw);
		GameButton playerShootsEnemy = new GameButton(playerShootEnemyCMD);
		buttonContainer.add(playerShootsEnemy);
		/* Player missile hits enemy button */
		
		/* Enemy missile hits player button */
		EnemyMissileKillsPlayerCommand enemyShootPlayerCMD = new EnemyMissileKillsPlayerCommand(gw);
		GameButton enemyShootsPlayer = new GameButton(enemyShootPlayerCMD);
		buttonContainer.add(enemyShootsPlayer);
		/* Enemy missile hits player button */
		
		/* Player collides with asteroid button */
		PlayerHitsAsteroidCommand playerHitAsteroidCMD = new PlayerHitsAsteroidCommand(gw);
		GameButton playerCollidesWithAsteroid = new GameButton(playerHitAsteroidCMD);
		buttonContainer.add(playerCollidesWithAsteroid);
		/* Player collides with asteroid button */
		
		/* Player collides with enemy button */
		PlayerHitsEnemyCommand playerHitEnemyCMD = new PlayerHitsEnemyCommand(gw);
		GameButton playerCollidesWithEnemy = new GameButton(playerHitEnemyCMD);
		buttonContainer.add(playerCollidesWithEnemy);
		/* Player collides with enemy button */
		
		/* Asteroid collides with asteroid button */
		AsteroidHitsAsteroidCommand asteroidHitAsteroidCMD = new AsteroidHitsAsteroidCommand(gw);
		GameButton asteroidsCollide = new GameButton(asteroidHitAsteroidCMD);
		buttonContainer.add(asteroidsCollide);
		/* Asteroid collides with asteroid button */
		
		/* Asteroid collides with enemy button */
		AsteroidHitsEnemyCommand asteroidHitEnemyCMD = new AsteroidHitsEnemyCommand(gw);
		GameButton asteroidCollidesWithEnemy = new GameButton(asteroidHitEnemyCMD);
		buttonContainer.add(asteroidCollidesWithEnemy);
		/* Asteroid collides with enemy button */
		
		/* Advance game clock button */
		TickCommand tickCMD = new TickCommand(gw);
		GameButton advanceGameTime = new GameButton(tickCMD);
		buttonContainer.add(advanceGameTime);
		/* Advance game clock button */
		
		this.addComponent(BorderLayout.WEST, buttonContainer);
	}
}