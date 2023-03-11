package window;

import city.cs.engine.*;
import city.cs.engine.Shape;

import org.jbox2d.common.Vec2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class GameWorld extends World implements ActionListener{
    private Player player;


    private int tCounter =0;

    private int x = 15;
    private int z = 0;


    private Timer timer;


    // private static final BodyImage chicken = new BodyImage("images/wood.jpeg");
    public GameWorld(){
        super();
        //make ground with overlaid image
        BodyImage LeftImage = new BodyImage("images/LPirate.png", 4);
        Shape shape = new BoxShape(10000000, 1f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -17.5f));
        ground.setName("Ground");

        // make platforms

        Shape platformShape1 = new BoxShape(13.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape1);
        platform1.setPosition(new Vec2(30, -5f));
        platform1.setName("Platform1");


        Shape platformShape2 = new BoxShape(13.5f, 0.5f);
        StaticBody platform2 = new StaticBody(this, platformShape2);
        platform2.setPosition(new Vec2(60, 8f));
        platform2.setName("Platform2");

        Shape platformShape3 = new BoxShape(10f, 0.5f);
        StaticBody platform3 = new StaticBody(this, platformShape3);
        platform3.setPosition(new Vec2(27, 24f));
        platform3.setName("Platform3");


        Shape platformShape4 = new BoxShape(13.5f, 17f);
        StaticBody platform4 = new StaticBody(this, platformShape4);
        platform4.setPosition(new Vec2(102, 0f));
        platform4.setName("Platform4");

        //make character with overlaid image
        player = new Player(this);
        player.setPosition(new Vec2(4, -10));
        this.player = player;
        player.setName("Pirate");

       // CoinPickup cp = new CoinPickup(character);
        CoinPickup cp = new CoinPickup(player);
        Coins c1 = new Coins(this);
        c1.setPosition(new Vec2(30F,3));

        //enemy near trampoline
        Enemy enemy = new Enemy(this);
        enemy.setPosition(new Vec2(72,0));

        //enemy near chest
        EnemyCollision em = new EnemyCollision(player); //so collision listener is acc activated
        Enemy enemy2 = new Enemy(this);
        enemy2.setPosition(new Vec2(24,36));
        player.addCollisionListener(em);

        SpikeCollision sp = new SpikeCollision(player);
        Spikes s = new Spikes(this);
        s.setPosition(new Vec2(90,19));
        player.addCollisionListener(sp);

        LargeTrampolineJump tj = new LargeTrampolineJump(player);
        LTrampoline tp = new LTrampoline(this);
        tp.setPosition(new Vec2(86,-15));
        player.addCollisionListener(tj);

        SmallTrampolineJump tj2 = new SmallTrampolineJump(player);
        STrampoline tp2 = new STrampoline(this);
        tp2.setPosition(new Vec2(50,10));
        player.addCollisionListener(tj2);


      //  Coins c2 = new Coins(this);
      //  c2.setPosition(new Vec2(12,2));
        player.addCollisionListener(cp);


        // Code to populate world omitted

        timer = new Timer(200, this);
        //timer.setInitialDelay(300);
        timer.start();

    }

    //new accessor for the character field
    public Player getCharacter(){
        return player;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //create coins
        tCounter++;
        Coins c = new Coins(this);
        c.setPosition(new Vec2(x,20));
        if (tCounter >= 0){
            x = x +20;
            z = z +40;
        }
    }
}

