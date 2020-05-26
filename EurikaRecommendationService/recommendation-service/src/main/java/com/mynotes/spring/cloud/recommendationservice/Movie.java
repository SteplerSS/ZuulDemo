package com.mynotes.spring.cloud.recommendationservice;

public class Movie {
    private Integer id;

    private String name;

    private String synopsis;

    public Movie(Integer id, String name, String synopsis) {
        this.id = id;
        this.name = name;
        this.synopsis = synopsis;
    }


    // getters and setters
}