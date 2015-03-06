/**
 * Created by ivy on 3/6/15.
 */
public class RuleNode extends ParseTree {
    public RuleNode(String ruleName) {
        super(ruleName);
    }

    @Override
    public String getPayload() {
        return (String)super.getPayload();
    }

    @Override
    public String getText() {
        return getPayload();
    }

    @Override
    public int getType() {
        return Token.INVALID_TYPE;
    }
}