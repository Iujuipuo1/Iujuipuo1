public class Student
{
    String name;
    int grade;
    String[] subjects = new String[2];
    int[] marks = new int[2];


    Student (){
        System.out.println("a new student is created");
    }


    public void receiveInfo(){
        //simulate the input by directly assigning value 
        name ="Tom";
        grade =9;   
    }

    public void outputInfo(){
        System.out.println("name" + name);
        System.out.println("grade" + grade);
    }


    public static void main(String[]args){
        Student s1 = new Student();
        
        s1.receiveInfo();
        s1.outputInfo();

    }

    
}
