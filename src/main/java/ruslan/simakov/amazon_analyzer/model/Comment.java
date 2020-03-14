package ruslan.simakov.amazon_analyzer.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Data
@Entity
public class Comment {
    @Id
    Long id;
    String productId;
    String userId;
    String profileName;
    Long helpfulnessNumerator;
    Long helpfulnessDenominator;
    Long score;
    Long time;
    String summary;
    @Lob
    @Column(length = 1000)
    String text;
}
