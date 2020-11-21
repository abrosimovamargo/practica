package ru.ssau.tk.abrosimovamargo.practice.zadachi;

class MainClass {
    public static void main(String[] s) {
        Person a1 = new Person();
        a1.setLastName("Abrosimova");
        a1.setFirstName("Margarita");
        a1.setPassportId(123456);
        Person o1 = new Person();
        o1.setLastName("Beresina");
        o1.setFirstName("Svetlana");
        o1.setPassportId(654321);
    }
};
public class Person {
    private  String firstName ;
    private  String lastName ;
    private  int passportId;

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

}


