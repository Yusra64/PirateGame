package game;

import city.cs.engine.Shape;
import city.cs.engine.BoxShape;
import city.cs.engine.StaticBody;
import org.jbox2d.common.Vec2;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Level3 extends GameLevel{
    public Level3(Game game){
        super(game);

        //make ground
        Shape shape = new BoxShape(10000000, 1f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -13.5f));
        ground.setFillColor(new Color(92, 64, 51));
        ground.setLineColor(new Color(92, 64, 51));
        ground.setName("Ground");

        // make platforms
        Shape platformShape1 = new BoxShape(3f, 0.25f);
        StaticBody platform1 = new StaticBody(this, platformShape1);
        platform1.setPosition(new Vec2(32, -3f));
        platform1.setFillColor(new Color(92, 64, 51));
        platform1.setLineColor(new Color(92, 64, 51));
        platform1.setName("Platform1");


        Shape platformShape2 = new BoxShape(6f, 0.25f);
        StaticBody platform2 = new StaticBody(this, platformShape2);
        platform2.setPosition(new Vec2(47, 1f));
        platform2.setFillColor(new Color(92, 64, 51));
        platform2.setLineColor(new Color(92, 64, 51));
        platform2.setName("Platform2");

        Shape platformShape4 = new BoxShape(16f, 10f);
        StaticBody platform4 = new StaticBody(this, platformShape4);
        platform4.setPosition(new Vec2(77, -3f));
        platform4.setFillColor(new Color(92, 64, 51));
        platform4.setLineColor(new Color(92, 64, 51));
        platform4.setName("Platform4");

        Shape platformShape5 = new BoxShape(6f, 0.25f);
        StaticBody platform5 = new StaticBody(this, platformShape5);
        platform5.setPosition(new Vec2(120, 4f));
        platform5.setFillColor(new Color(92, 64, 51));
        platform5.setLineColor(new Color(92, 64, 51));
        platform5.setName("Platform5");

        Shape platformShape6 = new BoxShape(6f, 0.25f);
        StaticBody platform6 = new StaticBody(this, platformShape6);
        platform6.setPosition(new Vec2(150, 11f));
        platform6.setFillColor(new Color(92, 64, 51));
        platform6.setLineColor(new Color(92, 64, 51));
        platform6.setName("Platform6");

        Shape platformShape7 = new BoxShape(6f, 0.25f);
        StaticBody platform7 = new StaticBody(this, platformShape7);
        platform7.setPosition(new Vec2(120, 25f));
        platform7.setFillColor(new Color(92, 64, 51));
        platform7.setLineColor(new Color(92, 64, 51));
        platform7.setName("Platform7");

        Shape platformShape8 = new BoxShape(3.5f, 0.25f);
        StaticBody platform8 = new StaticBody(this, platformShape8);
        platform8.setPosition(new Vec2(149, 30f));
        platform8.setFillColor(new Color(92, 64, 51));
        platform8.setLineColor(new Color(92, 64, 51));
        platform8.setName("Platform8");

        Shape platformShape9 = new BoxShape(15f, 0.25f);
        StaticBody platform9 = new StaticBody(this, platformShape9);
        platform9.setPosition(new Vec2(185, 26f));
        platform9.setFillColor(new Color(92, 64, 51));
        platform9.setLineColor(new Color(92, 64, 51));
        platform9.setName("Platform9");

        Shape platformShape10 = new BoxShape(50f, 0.25f);
        StaticBody platform10 = new StaticBody(this, platformShape10);
        platform10.setPosition(new Vec2(243, 26f));
        platform10.setFillColor(new Color(92, 64, 51));
        platform10.setLineColor(new Color(92, 64, 51));
        platform10.setName("Platform10");

        Shape platformShape11 = new BoxShape(3f, 0.25f);
        StaticBody platform11 = new StaticBody(this, platformShape11);
        platform11.setPosition(new Vec2(20, -8f));
        platform11.setFillColor(new Color(92, 64, 51));
        platform11.setLineColor(new Color(92, 64, 51));
        platform11.setName("Platform11");

        UpDownLift lift = new UpDownLift(this);
        lift.setFillColor(new Color(92, 64, 51));
        lift.setLineColor(new Color(92, 64, 51));
        lift.setPosition(new Vec2(100,0));

        UpDownLift lift2 = new UpDownLift(this);
        lift2.setFillColor(new Color(92, 64, 51));
        lift2.setLineColor(new Color(92, 64, 51));
        lift2.setPosition(new Vec2(135,10));

        UpDownLift lift3 = new UpDownLift(this);
        lift3.setFillColor(new Color(92, 64, 51));
        lift3.setLineColor(new Color(92, 64, 51));
        lift3.setPosition(new Vec2(165,10));

        Ship ship = new Ship(this);
        ship.setPosition(new Vec2(200,28f));

        Spikes spikes = new Spikes(this);
        spikes.setPosition(new Vec2(63,9f));

        Spikes spikes2 = new Spikes(this);
        spikes2.setPosition(new Vec2(179,28f));

        Spikes spikes3 = new Spikes(this);
        spikes3.setPosition(new Vec2(176,28f));

        Spikes spikes4 = new Spikes(this);
        spikes4.setPosition(new Vec2(66,9f));

        //chest next to first enemy
        Treasure treasure = new Treasure(this);
        treasure.setPosition(new Vec2(95,-11));

        Treasure treasure2 = new Treasure(this);
        treasure2.setPosition(new Vec2(150,32f));

        Treasure treasure3 = new Treasure(this);
        treasure3.setPosition(new Vec2(182,28f));

        Treasure treasure4 = new Treasure(this);
        treasure4.setPosition(new Vec2(125,27f));

        LTrampoline tp = new LTrampoline(this);
        tp.setAlwaysOutline(false);
        tp.setPosition(new Vec2(59,-11));

        STrampoline tp2 = new STrampoline(this);
        tp2.setPosition(new Vec2(51,2));

        Enemy enemy = new Enemy(this);
        enemy.setPosition(new Vec2(80,9f));

        Enemy enemy2 = new Enemy(this);
        enemy2.setPosition(new Vec2(116,35f));

        Enemy enemy3 = new Enemy(this);
        enemy3.setPosition(new Vec2(150,20f));

        for(int i = 0; i<50;i++){
            Coins c = new Coins(this);
            c.setPosition(new Vec2(0+(i*8),100));
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
