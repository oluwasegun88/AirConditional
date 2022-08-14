package com.classification;

public class Goat extends Chordata {

    private String breast;
    private int hair;
    private int ear;

    public Goat(String name, String backbone, String spine, int kidney, int brain, String breast, int hair, int ear) {
        super(name, backbone, spine, kidney, brain);
        this.breast = breast;
        this.hair = hair;
        this.ear = ear;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("only grass");
    }

    public void bleat(){
        System.out.println("I can bleat");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("very fast");
    }


}
