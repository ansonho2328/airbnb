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

    @Query(fields="{ 'name' : 1, 'room_type' : 1, 'bed_type' : 1, 'bedrooms' : 1, 'beds' : 1 " +
            "'images' : { 'picture_url' : 1 }, 'price' : 1, number_of_reviews : 1 " +
            "'review_scores.review_scores_rating' : 1 " +
            "}")
    @Aggregation(pipeline= { "{'$sort': { 'number_of_reviews' : -1 }}", "{'$limit': 5}" })
    List<BnBInfo> findFirstFiveBnb();
}
