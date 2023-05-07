package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
public class Arrow extends StaticBody {
    private static final Shape arrowSign = new BoxShape(1, 1);
    private static final BodyImage arrowSignShape = new BodyImage("images/arrowSign.png",2);
    public Arrow(World w) {
        super(w,arrowSign);
        this.addImage(arrowSignShape);
    }
}
