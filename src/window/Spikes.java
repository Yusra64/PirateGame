package window;

import city.cs.engine.*;
import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;

public class Spikes extends StaticBody {
    private static final Shape spikeShape = new BoxShape(1,1);
    private static final BodyImage spikeImage = new BodyImage("images/Spikes.png",4);
    public Spikes(World w) {
        super(w,spikeShape);
        this.addImage(spikeImage);
    }
}
