package strategy_pattern;


import java.io.IOException;

public interface Reader {
    public String readFile (String filePathFrom) throws IOException;

    public void writeFile (String filePathTo) throws IOException;

    public void updateFile (String filePathTo) throws IOException;
}
