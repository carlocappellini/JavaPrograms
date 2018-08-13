package com.carlocappellini;


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        Bank bank = new Bank("SSFCU");


        bank.addBranch("Texas");

        bank.addCustomer("Texas", "Carlo", 10.0);
        bank.addCustomer("Texas", "Jessica", 18.89);
        bank.addCustomer("Texas", "Percy", 56.92);
        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Percy", 6.3);
        bank.addCustomer("Sydney", "Bob", 40.4);

        bank.addCustomerTransaction("Texas", "Jessica", 44.2);

        bank.addCustomerTransaction("Texas", "Carlo", 2.3);

        bank.addCustomerTransaction("Sydney", "Percy", 9.2);


        bank.listCustomers("Texas", true);

        bank.addBranch("melbourne");

        if (!bank.addCustomer("melbourne", "Brian", 5.4)) {
            System.out.println("ERROR melbourne brian does not exist");
        }
    }
}
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











