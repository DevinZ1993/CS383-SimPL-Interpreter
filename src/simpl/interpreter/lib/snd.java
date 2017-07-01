package simpl.interpreter.lib;

import simpl.interpreter.FunValue;
import simpl.interpreter.Value;


public class snd extends FunValue {

    public snd() {
        // DevinZ
        super(null,null,null);
    }
    
    public String toString() {
        return "snd";
    }
    
    public boolean equals(Value other) {
        return (other instanceof snd);
    }
}
