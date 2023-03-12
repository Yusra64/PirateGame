package window;

import city.cs.engine.UserView;

import javax.swing.*;
import java.awt.*;

public class GameView extends UserView {
    private Image background, heart;
    private Player player; // so to access lives from Player class
    private GameWorld world;


    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
        background = new ImageIcon("images/background.jpeg").getImage();
    }

    @Override
    public void paintComponent(Graphics g4) {
        super.paintComponent(g4);
        if(player.getLives() == 3){
            g4.drawImage(heart, 90, 10, 40, 40, this); // had to draw each heart in a separate paint
        }
        else if (player.getLives() == 2) {
            repaint(); // calls method to restart and since count is not equal to 3 anymore heart is not drawn
        }
    }

    @Override
    protected void paintForeground(Graphics2D g2) {
        Font myFont = new Font ("Georgia", 1, 30);
        g2.setFont (myFont);
        g2.drawString(String.valueOf("Coins: " + player.getCoins()), 10, 80); // draws coin count on foreground

        if(player.getLives() >1) // lives can equal 1 ,2 or 3 .So more than 1 means 2 & 3 .Means heart will be drawn if there are 2 or 3 lives remaining.
        {
            g2.drawImage(heart, 50, 10, 40, 40, this); // had to draw each heart in a separate paint
        }
        else if (player.getLives() == 1) {
            repaint(); // calls method to restart and since count is not equal to 2 anymore heart is not drawn
        }
    }

    @Override
    public void paint(Graphics g3) {
        super.paint(g3);
        heart = new ImageIcon("images/heart.png").getImage();
        if(player.getLives() > 0){
            g3.drawImage(heart, 10, 10, 40, 40, this); // draws heart as long as lives is not 0
        }
        else if (player.getLives() == 0) {
            repaint(); // calls method to restart and since count is not equal to 3 anymore heart is not drawn
            player.destroy();
            g3.setColor(new Color(0,0,0,150)); //black colour
            g3.fillRect(0,0,getWidth(),getHeight());
            Font myFont = new Font ("Helvetica", 1, 60);
            g3.setFont (myFont);
            g3.drawString("Game Over", 225, getHeight()/2);
        }
    }

    public GameView(GameWorld world, int width, int height, Player player) {
        super(world, width, height);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public GameWorld getWorld() {
        return world;
    }

    public void setWorld(GameWorld world) {
        this.world = world;
    }

}





