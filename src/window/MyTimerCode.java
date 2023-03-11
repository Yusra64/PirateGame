/*package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTimerCode extends World  implements ActionListener {
    private World world;
    private Character character;
    int counter =0;
    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
    }
}*/
package window;


import city.cs.engine.World;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class MyTimerCode implements ActionListener{
    private World world;

    public MyTimerCode(World world){
        this.world = world;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
