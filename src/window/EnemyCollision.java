package window;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class EnemyCollision implements CollisionListener {
    private Player player;

    public EnemyCollision(Player c) {
        super();
        player = c;

    }

    public Player getCharacter() {
        return player;
    }

    public void setCharacter(Player player) {
        this.player = player;
    }

    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody() instanceof Enemy) {
            collisionEvent.getOtherBody();
            player.setLives(player.getLives() - 1);
            System.out.println(player.getLives() + " lives remaining");

        }
    }
}
