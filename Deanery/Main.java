package Deanery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the room number: ");
        String roomNumber = sc.nextLine();
        System.out.println("Enter the hour: ");
        int hour = sc.nextInt();
        System.out.println("Enter student id: ");
        int studentId = sc.nextInt();

        //TODO instead of declaring those objects a FullTimeStudent/PartTimeStudent you could use
        //Student student = new FullTimeStudent(...)
        //and then keep those students in a collection
        //when a user enters the student ID -> you search for the student in a collection and call the serve method for that student
        // to do it, a Student class should have a serve method and FullTime and PartTime could override it/or only specify it a bit
        FullTimeStudent student = new FullTimeStudent(studentId,"Bartosz", "Głuszko");
        student.serve(roomNumber, hour);

        PartTimeStudent student1 = new PartTimeStudent(255222,"Maria","Costam");
        student1.serve("D124", 19);
    }
}
