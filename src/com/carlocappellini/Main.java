package com.carlocappellini;


import com.carlocappellini.mylibrary.Series;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
//    private static ArrayList<Album> albums = new ArrayList<Album>();

//    public static MobilePhone mobilePhone = new MobilePhone();


//        Bank bank = new Bank("SSFCU");
//
//
//        bank.addBranch("Texas");
//
//        bank.addCustomer("Texas", "Carlo", 10.0);
//        bank.addCustomer("Texas", "Jessica", 18.89);
//        bank.addCustomer("Texas", "Percy", 56.92);
//        bank.addBranch("Sydney");
//        bank.addCustomer("Sydney", "Percy", 6.3);
//        bank.addCustomer("Sydney", "Bob", 40.4);
//
//        bank.addCustomerTransaction("Texas", "Jessica", 44.2);
//
//        bank.addCustomerTransaction("Texas", "Carlo", 2.3);
//
//        bank.addCustomerTransaction("Sydney", "Percy", 9.2);
//
//
//        bank.listCustomers("Texas", true);
//
//        bank.addBranch("melbourne");
//
//        if (!bank.addCustomer("melbourne", "Brian", 5.4)) {
//            System.out.println("ERROR melbourne brian does not exist");
//        }
//        if (!bank.addBranch("Texas")){
//            System.out.println("Texas is on file");
//        }
//
//    }
//}
///// MOBILE PHONE CONTACT PROGRAM

//        boolean quit = false;
//        startPhone();
//        printActions();
//        while (!quit) {
//            System.out.println("Enter Action (6 to show available actions)");
//            int action = sc.nextInt();
//            sc.nextLine();
//
//
//            switch (action) {
//                case 0:
//                    System.out.println("Quiting....");
//                    quit = true;
//                    break;
//                case 1:
//                    mobilePhone.printContacts();
//                    break;
//                case 2:
//                    addContact();
//                    break;
//                case 3:
//                    updateContact();
//                    break;
//                case 4:
//                    removeContact();
//                    break;
//                case 5:
//                    queryContact();
//                    break;
//                case 6:
//                    printActions();
//                    break;
//                default:
//                    System.out.println("Invalid Choice");
//
//
//            }
//        }
//
//    }
//
//    private static void addContact() {
//
//        System.out.println("Enter new contact name");
//        String name = sc.nextLine();
//        System.out.println("Enter Phone Number");
//        String phoneNumber = sc.nextLine();
//        Contact newContact = Contact.createContact(name, phoneNumber);
//        if (mobilePhone.addNewContact(newContact)) {
//            System.out.println("New Contact added: " + name + " , " + phoneNumber);
//        } else {
//            System.out.println("Cannot add, " + name + " already on file");
//        }
//    }
//
//    private static void updateContact() {
//        System.out.println("Enter existing contact name to update");
//        String name = sc.nextLine();
//        Contact existingContact = mobilePhone.queryContact(name);
//
//        if (existingContact == null) {
//            System.out.println("Contact not found");
//            return;
//        } else {
//            System.out.println("Enter new Contact name ");
//            String newName = sc.nextLine();
//            System.out.println("Enter new Phone number ");
//            String newPhoneNumber = sc.nextLine();
//
//            Contact newContact = new Contact(newName, newPhoneNumber);
//           if (mobilePhone.updateContact(existingContact, newContact)) {
//               System.out.println("Successfully updated");
//           } else {
//
//               System.out.println("Error updating contact");
//
//           }
//        }
//    }
//
//
//    public  static void queryContact(){
//        System.out.println("Search a Contact");
//        String contact = sc.nextLine();
//        Contact searchedContact = mobilePhone.queryContact(contact);
//
//        if (searchedContact == null){
//            System.out.println("Contact not found");
//
//        } else{
//            System.out.println("found " + searchedContact.getName()+ " " + searchedContact.getPhoneNumber());
//
//        }
//
//
//
//
//    }
//
//
//    public static  void removeContact(){
//        System.out.println("Enter Contact to remove");
//        String name = sc.nextLine();
//     Contact contact = mobilePhone.queryContact(name);
//             if(contact != null){
//                if (mobilePhone.removeContact(contact)){
//                    System.out.println("Successfully Deleted");
//                };
//             }
//             else {
//                 System.out.println("Cannot find that contact");
//             }
//
//
//    }
//
//
//    private static void startPhone() {
//        System.out.println("Starting Phone......");
//    }
//
//    private static void printActions() {
//        System.out.println("\nAvailable actions:\n");
//
//        System.out.println(
//                "0 - To shutdown\n" +
//                        "1 - Print list of contacts\n" +
//                        "2 - Add new contact\n" +
//                        "3 - Update existing contact\n" +
//                        "4 - Remove contact\n" +
//                        "5 - Search contact\n" +
//                        "6 - To print list if available actions");
//        System.out.println("Choose you action:");
//    }

