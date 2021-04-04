package belajar;
/*
    NAMA    : AHMAD WILDAN
    NIM     : E41201452 
*/
public class ManagingPeople {
    
    private String firstName, lastName, studentId, studentStatus;

    public ManagingPeople(String firstName, String lastName, String studentId, String studentStatus) {
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
        ManagingPeople getData = new ManagingPeople ("Ahmad", "Wildan", "E41201452", "Active");
        ManagingPeople getValue = new ManagingPeople ("Reza", "Oktaviany", "E41208764", "Active");
     
        // Mengambil Data Berdasarkan Variabel (studentId)
        if (getData.get_studentId() == getValue.get_studentId()) {
            System.out.println(getData.get_firstName()+ " is the same status as " + getValue.get_firstName());
        }
        else {
            System.out.println(getData.get_firstName()+ " is NOT the same status as " + getValue.get_firstName());
        }
        
        // Mengambil Data Berdasarkan Variabel (studentStatus)
        if (getData.get_studentStatus() == getValue.get_studentStatus()) {
            System.out.println(getData.get_firstName()+ " is the same status as " + getValue.get_firstName());
        }
        else {
            System.out.println(getData.get_firstName()+ " is NOT the same status as " + getValue.get_firstName());
        }
    }
}