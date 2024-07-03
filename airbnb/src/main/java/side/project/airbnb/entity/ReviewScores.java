package side.project.airbnb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("review_scores")
@Getter
@Setter
public class ReviewScores {
    private int review_scores_accuracy;
    private int review_scores_cleanliness;
    private int review_scores_checkin;
    private int review_scores_communication;
    private int review_scores_location;
    private int review_scores_rating;
}
