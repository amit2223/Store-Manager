package Strategy;

import Model.Box;

public class OptimisedStrategy implements Strategy {

    @Override
    public boolean acceptOrReject(Box box) {
        if(box.getLength() >= box.getWidth())
            return true;
        
        return false;
    }
    
}
