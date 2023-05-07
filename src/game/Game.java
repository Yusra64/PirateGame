package game;

import city.cs.engine.SoundClip;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Game {

    private SoundClip gameMusic;
    private GameLevel currentLevel;
    private GameView view;
    private JFrame frame;
    PlayerController controller;
    private SplashMenu menu;

    public Game() {
        super();
            currentLevel = new Level1(this);
            //view
            view = new GameView(currentLevel,800, 600, currentLevel.getPlayer());

        try {
            gameMusic = new SoundClip("data/themesong.wav");   // Opens audio input stream
            gameMusic.loop();                              // Set it to continous playback (looping)
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println(e);
        }
            GiveFocus focus = new GiveFocus(view);
            view.addMouseListener(focus);

            controller = new PlayerController(currentLevel.getPlayer());
            view.addKeyListener(controller);

            currentLevel.addStepListener(new Tracker(view, currentLevel.getPlayer()));
            frame = new JFrame(" Best Pirate Game");

            Tracker tracker = new Tracker(view, currentLevel.getPlayer());
            currentLevel.addStepListener(tracker);

            frame.add(view);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocation(300, 100);
            frame.setResizable(false);
            frame.pack(); //sizes frame
            frame.setVisible(true);
            currentLevel.start();
        }
    public void goToNextLevel(){
        //everything refreshes this way like lives
        if (currentLevel instanceof Level1){
            currentLevel.stop();
            frame.dispose();
            frame.remove(view);

            currentLevel = new Level2(this);
            view = new GameView(currentLevel,800, 600, currentLevel.getPlayer());
            GiveFocus focus = new GiveFocus(view);
            view.addMouseListener(focus);

            controller = new PlayerController(currentLevel.getPlayer());
            view.addKeyListener(controller);
            currentLevel.addStepListener(new Tracker(view, currentLevel.getPlayer()));
            frame = new JFrame(" Best Pirate Game");

            Tracker tracker = new Tracker(view, currentLevel.getPlayer());
            currentLevel.addStepListener(tracker);

            frame.add(view);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocation(300, 100);
            frame.setResizable(false);
            frame.pack(); //sizes frame
            frame.setVisible(true);
            currentLevel.start();
        }
        else if(currentLevel instanceof Level2)
        {
            currentLevel.stop();
            frame.dispose();
            frame.remove(view);
            currentLevel = new Level3(this);
            view = new GameView(currentLevel,800, 600, currentLevel.getPlayer());
            GiveFocus focus = new GiveFocus(view);
            view.addMouseListener(focus);

            controller = new PlayerController(currentLevel.getPlayer());
            view.addKeyListener(controller);
            currentLevel.addStepListener(new Tracker(view, currentLevel.getPlayer()));
            frame = new JFrame("Best Pirate Game");
            Tracker tracker = new Tracker(view, currentLevel.getPlayer());
            currentLevel.addStepListener(tracker);

            frame.add(view);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocation(300, 100);
            frame.setResizable(false);
            frame.pack(); //sizes frame
            frame.setVisible(true);
            currentLevel.start();
        }
        else if (currentLevel instanceof Level3){
            System.out.println("Game Over");
            System.exit(0);
        }
    }
    public void gameEnded(){
        currentLevel.stop();
        frame.remove(view);
        menu = new SplashMenu(currentLevel,this);
        menu.getMainPanel().setPreferredSize(new Dimension(800,600));
        frame.add(menu.getMainPanel());
        frame.pack();

    }
    public void restartGame(){
        //so right level is  current level when you restart
        if(currentLevel instanceof Level1){
            currentLevel = new Level1(this);
        }
        else if(currentLevel instanceof Level2){
            currentLevel = new Level2(this);
        }
        else if(currentLevel instanceof Level3){
            currentLevel = new Level3(this);
        }
        view.setWorld(currentLevel);
        currentLevel.start();

        controller = new PlayerController(currentLevel.getPlayer());
        view.addKeyListener(controller);

        Tracker tracker = new Tracker(view, currentLevel.getPlayer());
        currentLevel.addStepListener(tracker);

        frame.remove(menu.getMainPanel());
        frame.add(view);
        frame.pack();
        view.requestFocus();

    }
    public static void main(String[] args){
            Game game = new Game();
    }

}
