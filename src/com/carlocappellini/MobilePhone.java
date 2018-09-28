package com.carlocappellini;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;


    public String getMyNumber() {
        return myNumber;
    }


    public MobilePhone() {
        this.myContacts = new ArrayList<Contact>();
    }


    public boolean searchContact(Contact search) {
        if (myContacts.contains(search)) {
            System.out.println("Contact Found " + search + search.getPhoneNumber());
            return true;
        }
        return false;
    }


    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);

        if (position < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contact.getName() + " removed");
        return true;

    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contacts) {

        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);

            if (contact.getName().equals(contacts)) {
                return i;
            }
        }
        return -1;
    }


    public boolean updateContact(Contact oldContact, Contact newContact) {
        int pos = findContact(oldContact);
        if (pos < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already taken\n" +
                    "Error updating");
            return false;
        }

        myContacts.set(pos, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getPhoneNumber());
        return true;


    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }


    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contacts List");

        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + "." + this.myContacts.get(i).getName() + this.myContacts.get(i).getPhoneNumber());
        }
    }

}

