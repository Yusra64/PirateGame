package game;

import city.cs.engine.*;
import city.cs.engine.Shape;

public class STrampoline extends StaticBody {
    private static final Shape springShape = new PolygonShape(-1.81f,0.77f, -0.69f
            ,1.06f, 0.51f,1.04f, 1.56f,0.82f, 1.99f,0.56f, 2.09f,0.22f, 2.0f,-0.1f
    );

    private static final BodyImage trampoline = new BodyImage("images/trampoline.png",5);


    public STrampoline(World w) {
        super(w,springShape);
        this.addImage(trampoline);
    }

}
