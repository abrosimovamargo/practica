package ru.ssau.tk.abrosimovamargo.practice.zadachi;

public class MainClass {
        public static void main(String[] s) {
            Person a1 = new Person();
            a1.setLastName("Abrosimova");
            a1.setFirstName("Margarita");
            a1.setPassportId(123456);
            Person a2 = new Person();
            a2.setLastName("Beresina");
            a2.setFirstName("Svetlana");
            a2.setPassportId(654321);
            Person a3 = new Person();
            Person a4 = new Person("Venera", "Abrosimova");
            Person a5 = new Person(456789);
            Person a6 = new Person("Rita","Abrosimova",987654);
            Point myPoint1 = new Point(0,0,0);
            Point myPoint2 = new Point(1,6,4);
            Point myPoint3 = new Point(47,6,0);
        }

}
