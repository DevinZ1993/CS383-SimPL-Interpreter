package simpl.interpreter.pcf;

import simpl.interpreter.Env;
import simpl.interpreter.FunValue;
import simpl.parser.Symbol;
import simpl.parser.ast.Cond;
import simpl.parser.ast.Greater;
import simpl.parser.ast.IntegerLiteral;
import simpl.parser.ast.Name;
import simpl.parser.ast.Sub;

public class pred extends FunValue {

    public pred() {
        // DevinZ
        super(Env.empty, Symbol.symbol("$"), new Cond(null,null,null));
        ((Cond)e).e1 = new Greater(new Name(x),new IntegerLiteral(0));
        ((Cond)e).e2 = new Sub(new Name(x),new IntegerLiteral(1));
        ((Cond)e).e3 = new IntegerLiteral(0);
    }
}
