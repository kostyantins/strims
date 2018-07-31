package strategy_pattern;

import java.io.IOException;

public class FileReader {

    private Reader reader;

    public String getContent(String filePath) throws IOException {
        return this.reader.readFile(filePath);
    }

    public void setContent(String filePath) throws IOException {
        this.reader.writeFile(filePath);
    }

    public void updateContent(String filePath) throws IOException {
        this.reader.updateFile(filePath);
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Reader getReader() {
        return reader;
    }
}
