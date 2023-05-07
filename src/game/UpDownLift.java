package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class UpDownLift extends StaticBody implements StepListener {

    private static final Shape liftShape = new BoxShape(3, 0.2f);
    private Vec2 startPosition;
    private float top, bottom;
    private float delta;

    public UpDownLift(World w) {
        super(w, liftShape);
        startPosition = this.getPosition();
        bottom = startPosition.y - 12;
        top = startPosition.y + 25;
        delta=0.08f;
        w.addStepListener(this);
    }

    @Override
    public void preStep(StepEvent stepEvent) {
        if (getPosition().y < bottom){
            delta*=-1;
        }
        if (getPosition().y > top){
            delta*=-1;
        }
        this.setPosition(new Vec2(this.getPosition().x, this.getPosition().y+delta));
    }

    @Override
    public void postStep(StepEvent stepEvent) {
    }
}
