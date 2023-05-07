package game;

import city.cs.engine.World;
import org.jbox2d.common.Vec2;
import javax.swing.Timer;
import java.awt.event.ActionListener;


public abstract class GameLevel extends World implements ActionListener {
    private Player player;
    private Enemy enemy;
    private Game game;
    private Timer timer;
    public GameLevel(Game game) {
        this.game = game;
        //make character with overlaid image
        player = new Player(this);
        player.setPosition(new Vec2(4, -10));
        player.setAlwaysOutline(false);
        player.addCollisionListener(new CoinPickup(player));
        player.addCollisionListener(new SpikeCollision(player));
        player.addCollisionListener(new LargeTrampolineJump(player));
        player.addCollisionListener(new SmallTrampolineJump(player));
        player.addCollisionListener(new ShipCollision(game));
        player.addCollisionListener(new EnemyCollision(player));
        player.setName("Pirate");

        Timer timer = new Timer(200, this);
        timer.setInitialDelay(100);
        timer.setRepeats(false); //timer fires once
        timer.start();

        if(player.getLives() <= 0 ){
            timer.stop();
        }
    }
    public Player getPlayer() {
        return player;
    }
}