////////////////////////////////////////////////////////////


//VIP OBJECT----------------------

//        VipCustomer vp = new VipCustomer();
//
//        System.out.println(vp.getName());
//        System.out.println(vp.getEmail());
//        System.out.println(vp.getCreditLimit());
//
//        VipCustomer newVip = new VipCustomer("Pedro", 400, "test@email");
//
//        System.out.println(newVip.getName());
//        System.out.println(newVip.getEmail());
//        System.out.println(newVip.getCreditLimit());
//
//
//        VipCustomer newVip2 = new VipCustomer("tim", 4550);
//
//        System.out.println(newVip2.getName());
//        System.out.println(newVip2.getCreditLimit());
//
//        /////////////////////////////////////////////

// CAR OBJECT----------------------

//        Car Lamborghini = new Car();
//        System.out.println("Model " + Lamborghini.getModel());
//        Lamborghini.setModel("Spyder");
//        System.out.println("Model " + Lamborghini.getModel());


///////////////////////////////////////////////


//Java automatically creates constructor, when we type new, this calls the constructor, calls a special method that creates the class, its purpose is to physically create the object from the class


//BANK ACCOUNT OBJECT----------------------

//        BankAccount checking = new BankAccount();//1234, 30.0, "carlo", "test@tgest.com", "323223");


//          WE DON'T NEED THIS ANYMORE BECAUSE THE CONSTRUCTOR HAS DONE THAT FOR US
//
//        checking.setAccountNumber(324324234);
//        checking.setName("Carlo Cappellini");
//        checking.setPhoneNumber("3109137209");
//        checking.setEmail("carloacappellini@gmail.com");
//


// the values have been automatically updated in hte constructor

//
//        System.out.println(checking.getAccountNumber());
//        System.out.println(checking.getBalance());
//        checking.deposit(400);
//        checking.deposit(3.50);
//        checking.withdrawal(700);
//
//        System.out.println(checking.getBalance());


//

//          BankAccount carloAccount = new BankAccount("Carlo", "Cro@email.com",                    "4234234234");
//        System.out.println(carloAccount.getPhoneNumber());
//        System.out.println("carlo's account balance is "+ carloAccount.getBalance());
//        carloAccount.withdrawal(79);
//
//
//        System.out.println(carloAccount.getBalance());
//
//        carloAccount.deposit(300);
//        System.out.println(carloAccount.getBalance());
//
//        carloAccount.withdrawal(300);
//
//        carloAccount.withdrawal(21);
//        carloAccount.deposit(26);
//        carloAccount.withdrawal(2);

//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//        Dog dog = new Dog("Malti poo", 1, 1, 4, 14, 2, 4, 1, 30, "furry");

//        dog.eat();
//        dog.walk();
//        dog.run();


//        Fish fish = new Fish("Nemo", 1,1,2,10,660);
//
//        fish.move(3);


//Vehicle car = new Vehicle(4,4,5,"gray");
//car.moving(5);
//car.changingGears(9);

//Car2 car2 = new Car2(4,6,"red");
//car2.velocity(50,5);


//
//FastCar lambo = new FastCar(4, 4, "Orange", 230, true, "Spider");
//
//
//lambo.velocity(6);

//        Ferrari ferrari =new Ferrari(12);
//ferrari.steer(45);
//        ferrari.accelarate(30);
//        ferrari.accelarate(50);
//        ferrari.accelarate(-50);

//        Car2 car3 = new Car2(3,2,6,"Black");
//
//        System.out.println(car3);
//        Dimensions dimensions = new Dimensions(20,20,5);
//        Case theCase = new Case("220B", " dell", "240", dimensions);
//        Monitor monitor = new Monitor("27 inch Beast" , " Apple", 27, new Resolution(2500, 1440));
////        new Resolution(2500, 1440) that creates an instance of a class without using a variable
//        Motherboard motherboard = new Motherboard("BJ-200", "Asus",4, 6,"v2.44" );
//        PC thePC = new PC(theCase,monitor, motherboard);
//
//
//        thePC.powerUp();


