package window;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class CharacterController  implements KeyListener {
    private Player player;

    public CharacterController(Player player) {
        super();
        this.player = player;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e){
        int code = e.getKeyCode();
        if ((code == KeyEvent.VK_LEFT))
        {
            player.walkLeft();
        } else if (code == KeyEvent.VK_RIGHT) {
            player.walkRight();
        } else if (code == KeyEvent.VK_UP){
           player.jump(17);
        }
          }


    @Override
    public void keyReleased(KeyEvent e) {
      int code = e.getKeyCode();
         if (code == KeyEvent.VK_LEFT) {
             player.startWalking(0);
         } else if (code == KeyEvent.VK_RIGHT) {
            player.startWalking(0);
          }
          else if(code==KeyEvent.VK_UP) {
              player.jump(0);
         }
          else if (code == KeyEvent.VK_SPACE){
              player.shoot();
         }
    }
}
