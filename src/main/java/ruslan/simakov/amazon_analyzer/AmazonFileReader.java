package ruslan.simakov.amazon_analyzer;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import ruslan.simakov.amazon_analyzer.model.Comment;
import ruslan.simakov.amazon_analyzer.service.CommentService;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AmazonFileReader {

    private static final String PATH_TO_FILE_WITH_DATA = "C:\\Users\\OLESIA\\Desktop\\Reviews.csv";

    @Autowired
    private CommentService commentService;

    public void readFromCsvFile() {

        CSVParser parser;
        Comment comment;
        try {
            parser = new CSVParser(new FileReader(PATH_TO_FILE_WITH_DATA), CSVFormat.DEFAULT);

            for (CSVRecord line : parser) {
                if (line.get(0).equals("Id")) {
                    continue;
                }
                comment = new Comment();

                comment.setId(Long.parseLong(line.get(0)));
                comment.setProductId(line.get(1));
                comment.setUserId(line.get(2));
                comment.setProfileName(line.get(3));
                comment.setHelpfulnessNumerator(Long.parseLong(line.get(4)));
                comment.setHelpfulnessDenominator(Long.parseLong(line.get(5)));
                comment.setScore(Long.parseLong(line.get(6)));
                comment.setTime(Long.parseLong(line.get(7)));
                comment.setSummary(line.get(8));
                comment.setText(line.get(9));

                commentService.addCommentFromFile(comment);
            }
        } catch (IOException ex) {
            throw new RuntimeException("Problem with Data file. Parsing not executed!", ex);
        }
    }
}
