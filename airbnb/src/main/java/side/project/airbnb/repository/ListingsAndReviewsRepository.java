package side.project.airbnb.repository;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import side.project.airbnb.entity.BnBInfo;
import side.project.airbnb.entity.ListingsAndReviews;

import java.util.List;

public interface ListingsAndReviewsRepository extends MongoRepository<ListingsAndReviews, String> {

    @Query("{_id:'?0'}")
    List<ListingsAndReviews> findItemById(String id);

    @Aggregation(pipeline = {"{'$limit': 10}"})
    List<BnBInfo> findFirstTenBnb();
}
