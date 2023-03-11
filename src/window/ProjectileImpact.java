package window;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
public class ProjectileImpact implements CollisionListener{

    private Player player;

    public ProjectileImpact(Player c){
        player = c;
    }

    @Override
    public void collide(CollisionEvent collisionEvent) {
        collisionEvent.getReportingBody().destroy();
        if(collisionEvent.getOtherBody() instanceof Enemy){
            collisionEvent.getOtherBody().destroy();
        }
    }
}
