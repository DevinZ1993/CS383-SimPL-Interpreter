package simpl.interpreter.pcf;

import simpl.interpreter.Env;
import simpl.interpreter.FunValue;
import simpl.parser.Symbol;
import simpl.parser.ast.Add;
import simpl.parser.ast.IntegerLiteral;
import simpl.parser.ast.Name;

public class succ extends FunValue {

    public succ() {
        // DevinZ
        super(Env.empty, Symbol.symbol("$"), new Add(null,null));
        ((Add)e).l = new Name(x);
        ((Add)e).r = new IntegerLiteral(1);
    }
}
