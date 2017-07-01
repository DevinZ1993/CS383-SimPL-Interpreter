package simpl.interpreter.pcf;

import simpl.interpreter.Env;
import simpl.interpreter.FunValue;
import simpl.parser.Symbol;
import simpl.parser.ast.Eq;
import simpl.parser.ast.IntegerLiteral;
import simpl.parser.ast.Name;

public class iszero extends FunValue {

    public iszero() {
        // DevinZ
        super(Env.empty, Symbol.symbol("$"), new Eq(null,null));
        ((Eq)e).l = new Name(x);
        ((Eq)e).r = new IntegerLiteral(0);
    }
}
