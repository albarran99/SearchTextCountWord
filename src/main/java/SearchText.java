import java.io.*;

public class SearchText {


    public static int searchText(String text, File file) {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(
                new FileReader(
                        file))
        ) {
            String line = reader.readLine();
            while (line != null) {
                if (line.contains(text)) {
                    lines++;
                }
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

        return lines;
    }
}