//        Television television = new Television(2,"metallic",new Resolution(100,80),new Enhancement(2080,true));
//
//        Table table = new Table("Octagon",4,"Wood");
//        BookShelf bookShelf = new BookShelf(50,new Dimensions(100,200,50));
//
//        Couch couch = new Couch("Leather", 6, "Black");
//
//        WallFrame wallFrame = new WallFrame(200, 100, true, "Gold", "Dracula");
//
//
//        Room room = new Room("Carlo' Room",television, table, bookShelf, couch, wallFrame);
//
//        System.out.println(room.getName());
//        room.imHere();


//


//
//        SuperHeroPlayer superHeroPlayer = new SuperHeroPlayer("Carlo", "AXE", "Fire", 100);
//
//
//        superHeroPlayer.getHealth();
//        superHeroPlayer.takeEnemyDamage(90);
//        superHeroPlayer.shootFire(5);

//Printer printer = new Printer(100,true);
//
//
//printer.printPaper(20);


//        Hamburger hamburger = new Hamburger("bun", "horse", 5.50);
//
//        hamburger.burgerTotal();
//        HealthyBurger healthyBurger = new HealthyBurger("turtle", 3.58);
//
//        healthyBurger.addHealthyItem1("frijoles", 3.5);
//        healthyBurger.addHealthyItem2("frijoles", 3.5);
//
//        healthyBurger.healthyBurgerTotal();
//
//        System.out.println(healthyBurger.getName());
//DeluxeBurger deluxeBurger = new DeluxeBurger("white","donkey",5.75);
//
//
//deluxeBurger.total();


// we create the album firs then add song then created the linkedList playlist array

//        Album album = new Album("ramones", "Deep Purple");
//        album.addSong("carlo", 4.4);
////        album.addSong("Bafoon", 4.3);
////        album.addSong("raizor", 2.4);
////        album.addSong("crazy dog", 4.9);
//
//        albums.add(album);
//
//        album = new Album("for those about to rock", "ACDC");
//        album.addSong("foo", 4.4);
////        album.addSong("baz", 2.4);
////        album.addSong("qux", 4.9);
//
//        albums.add(album);
//
//        Album albumo = new Album("for those about to rock", "ACDC");
//        albumo.addSong("carlo", 4.4);
//        albumo.addSong("foo", 4.3);
//        albumo.addSong("baz", 2.4);
//        albumo.addSong("bra", 4.9);
//
//        albums.add(albumo);
//
//
//        LinkedList<Song> playlist = new LinkedList<Song>();
//
//        albumo.addToPlayList("carlo", playlist);
//        albumo.addToPlayList("foo", playlist);
//        albumo.addToPlayList("bra", playlist);
//        albumo.addToPlayList("baz", playlist);


//        albums.get(2).addToPlayList("foo",playlist);
//
//        albums.get(1).addToPlayList("quxx", playlist);
//
//        albums.get(1).addToPlayList("z", playlist);
//
//        albums.get(0).addToPlayList(2, playlist);
//        play(playlist);
//
//    }

