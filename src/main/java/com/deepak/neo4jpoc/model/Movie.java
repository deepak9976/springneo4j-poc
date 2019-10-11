package com.deepak.neo4jpoc.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Movie {

    @org.neo4j.ogm.annotation.Id
    @GeneratedValue
    private Long Id;
    private String title;

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }

    private int released;
    private String tagline;
}
