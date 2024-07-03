package side.project.airbnb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@Getter
@Setter
public class BnBInfo {

    @Id
    private String _id;
    private String name;
    private String room_type;
    private String bed_type;
    @Field("images.picture_url")
    private String picture_url;
    private double price;
    private int bedrooms;
    private int beds;
    private int number_of_reviews;
    @Field("review_scores.review_scores_rating")
    private double review_scores_rating;
}
