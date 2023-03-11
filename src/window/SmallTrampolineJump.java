package window;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class SmallTrampolineJump implements CollisionListener {
    private Player player;

    public SmallTrampolineJump(Player d){
        player = d;
    }

    @Override
    public void collide (CollisionEvent collisionEvent){
        if (collisionEvent.getOtherBody() instanceof STrampoline) {
            collisionEvent.getOtherBody();
            player.jump(20);
        }
    }
}
