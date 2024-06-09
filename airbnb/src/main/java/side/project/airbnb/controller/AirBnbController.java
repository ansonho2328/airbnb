package side.project.airbnb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import side.project.airbnb.entity.BnBInfo;
import side.project.airbnb.entity.ListingsAndReviews;
import side.project.airbnb.repository.ListingsAndReviewsRepository;

import java.util.List;

@RestController
@CrossOrigin
public class AirBnbController {

    @Autowired
    ListingsAndReviewsRepository listingsAndReviewsRepository;

    @GetMapping("/")
    public List<BnBInfo> index(){
        return listingsAndReviewsRepository.findFirstTenBnb();
    }

    @GetMapping("/detail/{id}")
    public List<ListingsAndReviews> getDetailById(){
        return listingsAndReviewsRepository.findItemById("10006546");
    }
}
