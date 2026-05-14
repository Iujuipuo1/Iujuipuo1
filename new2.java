import java.util.Arrays;

public class new2 {
    public static void main(String[] args) {

        int[] marks = {90, 85, 88};

        new1 s1 = new new1("Tom", 9, marks);

        s1.setName("Tom junior");
        
        s1.setMark(marks);

        System.out.println(s1.getName());
        System.out.println(Arrays.toString(s1.getMark()));
        System.out.println(s1.getGrade());

    }   
}
