package simpl.interpreter.lib;

import simpl.interpreter.FunValue;
import simpl.interpreter.Value;


public class tl extends FunValue {

    public tl() {
        // DevinZ
        super(null, null, null);
    }
    
    public String toString() {
        return "tl";
    }
    
    public boolean equals(Value other) {
        return (other instanceof tl);
    }
}
