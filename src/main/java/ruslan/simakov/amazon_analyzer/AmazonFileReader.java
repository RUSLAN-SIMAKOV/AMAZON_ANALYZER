package ruslan.simakov.amazon_analyzer;

import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class AmazonFileReader {

    private static final String PATH_TO_FILE_WITH_DATA = "C:\\Users\\OLESIA\\Desktop\\Reviews.csv";

    public void readFromCsvFile() {
        try (FileReader reader = new FileReader(PATH_TO_FILE_WITH_DATA)) {
            int c;
            while ((c = reader.read()) != -1) {
                //System.out.print((char) c);
            }
            System.out.println("READING FINISHED!!!!!!!!!!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
