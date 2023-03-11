package window;

import city.cs.engine.*;
import city.cs.engine.Shape;
import city.cs.engine.BoxShape;
import org.jbox2d.common.Vec2;

import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Window {
    private static Enemy enemy;
    private GameWorld world;

    public Window(){
       super();
        GameWorld world = new GameWorld();
        //UserView view = new UserView(world, 500, 500);
        GameView view = new GameView(world, 800, 600,world.getCharacter());

        GiveFocus focus = new GiveFocus(view);
        view.addMouseListener(focus);

        CharacterController controller = new CharacterController(world.getCharacter());
        view.addKeyListener(controller);
        world.addStepListener(new Tracker(view, world.getCharacter()));
        final JFrame frame = new JFrame(" Best Pirate Game ARR-Bout");

        Tracker tracker = new Tracker(view,world.getCharacter());
        world.addStepListener(tracker);

        frame.add(view);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(300,100);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        world.start();

    }

    public static void main(String[] args){
        Window window = new Window();
    }


}
