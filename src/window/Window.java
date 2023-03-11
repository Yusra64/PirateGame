package window;

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

        PlayerController controller = new PlayerController(world.getCharacter());
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
