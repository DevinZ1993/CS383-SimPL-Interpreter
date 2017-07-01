package simpl.interpreter.lib;

import simpl.interpreter.FunValue;
import simpl.interpreter.Value;

public class fst extends FunValue {

    public fst() {
        // DevinZ
        super(null,null,null);
    }
    
    public String toString() {
        return "fst";
    }

    public boolean equals(Value other) {
        return (other instanceof fst);
    }
}
