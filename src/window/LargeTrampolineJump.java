package window;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class LargeTrampolineJump implements CollisionListener {
    private Player player;

    public LargeTrampolineJump(Player b){
        player =b;
    }

        @Override
        public void collide (CollisionEvent collisionEvent){
            if (collisionEvent.getOtherBody() instanceof LTrampoline) {
                collisionEvent.getOtherBody();
                player.jump(30);
            }
        }
    }
