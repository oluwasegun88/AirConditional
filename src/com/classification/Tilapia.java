package com.classification;

public class Tilapia extends Chordata{

    private String gills;
    private int fins;
    private int scales;

    public Tilapia(String name, String backbone, String spine, int kidney, int brain, String gills, int fins, int scales) {
        super(name, backbone, spine, kidney, brain);
        this.gills = gills;
        this.fins = fins;
        this.scales = scales;

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("good food");
    }

    public void swim(){
        System.out.println("I am swimming");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("very fast");
    }


}
