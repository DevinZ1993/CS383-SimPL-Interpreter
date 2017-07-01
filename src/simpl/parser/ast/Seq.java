package simpl.parser.ast;

import simpl.interpreter.RuntimeError;
import simpl.interpreter.State;
import simpl.interpreter.Value;
import simpl.typing.Substitution;
import simpl.typing.TypeEnv;
import simpl.typing.TypeError;
import simpl.typing.TypeResult;

public class Seq extends BinaryExpr {

    public Seq(Expr l, Expr r) {
        super(l, r);
    }

    public String toString() {
        return "(" + l + " ; " + r + ")";
    }

    @Override
    public TypeResult typecheck(TypeEnv E) throws TypeError {
        // DevinZ
        TypeResult lr = l.typecheck(E);
        TypeResult rr = r.typecheck(E);
        Substitution s = rr.s.compose(lr.s);
        return TypeResult.of(s,s.apply(rr.t));
    }

    @Override
    public Value eval(State s) throws RuntimeError {
        // DevinZ
        return r.eval(s);
    }
}
