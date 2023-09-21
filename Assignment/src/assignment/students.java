package assignment;

public class students {
    private String id;
    private String name;
    private String email;
    private int age;
    private String course;
    
   public students(String id, String name, int age, String email,String course) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.email = email;
    this.course = course;
   }
   public String takeStudentId(){
       return id;
   }
    public String takeStudentName(){
       return name;
   }
     public int takeStudentAge(){
       return age;
   }
      public String takeStudentEmail(){
       return email;
   }
       public String takeStudentCourse(){
       return course;
   }
    String studentID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String studentNames() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String studentAges() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String studentEmails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String studentCourses() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}