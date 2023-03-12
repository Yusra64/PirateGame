package window;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

public class Player extends Walker {
    private static final Shape characterShape = new PolygonShape(
            -1.56f,-1.82f, -0.22f,-2.04f, 0.83f,-1.35f, 1.63f,-0.55f, 0.59f,0.66f, -0.34f,1.58f, -1.94f,1.3f, -2.29f,-0.15f


    );
    private static final float walkingSpeed = 10;
    BodyImage RightImage = new BodyImage("images/RPirate.png", 5);

    BodyImage LeftImage = new BodyImage("images/LPirate.png", 5);


    // private int credits;
    private int coins;

    boolean facingRight = true;

    int projectileSpeed = 10;

    private int lives = 3;

    private boolean GameOver = false;

    public Player(GameWorld world) {
        super(world, characterShape);
        this.addImage(RightImage);
        coins = 0;
    }


    public void walkLeft() {
        removeAllImages();
        addImage(LeftImage);
        startWalking(-walkingSpeed);
        facingRight = false;
    }

    public void walkRight() {
        removeAllImages();
        addImage(RightImage);
        startWalking(walkingSpeed);
        facingRight = true;
    }

    public void shoot() {
        DynamicBody projectile = new DynamicBody(this.getWorld(), new CircleShape(0.2f));

        ProjectileImpact impact = new ProjectileImpact(this);
        projectile.addCollisionListener(impact);

        projectile.setGravityScale(0);

        if (facingRight) {
            projectile.setPosition(new Vec2(this.getPosition().x + 2, this.getPosition().y));
            projectile.setLinearVelocity(new Vec2(projectileSpeed, 0));
        } else {
            projectile.setPosition(new Vec2(this.getPosition().x - 3, this.getPosition().y));
            projectile.setLinearVelocity(new Vec2(-projectileSpeed, 0));
        }
    }



    public void setCoins(int coins){
        this.coins = coins;
}

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    public int getCoins(){return coins;}
    public void addCoins() {setCoins(getCoins()+1);
    }

    public boolean isGameOver() {
        return GameOver;
    }

    public void setGameOver(boolean gameOver) {
        GameOver = gameOver;
    }
}


