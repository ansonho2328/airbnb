package side.project.airbnb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class BnBInfo {

    @Id
    private String _id;
    private String name;
    private String listing_url;
    private String room_type;
    private String bed_type;
}
