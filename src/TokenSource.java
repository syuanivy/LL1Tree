/**
 * Created by ivy on 3/6/15.
 */
import java.io.IOException;

public interface TokenSource {
    public Token nextToken() throws IOException;
}