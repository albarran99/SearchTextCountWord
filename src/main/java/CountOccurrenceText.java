import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class CountOccurrenceText {

    private static final Logger log = LoggerFactory.getLogger(CountOccurrenceText.class);

    public void writeToFile(File file, String content) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        } catch (IOException e) {
            log.error("Error escribiendo en el archivo " + file.getName(), e);
        }
    }
}
