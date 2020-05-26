package com.mynotes.spring.cloud.recommendationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class RecommendationController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/recommendations")
    @ResponseBody
    public Movie[] recommendations() {
        Movie[] result = restTemplate.getForObject("http://movie-service/movies", Movie[].class);
        return result;
    }
}