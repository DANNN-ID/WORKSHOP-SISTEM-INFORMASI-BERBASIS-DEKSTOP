package belajar;
/*
    NAMA    : AHMAD WILDAN
    NIM     : E41201452 
*/
public class Person {
    
    private String firstName, lastName, studentId, studentStatus;

    public Person(String firstName, String lastName, String studentId, String studentStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.studentStatus = studentStatus;
    }

    public String get_firstName() {
        return firstName;
    }

    public String get_lastName() {
        return lastName;
    }

    public String get_studentId() {
        return studentId;
    }

    public String get_studentStatus() {
        return studentStatus;
    }
    
    public static void main(String[] args) {
        Person getData = new Person ("Ahmad", "Wildan", "E41201452", "Active");
        
        System.out.println();
        System.out.println("Student Name    : " + getData.get_firstName() + " " + getData.get_lastName());
        System.out.println("Student ID      : " + getData.get_studentId());
        System.out.println("Student Status  : " + getData.get_studentStatus());
        System.out.println();
    }
    
}