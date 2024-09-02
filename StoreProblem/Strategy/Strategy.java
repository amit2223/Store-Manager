package Strategy;

import Model.Box;

public interface Strategy {
    boolean acceptOrReject(Box box);
}
