package com.classification;

public class Aves extends Chordata{

    private String wing;
    private String beak;
    private int feather;

    public Aves(String name, String backbone, String spine, int kidney, int brain, String wing, String beak, int feather) {
        super(name, backbone, spine, kidney, brain);
        this.wing = wing;
        this.beak = beak;
        this.feather = feather;
    }
}
