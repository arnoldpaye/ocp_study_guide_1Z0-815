package structure;                  // package must be first non-comment

import java.util.*;                 // import must come after package

public class Meerkat {              // then comes the class
    double weigth;
    public double getWeight() {     // fields and methods can go in either order
        return weigth;
    }
    double height;                  // another field - they don't need to be together
}
