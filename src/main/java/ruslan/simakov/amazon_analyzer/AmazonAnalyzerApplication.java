package ruslan.simakov.amazon_analyzer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazonAnalyzerApplication {

    @Autowired
    private static AmazonFileReader amazonFileReader;//видимо статика не избежать

    static public void main(String[] args) {

        SpringApplication.run(AmazonAnalyzerApplication.class, args);
        amazonFileReader.readFromCsvFile();
    }
}
