import java.io.FileNotFoundException;

/**
 * Created by Tatyana on 11/4/14.
 */
public class Runner {
    public static void main(String[] args) {
        String fileName = "D:\\Автоматизация\\JavaLab\\MyParsing\\1.txt";
        try {
            Paragraph.readFile(fileName);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error");
        }


    }
}
