package simpl.interpreter.lib;

import simpl.interpreter.FunValue;
import simpl.interpreter.Value;

public class hd extends FunValue {

    public hd() {
        // DevinZ
        super(null, null, null);
    }
    
    public String toString() {
        return "hd";
    }
    
    public boolean equals(Value other) {
        return (other instanceof hd);
    }
}
