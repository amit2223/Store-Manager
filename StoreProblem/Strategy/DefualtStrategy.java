package Strategy;

import Model.Box;

public class DefualtStrategy implements Strategy{

    @Override
    public boolean acceptOrReject(Box box) {
        return true;
    }
    
}
