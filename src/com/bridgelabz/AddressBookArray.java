package com.bridgelabz;
import java.util.*;
public class AddressBookArray {
    public class AddressBookArrayElement extends AddressBook_Contact {
        Scanner sc=new Scanner(System.in);
        private ArrayList<AddressBook_Contact> contactList = new ArrayList<AddressBook_Contact>();

        public AddressBookArrayElement(){
            super();
        }

        public AddressBookArrayElement(String fN, String lN, String eId, String cell, String city, String zIp, String state) {
            super(fN, lN, eId, cell, city, zIp, state);
        }
        public void insertContact(AddressBookArrayElement contactDetailsobj){
            contactList.add(contactDetailsobj);
        }

        public void editContact(String nameToEdit){
            for(AddressBook_Contact editContact: contactList) {
                if (editContact.getFirstName().equalsIgnoreCase(nameToEdit)) {

                    System.out.println("Edit Firstname : ");
                    String firstname = sc.nextLine();
                    editContact.setFirstName(firstname);

                    System.out.println("Edit Lastname : ");
                    String lastname = sc.nextLine();
                    editContact.setLastName(lastname);

                    System.out.println("Edit Email : ");
                    String email = sc.nextLine();
                    editContact.setEmail(email);

                    System.out.println("Edit Phone Number : ");
                    long phoneNum = Long.parseLong(sc.nextLine());
                    sc.nextLine();
                    editContact.setPhoneNum(phoneNum);

                    System.out.println("Edit City : ");
                    String city = sc.nextLine();
                    editContact.setCity(city);

                    System.out.println("Edit Zip code : ");
                    String zip = sc.nextLine();
                    editContact.setZip(zip);

                    System.out.println("Edit State : ");
                    String state = sc.nextLine();
                    editContact.setState(state);


                }
            }
        }

        public  void delete(String nameToDelete){
            for (int i=0; i<contactList.size(); i++){
                if (contactList.get(i).getFirstName().equals(nameToDelete)){
                    contactList.remove(i);
                    System.out.println("Contact is Deleted");
                }else {
                    System.out.println("Contact not found!!!");
                }
            }
        }
        /**
         * This printContactDetails will print all the information after data got edited.
         */
        public void printContactDetails(){
            for(AddressBook_Contact getInfo: contactList) {
                System.out.println("Firstname : " + getInfo.getFirstName());
                System.out.println("Lastname : " + getInfo.getLastName());
                System.out.println("City : " + getInfo.getCity());
                System.out.println("State : " + getInfo.getState());
                System.out.println("Zip : " + getInfo.getZip());
                System.out.println("PhoneNumber : " + getInfo.getPhoneNum());
                System.out.println("Email : " + getInfo.getEmail());
            }
        }
    }

}
