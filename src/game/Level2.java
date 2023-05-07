package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import org.jbox2d.common.Vec2;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Level2 extends GameLevel{
    public Level2(Game game) {
        super(game);
        Shape shape = new BoxShape(10000000, 1f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -13.5f));
        ground.setFillColor(new Color(92, 64, 51));
        ground.setLineColor(new Color(92, 64, 51));
        ground.setName("Ground");

        // make platforms
        Shape platformShape1 = new BoxShape(2f, 0.25f);
        StaticBody platform1 = new StaticBody(this, platformShape1);
        platform1.setPosition(new Vec2(10, -7f));
        platform1.setFillColor(new Color(92, 64, 51));
        platform1.setLineColor(new Color(92, 64, 51));
        platform1.setName("Platform1");

        Shape platformShape2 = new BoxShape(5f, 0.25f);
        StaticBody platform2 = new StaticBody(this, platformShape2);
        platform2.setPosition(new Vec2(20, -2f));
        platform2.setFillColor(new Color(92, 64, 51));
        platform2.setLineColor(new Color(92, 64, 51));
        platform2.setName("Platform2");

        Shape platformShape3 = new BoxShape(2f, 0.25f);
        StaticBody platform3 = new StaticBody(this, platformShape3);
        platform3.setPosition(new Vec2(7, 3f));
        platform3.setFillColor(new Color(92, 64, 51));
        platform3.setLineColor(new Color(92, 64, 51));
        platform3.setName("Platform3");

        Shape platformShape4 = new BoxShape(2f, 0.25f);
        StaticBody platform4 = new StaticBody(this, platformShape4);
        platform4.setPosition(new Vec2(17, 7f));
        platform4.setFillColor(new Color(92, 64, 51));
        platform4.setLineColor(new Color(92, 64, 51));
        platform4.setName("Platform4");

        Shape platformShape5 = new BoxShape(1f, 0.25f);
        StaticBody platform5 = new StaticBody(this, platformShape5);
        platform5.setPosition(new Vec2(24, 10f));
        platform5.setFillColor(new Color(92, 64, 51));
        platform5.setLineColor(new Color(92, 64, 51));
        platform5.setName("Platform5");

        Shape platformShape6 = new BoxShape(5f, 0.25f);
        StaticBody platform6 = new StaticBody(this, platformShape6);
        platform6.setPosition(new Vec2(50, 10f));
        platform6.setFillColor(new Color(92, 64, 51));
        platform6.setLineColor(new Color(92, 64, 51));
        platform6.setName("Platform6");

        Shape platformShape7 = new BoxShape(5f, 0.25f);
        StaticBody platform7 = new StaticBody(this, platformShape7);
        platform7.setPosition(new Vec2(77, 20f));
        platform7.setFillColor(new Color(92, 64, 51));
        platform7.setLineColor(new Color(92, 64, 51));
        platform7.setName("Platform7");

        Shape platformShape8 = new BoxShape(50f, 0.25f);
        StaticBody platform8 = new StaticBody(this, platformShape8);
        platform8.setPosition(new Vec2(137, 29f));
        platform8.setFillColor(new Color(92, 64, 51));
        platform8.setLineColor(new Color(92, 64, 51));
        platform8.setName("Platform8");

        Shape platformShape9 = new BoxShape(2f, 0.25f);
        StaticBody platform9 = new StaticBody(this, platformShape9);
        platform9.setPosition(new Vec2(111, 34f));
        platform9.setFillColor(new Color(92, 64, 51));
        platform9.setLineColor(new Color(92, 64, 51));
        platform9.setName("Platform9");

        UpDownLift lift = new UpDownLift(this);
        lift.setFillColor(new Color(92, 64, 51));
        lift.setLineColor(new Color(92, 64, 51));
        lift.setPosition(new Vec2(35,0));

        UpDownLift lift2 = new UpDownLift(this);
        lift2.setFillColor(new Color(92, 64, 51));
        lift2.setLineColor(new Color(92, 64, 51));
        lift2.setPosition(new Vec2(65,0));

        Arrow arrow = new Arrow(this);
        arrow.setPosition(new Vec2(-5,-12));

        Enemy enemy = new Enemy(this);
        enemy.setPosition(new Vec2(22,0f));

        Enemy enemy2 = new Enemy(this);
        enemy2.setPosition(new Vec2(94,38f));

        Treasure treasure = new Treasure(this);
        treasure.setPosition(new Vec2(7,5f));

        Treasure treasure2 = new Treasure(this);
        treasure2.setPosition(new Vec2(50,12f));

        Treasure treasure3 = new Treasure(this);
        treasure3.setPosition(new Vec2(101,31f));

        STrampoline st = new STrampoline(this);
        st.setAlwaysOutline(false);
        st.setPosition(new Vec2(79,21f));

        Spikes spikes = new Spikes(this);
        spikes.setPosition(new Vec2(104,31f));

        Spikes spikes2 = new Spikes(this);
        spikes2.setPosition(new Vec2(107,31f));

        Spikes spikes3 = new Spikes(this);
        spikes3.setPosition(new Vec2(110,31f));

        Spikes spikes4 = new Spikes(this);
        spikes4.setPosition(new Vec2(113,31f));

        Spikes spikes5 = new Spikes(this);
        spikes5.setPosition(new Vec2(116,31f));

        Spikes spikes6 = new Spikes(this);
        spikes6.setPosition(new Vec2(119,31f));

        Ship ship = new Ship(this);
        ship.setPosition(new Vec2(143,35f));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
