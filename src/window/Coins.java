package window;

import city.cs.engine.*;
import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.Walker;

public class Coins extends DynamicBody {

    private static final Shape coinShape = new BoxShape(1,1);
    private static final BodyImage coinImage = new BodyImage("images/coin.png",1);

    public Coins(GameWorld world) {
        super(world,coinShape);
        this.addImage(coinImage);
    }

}
