package com.company;

public class Main {

    public static void main(String[] args) {

        Animal panda = new Animal("Coco");
        panda.speak();

        Dog lab = new Dog("Max");
        lab.speak();

        Cat tabby = new Cat("Tweety");
        tabby.speak();
    }
}
