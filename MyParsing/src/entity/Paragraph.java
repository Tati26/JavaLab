import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Tatyana on 11/4/14.
 */
public class Paragraph extends Text {

    public Paragraph() {
    }

    public static void readFile(String fileName) throws FileNotFoundException{

        StringBuilder sb = new StringBuilder();

        File file = new File(fileName);
        List sentenceList = new ArrayList();


        if (file.exists() && file.isFile()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));                                       //object for reading from file
                try {
                    String s;
                    while ((s = reader.readLine()) != null) {                                                               //cycle of reading the sentence
                        for (int count = 0; count < s.length(); count++)
                        {
                            if (s.charAt(count) != "\n")
                            sb.append(s.charAt(count));


                           sentenceList.add(s);

                        }


                    }
                } finally {
                    reader.close();                                                                                         //close file
                }
            } catch(IOException e) {
                System.out.println("Error");
            }

            System.out.println(sentenceList.get(0));
        }


    }
}
