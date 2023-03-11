package window;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class CoinPickup implements CollisionListener {
    private Player player;

    public CoinPickup(Player c){
        player =c;
    }
    @Override
    public void collide(CollisionEvent collisionEvent) {
        if(collisionEvent.getOtherBody() instanceof Coins){
            player.addCoins();
            //character.addCoins();
            collisionEvent.getOtherBody().destroy();
        }

    }
}
