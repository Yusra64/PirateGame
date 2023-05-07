package game;

import city.cs.engine.*;
import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;

public class Coins extends DynamicBody { //inheritance

    private static final Shape coinShape = new BoxShape(1,1);
    private static final BodyImage coinImage = new BodyImage("images/coin.png",1);

    public Coins(GameLevel game) { //no return type,instantiate a newly created object
        super(game,coinShape); //superclass,calls constructor that takes 1 parameter of the type of argument 1,called first
        this.addImage(coinImage); //The this keyword can be used to refer current class instance variable
    }

}
