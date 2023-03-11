package window;

import city.cs.engine.*;
import city.cs.engine.Shape;

public class STrampoline extends StaticBody {
    private static final Shape springShape = new BoxShape(1,1);

    private static final BodyImage trampoline = new BodyImage("images/trampoline.png",5);


    public STrampoline(World w) {
        super(w,springShape);
        this.addImage(trampoline);
    }

}
