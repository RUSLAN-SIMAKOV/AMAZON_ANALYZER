package ruslan.simakov.amazon_analyzer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazonAnalyzerApplication {

    private static AmazonFileReader amazonFileReader;

    public AmazonAnalyzerApplication(AmazonFileReader amazonFileReader) {
        this.amazonFileReader = amazonFileReader;
    }

    static public void main(String[] args) {

        SpringApplication.run(AmazonAnalyzerApplication.class, args);
        amazonFileReader.readFromCsvFile();
        System.out.println("FIN");
    }
}
