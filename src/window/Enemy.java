package window;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Enemy extends Walker implements StepListener {
    private static final Shape enemyShape = new PolygonShape(1.61f,-1.77f, 2.17f,1.15f, 0.29f,
            1.59f, -1.02f,0.68f, -1.32f,-0.7f, -0.53f,-1.78f, 0.43f,-1.94f
    );


    BodyImage EnemyRImage = new BodyImage("images/REnemy.png", 5);
    BodyImage EnemyLImage = new BodyImage("images/LEnemy.png", 5);

    private final int speed = 4;
    private float left, right;
    private final int range = 3;

    public Enemy(World world) {
        super(world, enemyShape);
        this.addImage(EnemyRImage);
        world.addStepListener(this);
        startWalking(speed);

    }
    @Override
    public void setPosition(Vec2 position) {
        super.setPosition(position);
        left = position.x- range;
        right = position.x+ range;
    }
    @Override
    public void preStep(StepEvent stepEvent) {
        if (getPosition().x > right) {
            startWalking(0); // makes turning smooth,so they pause then turn and start walking again
            removeAllImages();
            addImage(EnemyLImage);
            startWalking(-speed);
        }
        if (getPosition().x < left) {
            startWalking(0);
            removeAllImages();
            addImage(EnemyRImage);
            startWalking(speed);
        }
    }

    @Override
    public void postStep(StepEvent stepEvent) {

    }
}





