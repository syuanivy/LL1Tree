/**
 * Created by ivy on 3/6/15.
 */
import java.io.IOException;

/** Parse according to this grammar:
 expr : term ('+' term)* ;
 term : factor ('*' factor)* ;
 factor : ID | INT | '(' expr ')' ;
 */
public class ExprParser extends Parser {
    public ExprParser(TokenSource input) throws IOException {
        super(input);
    }

    /**  expr : term ('+' term)* ; */
    public ParseTree expr() {
        ParseTree t;
        ParseTree root = new RuleNode("expr");
        t = term();								root.addChild(t);
        // ...
        return root;
    }

    /** term : factor ('*' factor)* ; */
    public ParseTree term() {
        return null;
    }

    /** factor : ID | INT | '(' expr ')' */
    public ParseTree factor() {
        return null;
    }
}
