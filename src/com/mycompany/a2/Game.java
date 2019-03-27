package com.mycompany.a2;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Button;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Border;
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
		Container buttonContainer = new Container();
		buttonContainer.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
//		buttonContainer.getAllStyles().setPaddingLeft(700);
		buttonContainer.getAllStyles().setBorder(Border.createLineBorder(2, ColorUtil.BLUE));
		/* Container creation end */
		
		/* Add asteroid button */
		Button addAsteroid = new Button();
		addAsteroid.setCommand(new AddAsteroidCommand(gw));
		buttonContainer.add(addAsteroid);
		/* Add asteroid button */

		/* Add enemy ship button */
		Button addEnemy = new Button();
		addEnemy.setCommand(new AddEnemyShipCommand(gw));
		buttonContainer.add(addEnemy);
		/* Add enemy ship button */
		
		/* Add space station button */
		Button addStation = new Button();
		addStation.setCommand(new AddSpaceStationCommand(gw));
		buttonContainer.add(addStation);
		/* Add space station button */
		
		/* Add player button */
		Button addPlayer = new Button();
		addPlayer.setCommand(new AddPlayerCommand(gw));
		buttonContainer.add(addPlayer);
		/* Add player button */
		
		/* Accelerate button */
		Button accelerate = new Button();
		AccelerateCommand accelCMD = new AccelerateCommand(gw);
		addKeyListener('w', accelCMD);
		addKeyListener(-91, accelCMD);
		accelerate.setCommand(accelCMD);
		buttonContainer.add(accelerate);
		/* Accelerate button */
		
		/* Decelerate button */
		Button decelerate = new Button();
		DecelerateCommand decelCMD = new DecelerateCommand(gw);
		addKeyListener('s', decelCMD);
		addKeyListener(-92, decelCMD);
		decelerate.setCommand(decelCMD);
		buttonContainer.add(decelerate);
		/* Decelerate button */
		
		/* Turn left button */
		Button turnLeft = new Button();
		TurnLeftCommand turnLCMD = new TurnLeftCommand(gw);
		addKeyListener('a', turnLCMD);
		addKeyListener(-93, turnLCMD);
		turnLeft.setCommand(turnLCMD);
		buttonContainer.add(turnLeft);
		/* Turn left button */
		
		/* Turn right button */
		Button turnRight = new Button();
		TurnRightCommand turnRCMD = new TurnRightCommand(gw);
		addKeyListener('d', turnRCMD);
		addKeyListener(-94, turnRCMD);
		turnRight.setCommand(new TurnRightCommand(gw));
		buttonContainer.add(turnRight);
		/* Turn right button */
		
		/* Turn launcher left button */
		Button launcherTurnLeft = new Button();
		LauncherTurnLeftCommand launcherLCMD = new LauncherTurnLeftCommand(gw);
		addKeyListener(44, launcherLCMD);
		launcherTurnLeft.setCommand(launcherLCMD);
		buttonContainer.add(launcherTurnLeft);
		/* Turn launcher left button */
		
		/* Turn launcher right button */
		Button launcherTurnRight = new Button();
		LauncherTurnRightCommand launcherRCMD = new LauncherTurnRightCommand(gw);
		addKeyListener(46, launcherRCMD);
		launcherTurnRight.setCommand(launcherRCMD);
		buttonContainer.add(launcherTurnRight);
		/* Turn launcher right button */
		
		/* Fire player missile button */
		Button playerFire = new Button();
		FirePlayerMissileCommand fireCMD = new FirePlayerMissileCommand(gw);
		addKeyListener(-90, fireCMD);
		playerFire.setCommand(fireCMD);
		buttonContainer.add(playerFire);
		/* Fire player missile button */
		
		/* Fire enemy missile button */
		Button enemyFire = new Button();
		enemyFire.setCommand(new FireEnemyMissileCommand(gw));
		buttonContainer.add(enemyFire);
		/* Fire enemy missile button */
		
		/* Jump button */
		Button jump = new Button();
		JumpCommand jumpCMD = new JumpCommand(gw);
		addKeyListener('j', jumpCMD);
		jump.setCommand(jumpCMD);
		buttonContainer.add(jump);
		/* Jump button */
		
		/* Reload button */
		Button reload = new Button();
		ReloadCommand reloadCMD = new ReloadCommand(gw);
		addKeyListener('r', reloadCMD);
		reload.setCommand(reloadCMD);
		buttonContainer.add(reload);
		/* Reload button */
		
		/* Player missile hits asteroid button */
		Button playerHitsAsteroid = new Button();
		playerHitsAsteroid.setCommand(new MissileKillsAsteroidCommand(gw));
		buttonContainer.add(playerHitsAsteroid);
		/* Player missile hits asteroid button */
		
		/* Player missile hits enemy button */
		Button playerHitsEnemy = new Button();
		playerHitsEnemy.setCommand(new MissileKillsEnemyCommand(gw));
		buttonContainer.add(playerHitsEnemy);
		/* Player missile hits enemy button */
		
		/* Enemy missile hits player button */
		Button enemyHitPlayer = new Button();
		enemyHitPlayer.setCommand(new EnemyMissileKillsPlayerCommand(gw));
		buttonContainer.add(enemyHitPlayer);
		/* Enemy missile hits player button */
		
		/* Player collides with asteroid button */
		Button playerCollidesWithAsteroid = new Button();
		playerCollidesWithAsteroid.setCommand(new PlayerHitsAsteroidCommand(gw));
		buttonContainer.add(playerCollidesWithAsteroid);
		/* Player collides with asteroid button */
		
		/* Player collides with enemy button */
		Button playerCollidesWithEnemy = new Button();
		playerCollidesWithEnemy.setCommand(new PlayerHitsEnemyCommand(gw));
		buttonContainer.add(playerCollidesWithEnemy);
		/* Player collides with enemy button */
		
		/* Asteroid collides with asteroid button */
		Button asteroidsCollide = new Button();
		asteroidsCollide.setCommand(new AsteroidHitsAsteroidCommand(gw));
		buttonContainer.add(asteroidsCollide);
		/* Asteroid collides with asteroid button */
		
		/* Asteroid collides with enemy button */
		Button asteroidCollidesWithEnemy = new Button();
		asteroidCollidesWithEnemy.setCommand(new AsteroidHitsEnemyCommand(gw));
		buttonContainer.add(asteroidCollidesWithEnemy);
		/* Asteroid collides with enemy button */
		
		/* Advance game clock button */
		Button advanceGameTime = new Button();
		advanceGameTime.setCommand(new TickCommand(gw));
		buttonContainer.add(advanceGameTime);
		/* Advance game clock button */
		
		
		for (Component b : buttonContainer) 
		{
			if (b instanceof Button)
			{
				StyleButton((Button) b);
			}
		}
		
		this.addComponent(BorderLayout.WEST, buttonContainer);
	}
	
	private void StyleButton(Button b)
	{
		//Make button cyan
		b.getAllStyles().setBgTransparency(255);
		b.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		b.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
		
		//set padding
//		b.getAllStyles().setPadding(TOP, 5);
//		b.getAllStyles().setPadding(BOTTOM, 5);
	}
}