public class Prac {
    public String name;
    public int grade;
    public int[] marks = {90, 87, 89, 85, 91};
    public String[] subjects = {"ma", "eng", "ba", "cs", "mu"};

    public int getMark(String sub) {
        for (int i = 0; i < subjects.length; i++) {
            if (sub.equals(subjects[i])) {
                return marks[i];  // return the mark at the same index
            }
        }
        return -1;  // subject not found
    }

    public static void main(String[] args) {
        Prac student = new Prac();
        student.name = "Alice";
        student.grade = 11;

        System.out.println("Student: " + student.name + ", Grade: " + student.grade);
        System.out.println("Mark in cs: " + student.getMark("cs"));   // 85
        System.out.println("Mark in eng: " + student.getMark("eng")); // 87
        System.out.println("Mark in history: " + student.getMark("history")); // -1
        System.out.println(student.getMark("ex")); // -1

    }
    

}
