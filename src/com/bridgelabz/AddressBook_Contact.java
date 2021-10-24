package com.bridgelabz;

public class AddressBook_Contact {
    private String firstName, lastName, city, state, zipCode, phoneNum, email;
    public AddressBook_Contact(){

    }
    public AddressBook_Contact(String Firstname, String LastName, String City, String State, String ZipCode, String PhoneNum, String Email){
        this.firstName=Firstname;
        this.lastName=LastName;
        this.city=City;
        this.state=State;
        this.zipCode=ZipCode;
        this.phoneNum=PhoneNum;
        this.email=Email;

    }

    public void setFirstName (String fname){
        this.firstName = fname;
    }
    public String getFirstName () {
        return firstName;
    }

    public void setLastName (String lname){
        this.lastName = lname;
    }
    public String getLastName () {
        return lastName;
    }

    public void setCity (String cname){
        this.city = cname;
    }
    public String getCity () {
        return city;
    }

    public void setZip (String pin){
        this.zipCode = pin;
    }
    public String getZip () {
        return zipCode;
    }

    public void setPhoneNum (String phone){
        this.phoneNum = phone;
    }
    public String setPhoneNum(long phone) {
        return phoneNum;
    }

    public void setState (String state){
        this.state = state;
    }
    public String getState () {
        return state;
    }

    public void setEmail (String email){
        this.email = email;
    }
    public String getEmail () {
        return email;
    }

    public void addContact() {
    }

    public String getPhoneNum() {
        return phoneNum;
    }
}
