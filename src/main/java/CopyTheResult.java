import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class CopyTheResult {

    private static final Logger log = LoggerFactory.getLogger(CopyTheResult.class);

    public void writeToFile(File file, String count) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("las veces que se ha encontrado la palabra son: " + count);
        } catch (IOException e) {
            log.error("Error escribiendo en el archivo " + file.getName(), e);
        }
    }
}
