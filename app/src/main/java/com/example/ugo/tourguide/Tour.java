package com.example.ugo.tourguide;

public class Tour {
    public String heading;
    public String description;
    public int imageResource;


    public Tour(String heading, String description, int imageResource) {
        this.heading = heading;
        this.description = description;
        this.imageResource = imageResource;
    }
    public String getHeadText(){return heading;}
    public String getDescText(){return description;}
    public int getImage(){return imageResource;}
}