//
//    private static void play(LinkedList<Song> playlist) {
//        ListIterator<Song> iterator = playlist.listIterator();
//
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        boolean forward = true;
//
//        if (playlist.size() == 0) {
//            System.out.println("No songs in the playlist");
//            return;
//
//        } else {
//            System.out.println("Now playing " + iterator.next().toString());
//        }
//        while (!quit) {
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (action) {
//                case 0:
//                    System.out.println("Playlist Complete");
//                    quit = true;
//                    break;
//                case 1:
//                    if (!forward) {
//                        if (iterator.hasNext()) {
//                            iterator.next();
//                        }
//                        forward = true;
//                    }
//                    if (iterator.hasNext()) {
//                        System.out.println("Now Playing " + iterator.next().toString());
//                    } else {
//
//                        System.out.println("End of Playlist");
//                        forward = false;
//                    }
//                    break;
//                case 2:
//                    if (forward) {
//                        // going previous one
//                        if (iterator.hasPrevious()) {
//                            iterator.previous();
//                        }
//                        forward = false;
//                    }
//                    // check if there is a previous one again
//                    if (iterator.hasPrevious()) {
//                        System.out.println("Now playing " + iterator.previous().toString());
//                    } else {
//                        System.out.println("We are at the start of the playlist");
//                        forward = true;
//                    }
//                    break;
//                case 3:
//                    if (forward) {
//                        if (iterator.hasPrevious()) {
//                            System.out.println("Replaying: " + iterator.previous().toString());
//                            forward = false;
//                        } else {
//                            System.out.println("we are at the start on the list");
//                        }
//
//                    } else {
//                        if (iterator.hasNext()) {
//                            System.out.println("Replaying: " + iterator.next().toString());
//                            forward = true;
//                        } else {
//                            System.out.println("we are at the end of the playlist");
//                        }
//                    }
//
//                    break;
//                case 4:
//                    printList(playlist);
//                    break;
//                case 5:
//                    printMenu();
//
//                    break;
//                case 6:
//                    if (playlist.size()>0){
//                        iterator.remove();
//                    }
//                    if (iterator.hasNext()){
//                        System.out.println("Now playing " + iterator.next().toString());
//                    } else if(iterator.hasPrevious()){
//                        System.out.println("Now playing " + iterator.previous().toString());
//                    } else {
//                        System.out.println("Playlist Empty");
//                    }
//            }
//
//        }
//
//
//    }
//
//    private static void printMenu() {
//        System.out.println(
//                "0 - to quit\n" +
//                        "1 - to play next\n" +
//                        "2 - to play previous\n" +
//                        "3 - to replay current song\n" +
//                        "5 - to print menu\n" +
//                        "6 - \n"
//        );
//
//    }
//
//    private static void printList(LinkedList<Song> playlist) {
//        ListIterator iterator = playlist.listIterator();
//        if (iterator.hasNext()) {
//            System.out.println("Now playing " + iterator.next().toString());
//        } else {
//            System.out.println("playlist completed");
//        }


    //////////////////////////////////////////////////////////////
//
//Player carlo = new Player("Carlo",15);
//
//    ISaveable werewolf = new Monster("Werewolf",20,10);
//
//        System.out.println(carlo.toString());
//        saveObject(carlo);
//
//        carlo.setStrength(20);
//        System.out.println(carlo);
//        carlo.setWeapon("Mace");
//        saveObject(carlo);
//        System.out.println(carlo.toString());
//        loadObject(carlo);
//        System.out.println(carlo);
//
//        System.out.println(werewolf);
//        saveObject(werewolf);
//        //object casting
//    System.out.println(((Monster)werewolf).getStrength());
//
//}
//    public static ArrayList<String> readValues(){
//        ArrayList<String> values = new ArrayList<String>();
//
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//
//        int index = 0 ;
//        System.out.println("Choose\n " +
//        "1 to enter a string\n"+
//        "0 to quit");
//
//        while (!quit){
//            System.out.println("Choose An Option");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice){
//
//                case 0:
//                    quit =true;
//                    break;
//
//                case 1:
//                    System.out.println("Enter a string");
//                    String stringInput = scanner.nextLine();
//                    values.add(index,stringInput);
//                    index++;
//                    break;
//            }
//        }
//        return values;
//    }
//    public static void saveObject(ISaveable objectToSave){
//        for (int i =0; i<objectToSave.write().size(); i++ ){
//            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
//        }
//
//
//    }
//
//    public static void loadObject(ISaveable objectToLoad){
//        ArrayList<String> values = readValues();
//        objectToLoad.read(values);
    private static Button button = new Button("print");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String output;
        for (int i = 1; i < 10; i++) {
            output = " ";

            for (int j = 1; j <= i; j++) {
                output += +i;

            }

            System.out.println(output);
        }

        System.out.println(Series.nSum(720));


//        class ClickListener implements Button.OnclickListener {
//
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(button.getTitle() + " was pressed");
//            }
//
//            public ClickListener() {
//                System.out.println("button created");
//            }
//
//
//
////        }
//        button.setOnClickListener(new Button.OnclickListener() {
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        });
//
//        listen();

//        GearBox toyota = new GearBox(8);
//        toyota.clutchIn(true);
//        toyota.changeGear(1);
//        System.out.println( toyota.wheelSpeed(1000));


        //////////////


    }
//    private static void listen() {
//
//        System.out.println("Choose\n" +
//                "0 - to quit\n" +
//                "1 - to click");
//
//        boolean quit = false;
//
//        while (!quit) {
//
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 0:
//                    System.out.println("Quitting");
//                    quit = true;
//                    break;
//                case 1:
//                    button.onClick();
//
//            }
//        }
//
//
//    }


}

