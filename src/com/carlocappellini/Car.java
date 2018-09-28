package com.carlocappellini;

public class Car {


    // class can defined as an user-defined data type, sort of an extra data type// not really correct int the true meaning but gives you an idea


    //classes enables you to have a powerful user-defined type, where you can create something way more powerful, than a regular primitive-type , a regular type on steroids


    //pubic keyword is an access modifier that we use for
    //to determine what access we want to allow others to this new class

    // public needs that other classes that we create have got access to this class
    // public means unrestricted access to the class

    //private where no other class can access that class

    //protected which allows classes in this package to access your class without being restricted

    //class is blueprint for an object


    // when  you're defining fields in Java in a class, you go with the access modifier private, unlike the class with gone with public

    // "private" means when talking about fields, we are adhering to encapsulation

    //encapsulation in Java is used to hide the fields and methods from access publicly


    // In other words the internal representation on an object is going to be hidden from view outside the object's definition


    //We are only allowing the internals
// to be accessed by this class or this object.

    // We are not allowing outside access


//when creating Objects variables/fields always go with private

    //State of Component for a Car

    // characteristics of a car

    // Doors how many doors it's got

    //number of Wheels

    // class is just a template

    // we are trying to create a template of variables tha would be part and parcel of  Car

    // private means =  don't allow a class outside Car class to access these variables, we would have to change access modifier to public


    //If we want them to be accessible outside the Car Java class

    // Part and parcel
    //: an essential or integral component


    // this is the state of a the Car
    // these are fields

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    // we have created a very basic class and define 5 fields


    //next is to create an Object from this class


    // in main  class we can create an object src/main


    //Car is a class beign called in main.java

    //Car can be treated as a data type


    // this how we define an object of Car, we call it ferrari,

    // we need to initialize the object

    //we have created a new data type called ferrari which is a type Car


    // In other words we have created an object called ferrari based on the template Car

//    public static void main(String[] args) {

// Car Lamborghini = new Car;


    //Lamborghini.model
//state of the car


//
//    }

    // one way of accessing the data , but not a good one


    //because it violates the rules of encapsulation

    // we'll create a method

    //  when you're in a class,when you   create a method
// that is then going to attach to all the objects that you create for that particular class.

// allow the method to update the model
// like this
//using the access modifier public
    //we are making it publicly accessible


//    public void setModel(String model){


// void doesnt return any data

    // we want ot update this field (i.e: private String model)
    //
    // with the contents of the parameters that was passed to us and update it in the method

    // the way to do this is you type the word "this", when you are referring to the field of the class


    // like this


//    public void setModel(String model) {
//  this.model = model;
//    }


    // if we were to update or access a particular field

    // we put"this" before the definition

    // this also a setter

    public void setModel(String model) {
        String validmodel = model.toLowerCase();
        if (validmodel.equals("Lamborghini") || validmodel.equals("Ferrari")) {
            this.model = model;
        } else {
            System.out.println("Unknown");
        }

    }

    //Parameter model is going to be what this.model gets set to


    // Now back in main.java
    // we can call the setModel method for our project and updating with         Lamborghini

//        like this

//        Lamborghini.setModel("Spyder");


    //To initialize an Object or class initialize it with  the keyword "new"


    //we created a setter


    // to have ability to print something out
    // now we need a getter


    // we want to return the type and we want to return the type getModel this time and return this.model like so:

    //we returning a field

    public String getModel() {
        return this.model;
    }
    // now we have a method that can be called elsewhere to return what the current model

    // back in main.java
//        Car Lamborghini = new Car();
//        Lamborghini.setModel("Spyder");
//        System.out.println("Model " + Lamborghini.getModel());
//}
//    print Spyder


    //        Car Lamborghini = new Car();
//    System.out.println("Model " + Lamborghini.getModel());
//        Lamborghini.setModel("Spyder");
//        System.out.println("Model " + Lamborghini.getModel());

    // prints null
    //prints Spyder

    // null is eternal default state for a class and also for a String , and back in  Car.java String is actually a Class

    // example


    // public class Car {

//    private int doors;
//    private int wheels;
//    private String model;
//    private String engine;
//    private String color;

//}

    // String is a special java class and does not need t be created in the same way we are creating this Car

    // this show up Java functionality

    // because String is a class we can have a class within a class if thar makes sense

    // so model engine and color are all classes in  their own
//right because of their type String and that's stored in a class of the name Car

//    private String model;
//    private String engine;
//    private String color;


    ///Concept of  user defined data type

    //we have introduced a super data type of type car hat has got 5 fields

    //private int doors;
//    private int wheels;
//    private String model;
//    private String engine;
//    private String color;


    // and assigned some methods to it as well


//    public String getModel() {
//        return this.model;
//    }

//public String getModel() {
//    return this.model;
//}


    //so both state and behaviour are part of the class


    // Why we need getters and setters???

    //example

    // we can do some validation like this

//    public void setModel(String model) {

//      String validModel = model.toLowerCase;

//
//        this.model = model;
//    }


    // we are going to convert whatever was passed to us to lower case


    // also lets introduce a test to make sure the only values we are going to accept are Ferrari and Lamborghini with .equals


//    public void setModel(String model) {

////      String validModel = model.toLowerCase;
//
//    if(validModel.equals("Ferrari") || validModel.equals("Lamborghini")) {

////        this.model = model;
////    }
//    }


    // so only if what was passed to us equal ferrari lamborghini will we allow our internal state, our internal model field to be assigned the value that's been passed to us

    // that might be because we got rule when we are creating our class to only define those 2 types


//
//    public void setModel(String model) {
//        String validmodel = model.toLowerCase();
//        if (validmodel.equals("Lamborghini") || validmodel.equals("Ferrari")){
//            this.model = model;
//        } else{
//            System.out.println("Unknown");
//        }
//
//    }


    // we only saving it to this type model if a valid ferrari or lamborghini
// otherwise we set it to unknown


    // and then this is printing that out with a getModel, getter

    //if we run an invalid model , we will get Unknown because in our validation in our setModel, which is our setter, we are explicitly only allowing ferrari adn lamborghini to be valid models, that are created for this object
}

// always very useful to have this functionality, the validation

// done with Car object itself via the methods that were set up in our class

//when you're creating a class, what you are doing is you can set up the rules
// all the rules related to that class, what is valid, what is not valid
//and have it all set up, all functionality  set up within the Car class itself, so that is inherited when we create the object,

// the code that is creating objects, cant make invalid objects, it can create in this case , it can't assign a model number that we haven't defined as being valid in our Car class

// that's the whole concept of encapsulation is we are not allowing people to access the field directly by forcing in this case to assign the model using a method , we can really make sure the data within our objects are more valid and have been validated and are correct


// when we used the command new Car, we have used a constructor to create the Car Object
