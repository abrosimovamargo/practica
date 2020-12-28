package ru.ssau.tk.abrosimovamargo.practice.zadachi;

public class Person {
    private  String firstName ;
    private  String lastName ;
    private  int passportId;

    Person(){
        firstName = "Abrosimova";
        lastName = "Margarita";
        passportId = 123456;
    }

    public Person(String myFirstName, String myLastName){
        firstName = myFirstName;
        lastName = myLastName;
    }

    Person(int myPassportId){
        passportId = myPassportId;
    }

    public Person(String myFirstName, String myLastName, int myPassportId){
        firstName = myFirstName;
        lastName = myLastName;
        passportId = myPassportId;
    }
    public void setFirstName(String firstName1) {
        firstName = firstName1;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName1) {
        lastName = lastName1;
    }
    public String getLastName() {
        return lastName;
    }

    public void setPassportId(int passportId1) {
        passportId = passportId1;
    }
    public int getPassportId() {
        return passportId;
    }

    public String toString() {
        return firstName + (firstName.isEmpty() || lastName.isEmpty() ? "" : " ") + lastName;
    }

}


