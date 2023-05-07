package game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashMenu implements ActionListener {
    private JButton restartButton;
    private JButton quitButton;
    private JPanel mainPanel;
    private JButton nextLevelButton;
    private Game g;
    private GameLevel level;

    public SplashMenu(GameLevel level , Game game) {
        this.level = level;
        g = game;
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                g.restartGame();
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        nextLevelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               {
                    g.goToNextLevel();
                }
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}