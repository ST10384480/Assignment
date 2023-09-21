package assignment;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Assignment {
    private static ArrayList<students> students = new ArrayList<>();
    private static final int maxStudents = 4;
    private static int[] studentID = new int[maxStudents];
    private static String[] studentNames = new String[maxStudents];
    private static int[] studentAges = new int[maxStudents];
    private static String[] studentEmails = new String[maxStudents];
    private static String[] studentCourses = new String[maxStudents];
    private static int studentCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Student management application:");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String input = scanner.nextLine();
            if (!input.equals("1")) {
                break;
            }
            displayMainMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    captureStudent(scanner);
                    break;
                case 2:
                    searchStudent(scanner);
                    break;
                case 3:
                    deleteStudent(scanner);
                    break;
                case 4:
                    printStudentReport();
                    break;
                case 5:
                    System.out.println("Exiting Application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    private static void displayMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("**********************************");
        System.out.println("Please select one of the following menu options:");
        System.out.println("1. Capture a new student.");
        System.out.println("2. Search for a student.");
        System.out.println("3. Delete a student.");
        System.out.println("4. Print student report.");
        System.out.println("5. Exit Application");
    }
    private static void captureStudent(Scanner scanner) {
        System.out.println("Capture a new student:");
        System.out.print("Insert student id: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.print("Insert student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Insert student age: ");
        String ageInput = scanner.nextLine();
        System.out.print("Insert student email: ");
        String studentEmail = scanner.nextLine();
        System.out.print("Insert student course: ");
        String studentCourse = scanner.nextLine();

        studentNames[studentCount] = studentName;
        studentEmails[studentCount] = studentEmail;
        studentCourses[studentCount] = studentCourse;
        studentCount++;
        System.out.println("Student details have been captured successfully.");
    }
    private static void searchStudent(Scanner scanner) {
        System.out.println("Please insert student ID:");
        String searchId = scanner.nextLine();
       boolean foundStudent = false;
       for(students x: students) {
          
        if( x.takeStudentId().equalsIgnoreCase(searchId)){
    
            
        System.out.println("Student has been found");
        System.out.println("Student ID" + x.studentID());
        System.out.println("Student name" + x.studentNames());
        System.out.println("Student age" + x.studentAges());
        System.out.println("Student email" + x.studentEmails());
        System.out.println("Student course" + x.studentCourses());
                boolean findStudent = true;
    }
            }
        boolean findStudent = false;

        if(!findStudent){
           System.out.println("Student with ID" + searchId + "was not found");
       }
    }
        
    
    private static void deleteStudent(Scanner scanner) {
      System.out.println("Insert student ID you wish to delete:");
      String deleteId = scanner.nextLine();
      boolean foundStudent = false;
      student studentDelete = null;
      for(assignment.students x : students){
      if( x.takeStudentId().equalsIgnoreCase(deleteId)){
          assignment.students studentsDelete = x;
              break;
      }
      }
    if(studentDelete!= null){
              System.out.println("are you sure you want to delete student" + deleteId);
              String confirmation = scanner.nextLine().toLowerCase();
              if(confirmation.equals("y")){
                  students.remove(studentDelete);
                  System.out.println("Student with ID" + deleteId + "has been deleted");
              }else{
                  System.out.println("Student with ID" + deleteId + " has not been deletd");
              }
          }else{
        System.out.println("Student with ID:" + deleteId + "was not found");
    }         
          }
      
          
    private static void printStudentReport() {
        System.out.println("STUDENT REPORT");
        System.out.println("**********************************");
        for (int i = 0; i < studentCount; i++) {
        System.out.println("Student ID: " + studentID[i]);
        System.out.println("Name: " + studentNames[i]);
        System.out.println("Age: " + studentAges[i]);
        System.out.println("Email: " + studentEmails[i]);
        System.out.println("Course: " + studentCourses[i]);
        System.out.println("**********************************");
        }
    }
}
    //reference
//https://www.youtube.com/watch?v=1KTArjYPMEo YOUTUBE CHANNEL NAME: Math and Science DATE VIDEO WAS POSTED: 5 Years ago DATE ACCESSED: 14 September 2023
//https://www.youtube.com/watch?v=Om3qzMoaIUo YOUTUBE CHANNEL NAME: Bro Code  DATE VIDEO WAS POSTED: 2 Years ago DATE ACCESSED: 14 September 2023    
//https://www.youtube.com/watch?v=arcTW_znJYY YOUTUBE CHANNEL NAME:                DATE VIDEO WAS POSTED:   Years ago DATE ACCESSED: 14 September 2023
//https://www.youtube.com/watch?v=CHVVEGRGiJU YOUTUBE CHANNEL NAME: Alex Lee  DATE VIDEO WAS POSTED: 4Years ago  DATE ACCESSED: 20 September 2023
//https://www.youtube.com/watch?v=Qb9O8Z5TWA0 YOUTUBE CHANNEL NAME: AR Techniques  DATE VIDEO WAS POSTED: 2 Years ago  DATE ACCESSED: 20 September 2023
//https://www.javatpoint.com/post/java-scanner-nextboolean-method
//https://www.geeksforgeeks.org/scanner-nextboolean-method-in-java-with-examples/
//https://www.w3schools.com/java/java_arrays.asp
//https://www.w3schools.com/java/java_inheritance.asp

