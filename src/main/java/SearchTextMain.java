import java.io.File;
import java.util.Scanner;

public class SearchTextMain {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        FindPath file = new FindPath();
        File userPath = file.searchPath();

        System.out.println("Introduce un texto a buscar");
        String word = scan.nextLine();

        System.out.println("Introduce un archivo donde copiar su resultado");
        File newPath = file.searchPath();
        CopyTheResult copyTheResult = new CopyTheResult();
        copyTheResult.writeToFile(newPath, String.valueOf(SearchText.searchText(word, userPath)));
//        System.out.println("Numero de veces que se ha encontrado la palabra: " + SearchText.searchText(word, userPath));

    }
}
