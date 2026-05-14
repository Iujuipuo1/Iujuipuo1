public class Studentt {
   
    String name;
    int grade;
    String[] subjects = new String[2];
    int[] marks = new int[2];


    Studentt (){
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




    public float calAveMark(int m1, int m2 ){
        return(m1 + m2)/2;
    }

    public static void main(String[] args) {

         Studentt s1 = new Studentt();
    
         s1.receiveInfo();
         s1.outputInfo();
         System.out.println("average mark = " + s1.calAveMark(20, 50));

}
}