package com.dadashovaaytaj.gardenx;

public class Model {
    private String flowerName;
    private int imgId;

    public Model(String name,int imgId) {
        this.flowerName = name;
        this.imgId = imgId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getimgId()
    {
        return imgId;
    }


}
