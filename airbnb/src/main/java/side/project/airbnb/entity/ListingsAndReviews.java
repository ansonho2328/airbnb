package side.project.airbnb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor
public class ListingsAndReviews extends BnBInfo{

    private String summary;
    private String transit;
    private String interaction;
}
