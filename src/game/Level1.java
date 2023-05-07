package game;


import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import org.jbox2d.common.Vec2;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Level1 extends GameLevel {
    private Player player;
    private Game game;

    public Level1(Game game) {
        super(game);
        //make ground
        this.game = game;

        {
            //makes pop up start screen before level 1
            final JFrame parent = new JFrame();
            JButton button = new JButton();
            parent.add(button);
            parent.pack();
            parent.setVisible(true);
            button.setIcon(new ImageIcon("images/PiratesGameScreen.png"));
            parent.setBounds(300, 60, 800, 640);
            parent.setAlwaysOnTop(true);
            button.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    parent.dispose();
                }
            });
        }

        Shape shape = new BoxShape(10000000, 1f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -17.5f));
        ground.setFillColor(new Color(92, 64, 51));
        ground.setLineColor(new Color(92, 64, 51));
        ground.setName("Ground");

        Spikes spikes = new Spikes(this);
        spikes.setPosition(new Vec2(25, -15));

        Spikes spikes2 = new Spikes(this);
        spikes2.setPosition(new Vec2(28, -15));

        Spikes spikes8 = new Spikes(this);
        spikes8.setPosition(new Vec2(31, -15));

        // make platforms

        Shape platformShape1 = new BoxShape(3 / 2f, 0.15f);
        StaticBody platform1 = new StaticBody(this, platformShape1);
        platform1.setPosition(new Vec2(20, -12));
        platform1.setFillColor(new Color(92, 64, 51));
        platform1.setLineColor(new Color(92, 64, 51));
        platform1.setName("Platform1");

        Shape platformShape2 = new BoxShape(5f, 0.25f);
        StaticBody platform2 = new StaticBody(this, platformShape2);
        platform2.setPosition(new Vec2(40, -2));
        platform2.setFillColor(new Color(92, 64, 51));
        platform2.setLineColor(new Color(92, 64, 51));
        platform2.setName("Platform2");

        Shape platformShape3 = new BoxShape(4f, 0.25f);
        StaticBody platform3 = new StaticBody(this, platformShape3);
        platform3.setPosition(new Vec2(50, 8));
        platform3.setFillColor(new Color(92, 64, 51));
        platform3.setLineColor(new Color(92, 64, 51));
        platform3.setName("Platform3");

        Shape platformShape4 = new BoxShape(8f, 0.25f);
        StaticBody platform4 = new StaticBody(this, platformShape4);
        platform4.setPosition(new Vec2(63, 2));
        platform4.setFillColor(new Color(92, 64, 51));
        platform4.setLineColor(new Color(92, 64, 51));
        platform4.setName("Platform4");

        Shape platformShape5 = new BoxShape(4f, 0.25f);
        StaticBody platform5 = new StaticBody(this, platformShape5);
        platform5.setPosition(new Vec2(74, 10));
        platform5.setFillColor(new Color(92, 64, 51));
        platform5.setLineColor(new Color(92, 64, 51));
        platform5.setName("Platform5");

        Shape platformShape6 = new BoxShape(9f, 0.25f);
        StaticBody platform6 = new StaticBody(this, platformShape6);
        platform6.setPosition(new Vec2(85, 7));
        platform6.setFillColor(new Color(92, 64, 51));
        platform6.setLineColor(new Color(92, 64, 51));
        platform6.setName("Platform6");

        Spikes spikes3 = new Spikes(this);
        spikes3.setPosition(new Vec2(85, 9));

        Spikes spikes4 = new Spikes(this);
        spikes4.setPosition(new Vec2(88, 9));

        Spikes spikes5 = new Spikes(this);
        spikes5.setPosition(new Vec2(82, 9));

        Spikes spikes6 = new Spikes(this);
        spikes6.setPosition(new Vec2(79, 9));

        Spikes spikes7 = new Spikes(this);
        spikes7.setPosition(new Vec2(91, 9));

        Shape platformShape7 = new BoxShape(3 / 2f, 0.15f);
        StaticBody platform7 = new StaticBody(this, platformShape7);
        platform7.setPosition(new Vec2(82, 14));
        platform7.setFillColor(new Color(92, 64, 51));
        platform7.setLineColor(new Color(92, 64, 51));
        platform7.setName("Platform7");

        Shape platformShape8 = new BoxShape(3 / 2f, 0.15f);
        StaticBody platform8 = new StaticBody(this, platformShape8);
        platform8.setPosition(new Vec2(90, 18));
        platform8.setFillColor(new Color(92, 64, 51));
        platform8.setLineColor(new Color(92, 64, 51));
        platform8.setName("Platform8");

        Shape platformShape9 = new BoxShape(50f, 0.25f);
        StaticBody platform9 = new StaticBody(this, platformShape9);
        platform9.setPosition(new Vec2(150, 20));
        platform9.setFillColor(new Color(92, 64, 51));
        platform9.setLineColor(new Color(92, 64, 51));
        platform9.setName("Platform9");

        Shape platformShape10 = new BoxShape(3 / 2f, 0.15f);
        StaticBody platform10 = new StaticBody(this, platformShape10);
        platform10.setPosition(new Vec2(27, -7));
        platform10.setFillColor(new Color(92, 64, 51));
        platform10.setLineColor(new Color(92, 64, 51));
        platform10.setName("Platform1");

        Treasure treasure = new Treasure(this);
        treasure.setPosition(new Vec2(50, 10));

        Treasure treasure2 = new Treasure(this);
        treasure2.setPosition(new Vec2(69, 4));

        Enemy enemy = new Enemy(this);
        enemy.setPosition(new Vec2(62, 3));

        Enemy enemy2 = new Enemy(this);
        enemy2.setPosition(new Vec2(108, 30));

        STrampoline st = new STrampoline(this);
        st.setAlwaysOutline(false);
        st.setPosition(new Vec2(42, -1));

        Ship ship = new Ship(this);
        ship.setPosition(new Vec2(120, 30));

        for (int i = 0; i < 50; i++) {
            Coins c = new Coins(this);
            c.setPosition(new Vec2(0 + (i * 14), 100));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
