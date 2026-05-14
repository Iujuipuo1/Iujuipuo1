public class Student1{
    String name = "Tom";
    int grade = 9;
    String gender = "Male";
    String[]  subjects = ["math", "English", "sports"];

    Student1 (String student_name){
        name = student_name;
        System.out.println("current student is;" + name);

    }
}
  public static void main(String[] args ){
    Student1 student1 = new Student("Jerry");
    Student1 student2 = new Student("Alice");


}

