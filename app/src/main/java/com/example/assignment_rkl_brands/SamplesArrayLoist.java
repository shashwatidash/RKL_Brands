package com.example.assignment_rkl_brands;

public class SamplesArrayLoist {
    private String prices;
    private int imgID;

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public SamplesArrayLoist(String prices, int imgID) {
        this.prices = prices;
        this.imgID = imgID;
    }
}
