package Deanery; //TODO package names should be lowercase

//TODO if you extend this class, it could be abstract - because we don't want to create Students that are neither PartTime nor FullTime
public class Student extends Exception { //TODO Noooo not like that - if you extend an exception, it means that a Student class IS AN EXCEPTION itself - and that is not true
    private final int id;
    private final String name;
    private final String lastName;

    public Student(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }
}
