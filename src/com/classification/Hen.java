package com.classification;

public class Hen extends Chordata{

    private String wing;
    private String beak;
    private int feather;

    public Hen(String name, String backbone, String spine, int kidney, int brain, String wing, String beak, int feather) {
        super(name, backbone, spine, kidney, brain);
        this.wing = wing;
        this.beak = beak;
        this.feather = feather;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("very slow");
    }

    public void fly(){
        System.out.println("I can fly");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("only grains");
    }
}
