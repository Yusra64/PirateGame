package game;

import city.cs.engine.*;
import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;

public class Ship extends DynamicBody {

    private static final Shape shipShape = new BoxShape(10,10);
    private static final BodyImage shipImage = new BodyImage("images/ship.png",20);

    public Ship(GameLevel world) {
        super(world,shipShape);
        this.addImage(shipImage);
    }

}
