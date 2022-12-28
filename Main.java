import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the file path of the file you wish to search: ");
            String filePath = scanner.nextLine();
            int max = findGreatestNumberInFile(filePath);
            System.out.println(max);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int findGreatestNumberInFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        int max = (int) Double.NEGATIVE_INFINITY;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            max = Math.max(number, max);
        }

        return max;
    }
}