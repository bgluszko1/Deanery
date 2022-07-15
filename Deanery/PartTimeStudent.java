package Deanery;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//TODO a bit of formatting would be required here -> use CTRL + ALT + L in IntelliJ e.g.
//basically -> there should be new lines between class declaration, constructor, method, some logic blocks etc.
public class PartTimeStudent extends Student {
    public PartTimeStudent(int id, String name, String lastName) {
        super(id, name, lastName);
    }
    public void serve(String roomNumber, int hour) throws Exception {
        //TODO You have some hardcoded logic here -> imagine we needed to add a new room that could serve the PartTimeStudents
        // then you would need to write an extra comparison of objects and it's hours
        // that is why a better way would be to introduce an enum/class that would represent a Room -> each room would have the info about
        // the opening and  closing hour in itself and it could contain a method verifying whether the hour is correct
        // then in this class you could simply keep a reference to a collection of Rooms that are suitable for a PartTime student
        // and let the Room enum handle the hours checking
        if(roomNumber.equals("C124") || roomNumber.equals("D124")) { //TODO a room number can be null -> it is better to either handle the null and throw an exception that it cannot be null
            // or use "C123".equals(roomNumber) - because we now for sure a String "C123" is not a null
            if((roomNumber.equals("C124") && (hour>= 9 && hour <=13)) || (roomNumber.equals("D124") && (hour>= 17 && hour <= 20))) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
                //TODO try not to use meaningless names of the objects like dtf -> it is harder to understand the code when they are mentioned later
                LocalDateTime now = LocalDateTime.now();
                //TODO instead of so many System outs, it would be better to create a one String e.g. with StringBuilder and then print it out -> that way you would be sure that if there is some error during the displaying, you wouldn't get the partial report printed to console
                System.out.println("--------------------------------------");
                System.out.println("STUDENT " + getId());
                //TODO when you write the spaces like that -> the report would not be properly formatted, when a first name and last name have different lengths
                //TODO it is better to use the String format with the %<number>s fixed length to set the maximum length of a string that would be filled with spaces -> this way the table would look like a table not just some random "|" characters
                System.out.println("First Name " + "        |   " + getName() + "        |");
                System.out.println("Second Name " + "        |   " + getLastName() + "        |");
                System.out.println();
                System.out.println("Raport generated on " + dtf.format(now));
                System.out.println("Room number: " + roomNumber);
                System.out.println("--------------------------------------");
            }
            else {
                throw new Exception("Incorrect hour!"); //TODO throwing a general Exception is a bad practice -> use some custom exception or at least IllegalArgumentException here
                //        an example of the custom exception (in a new file of course)
                //        public class RoomNotFoundException extends Exception {
                //            private static final String MESSAGE = "ROOM WITH THIS NUMBER DOES NOT EXIST!";
                //
                //            public RoomNotFoundException() {
                //                super(MESSAGE);
                //            }
                //        }

            }
        } else {
            throw new Exception("Incorrect room!");
        }
    }
}
