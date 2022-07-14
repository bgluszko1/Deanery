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

        FullTimeStudent student = new FullTimeStudent(studentId,"Bartosz", "Głuszko");
        student.serve(roomNumber, hour);

        PartTimeStudent student1 = new PartTimeStudent(255222,"Maria","Costam");
        student1.serve("D124", 19);
    }
}
