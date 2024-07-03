package side.project.airbnb.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.*;
import side.project.airbnb.entity.BnBInfo;
import side.project.airbnb.entity.ListingsAndReviews;
import side.project.airbnb.entity.Users;
import side.project.airbnb.repository.ListingsAndReviewsRepository;

import java.util.List;

@RestController
@CrossOrigin
@Log4j2
public class AirBnbController {

    @Autowired
    ListingsAndReviewsRepository listingsAndReviewsRepository;

    @GetMapping("/")
    public List<BnBInfo> index(){
        return listingsAndReviewsRepository.findFirstFiveBnb();
    }

    @GetMapping("/detail/{id}")
    public List<ListingsAndReviews> getDetailById(){
        return listingsAndReviewsRepository.findItemById("10006546");
    }

    @PostMapping("/checkLogin")
    public void checkLogin(@RequestBody Users user){
        log.info(user);
    }

}
