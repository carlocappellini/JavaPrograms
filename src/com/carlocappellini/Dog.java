package com.carlocappellini;


// If Java if you want to inherit from another class, (to access the state and behavior that's in that other class, your use the extends keyword


// by doing that we are able to use the state of behaviour that's been defined in the animal class in this new Dog class we created

// to inherit from the animal class we need to be able to call the constructor from that class to initialize it

// when trying to use a class ,
//
// and to do that we need to able to call the constructor for that class,
//
// that's what we need to do when we are creating a class that extends from another one,
//
// W e need to be able to call that other constructor class to initialize it

//Back in our animal class we got a constructor there , we can initialize those 5 parameters

// now we need a constructor for the Dog class that calls the other class , in other words calls the constructor for the other class

// the parameters that are actually dealing with the animal class: name, brain, body, size, and weight have been created as parameters to the Dog class, in other words the Dog constructor


// "super" means is to call the constructor that is from the class that we are extending from


// this allows us to initialize the animal class

// the Dog is actually part of an animal class, so we have defined an Animal class

// the Dog class is based on thr animal class


// WE CAN ALSO ADD MORE FEATURES MORE FEATURES TO THIS DOG CLASS, LIKE THINGS THAT ARE UNIQUE TO A DOG, WE CAN ASSIGN EXTRA STATE, EXTRA FIELDS, IN OTHER WORD EXTRA BEHAVIOUR, THAT IS METHODS THAT ARE UNIQUE FOR A DOG AND AREN'T NECESSARILY APPLICABLE FOR AN ANIMAL
//


public class Dog extends Animal {

    //1
    // FOR EXAMPLE
    // not all animals have eyes
    // not all animal have legs
    //  // all dogs have a tail
    // all dogs have teeth
    // type of coat, for like long silky coat or short coat and fur

    // these are unique characteristics relating to a Dog that we are adding in addition to Animals state

    // Dog has this fields/ characteristics


    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    //3/// now we need to initialize this characteristics as well,
    //
    //
    // so what we need to do is initialize that in our constructor and not just the fields that we've defined that initialize just the animal class

    // because we are in the Dog class we are creating a constructor for the Dog, we need to work with these extra parameters


    //4 we are going to say that all dogs have a brain and a body

    //so we can remove brain and body parameters


    // and we can pass number 1 on super for both


    // 5 well add the rest of the parameters
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {


        //2
        // but in addition they got these base characteristics that were defined in the base animal class because they aren't specific to a Dog, and that's why we are extending from that class

        //we know that all dogs have a brain and a body so we're not going to force define those

        super(name, 1, 1, size, weight);
//I've still initialized the animal class


        // to initialize the other parameters we do this

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

        // all fields have been initialized

    }


    //this a unique Behavior for a Dog and is not publicly accessed like "public"
    private void chew() {
        System.out.println("Dog.chew called");
    }


    // we are overriding a method that is in the super class, in this case the Animal class,

    // Now Dog class has got it's own eat method, and also the animal class has got its own eat method

    // we can put something to indicate that we are calling in here
    @Override
    public void eat() {

        System.out.println("Dog.eat was called");

        // the process of Dog eating food is that is chewing
        // so we'll call the chew() method that is unique to the dog class

        chew();

        // and then we are going to use super.eat()


        super.eat();
    }

//If we want to use the method from the super class we do it "super.move

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }


    // If there is only one method called move is our super class we can also just use 'move'


    // If we want to make a move method that unique to the Dog class we would use
    // @Override
    //    public void move(int speed) {
    //        System.out.println("Dog.move called() Animal is moving at " + speed);
    //    }


    public void run() {
        System.out.println("Dog.run() called");
        move(10
        );
    }

    public void moveLegs(int speed){
        System.out.println("Dog.legs() legs move at " + speed);

    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called() Animal is moving at " + speed);
        super.move(speed);
        moveLegs(speed);
    }

}
