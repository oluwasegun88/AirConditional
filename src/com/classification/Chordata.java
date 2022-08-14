package com.classification;

public class Chordata {

    private String name;
    private String backbone;
    private String spine;
    private int kidney;
    private int brain;


    public Chordata(String name, String backbone, String spine, int kidney, int brain) {
        this.name = name;
        this.backbone = backbone;
        this.spine = spine;
        this.kidney = kidney;
        this.brain = brain;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackbone() {
        return backbone;
    }

    public void setBackbone(String backbone) {
        this.backbone = backbone;
    }

    public String getSpine() {
        return spine;
    }

    public void setSpine(String spine) {
        this.spine = spine;
    }

    public int getKidney() {
        return kidney;
    }

    public void setKidney(int kidney) {
        this.kidney = kidney;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public void eat(){
        System.out.println("I can eat");
    }

    public void move(){
        System.out.println("I can move");
    }
}

