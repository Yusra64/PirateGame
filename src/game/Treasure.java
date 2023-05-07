package game;

import city.cs.engine.*;
import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;

public class Treasure extends StaticBody {

    private static final Shape TreasureShape = new BoxShape(2,2);
    private static final BodyImage TreasureImage = new BodyImage("images/treasure.png",4);

    public Treasure(GameLevel world) {
        super(world,TreasureShape);
        this.addImage(TreasureImage);
    }

}
