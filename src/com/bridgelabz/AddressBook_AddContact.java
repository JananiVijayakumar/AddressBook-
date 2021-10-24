package com.bridgelabz;

import java.util.*;

public class AddressBook_AddContact {
    static Scanner sc = new Scanner(System.in);
    static AddressBook_Contact book1 = new AddressBook_Contact();
    static ArrayList<AddressBook_Contact> man1 = new ArrayList<AddressBook_Contact>();

    //Created method for adding contact
    public static void addContact(){
        System.out.print("Enter First Name : ");
        String fN = sc.nextLine();
        book1.setFirstName(fN);

        System.out.print("Enter Last Name : ");
        String lN = sc.nextLine();
        book1.setLastName(lN);

        System.out.print("Enter Email-id : ");
        String eId = sc.nextLine();
        book1.setEmail(eId);

        System.out.print("Enter Cell Num : ");
        long phone = Long.parseLong(sc.nextLine());
        book1.setPhoneNum(phone);

        System.out.print("Enter City : ");
        String city = sc.nextLine();
        book1.setCity(city);

        System.out.print("Enter Zip : ");
        String zIp = sc.nextLine();
        book1.setZip(zIp);

        System.out.print("Enter Sate : ");
        String state = sc.nextLine();
        book1.setState(state);

        man1.add(book1);
    }

    //Editing Contact
    public static void editContact(){
        System.out.println("Welcome to edit Address Book Program");
        System.out.println("Enter Name for Confirmation : ");
        String name = sc.nextLine();
        for (int i =0; i<man1.size(); i++){
            if(man1.get(i).getFirstName().equalsIgnoreCase(name)){
                man1.remove(i);
                addContact();
                System.out.println("Successfully Edit Data");
            }else {
                System.out.println("No Data Found in Address Book");
            }
        }
    }

    public static void main(String[] args) {
        AddressBook_Contact book = new AddressBook_Contact();

        System.out.println("Welcome to Address Book Program");
        System.out.println("1: Add a new Contact to AddressBook");
        addContact();
        editContact();

        //printing AddinBook class book1 objet method call
        AddressBook_AddContact addressbook = new AddressBook_AddContact();
        addressbook.addContact();
        System.out.println("Updated Succfully!!!!");



    }
}
