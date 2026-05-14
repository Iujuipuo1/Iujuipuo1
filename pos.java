public class pos{
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
    public int getMark(int pos){
        return marks[pos];

    }
}
