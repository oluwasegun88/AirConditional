package com.classification;

public class Mammalia extends Chordata {

    private String breast;
    private int hair;
    private int ear;

    public Mammalia(String name, String backbone, String spine, int kidney, int brain, String breast, int hair, int ear) {
        super(name, backbone, spine, kidney, brain);
        this.breast = breast;
        this.hair = hair;
        this.ear = ear;
    }
}
