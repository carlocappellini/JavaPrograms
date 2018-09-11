package com.carlocappellini;

import com.sun.glass.events.mac.NpapiEvent;

public class MyLinkedList implements NodeList {

    protected ListItem root = null;


    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public void setRoot(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            System.out.println(newItem.getValue());
            return true;
        }

        ListItem currentItem = this.root;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));

//
            if (comparison < 0) {
                // new item is greater , move right
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, insert at the end list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //  new item is less, insert before

                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    //the node with previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;

                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present");
                return false;

            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();

            }
        }
    }


    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);

//        String data = " z x c n b d a g h";


//        String[] array = data.split(" ");


//        for (String s : array) {
//            list.addItem(new Node(null));
//        }


        Node node = new Node("3");
        Node node1 = new Node("4");
        Node node2 = new Node("5");
        Node node3 = new Node(6);
        Node node4 = new Node("hola");

        list.addItem(node);
        list.addItem(node1);

        list.addItem(node2);
        list.addItem(node3);

        list.addItem(node4);
        list.traverse(list.getRoot());


    }
}


