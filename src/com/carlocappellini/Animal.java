package com.carlocappellini;


//ANIMAL CLASS


public class Animal {

    //states for Animal with private fields
    // this is our base class that all our other classes that we are going to create, sort of subtypes of animals  will base themselves off

    // we wil create another class "Dog" but inherit from this Animal Class

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //create Animal constructor

    public Animal(String name, int brain, int body, int size, int weight){

        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;

    }


    // We can introduce  some behaviors and we could add some methods for those for example: All Animal have to eat, we create a method called eat, move that's 2 methods that unique to all animals, all animals have some mechanism in some way to move and all animals eat in some way shape or form
    // by doing that and making it public , what this means this function functions , this methods will now be available in the dog class

    // this is our base class and we have said all Animals are able to eat a
// and also move

    //this methods are inherited from Dog automatically


    // because we defined this methods as public, we've said these methods are publicly accessible, the Dog class can reflect that and it's extending animal
    // in other words inheriting from the Animal class and as a result we are able to the eat and move method even if they are not part of the Dog class
    public void eat(){
        System.out.println("Animal.eat() called");

    }

    // we can accept a parameter for speed

    public void move(int speed) {
        System.out.println("Animal.move called() Animal is moving at " + speed);
    }




    public String getName(){
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}

