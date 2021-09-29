import java.io.File;
import java.util.Scanner;

public class FindPath {

    private static final Scanner scan = new Scanner(System.in);

    public File searchPath() {
        System.out.println("Introduce la ruta del archivo");
        String path = scan.nextLine();

        File filePath = new File(path);

        return filePath;
    }
}
