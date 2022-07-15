package Deanery;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FullTimeStudent extends Student{
    public FullTimeStudent(int id, String name, String lastName) {
        super(id, name, lastName);
    }
    //TODO same as in the PartTimeStudent class
    // + as you can see there is some duplication of a code in here -> it would be better to keep the verification logic in the Student class
    // and only keep the proper Rooms collection in the child classes
    public void serve(String roomNumber, int hour) throws Exception {
        if(roomNumber.equals("A123") || roomNumber.equals("B123")) {
            if((roomNumber.equals("A123") && (hour>= 8 && hour <=16)) || (roomNumber.equals("B123") && (hour>= 9 && hour <= 17))) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
                LocalDateTime now = LocalDateTime.now();
                System.out.println("--------------------------------------");
                System.out.println("STUDENT " + getId());
                System.out.println("First Name " + "        |   " + getName() + "        |");
                System.out.println("Second Name " + "        |   " + getLastName() + "        |");
                System.out.println();
                System.out.println("Raport generated on " + dtf.format(now));
                System.out.println("Room number: " + roomNumber);
                System.out.println("--------------------------------------");
            }
            else {
                throw new Exception("Incorrect hour!");
            }
        } else {
            throw new Exception("Incorrect room!");
        }
    }
}
