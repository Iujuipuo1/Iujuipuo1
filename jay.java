class jay{
    String name; 
    int grade = 0;
    static int total = 0;


jay(int grade){
    this.grade = grade;
    System.out.println("a new student is created");
    total = total + 1;


}

public static void main(String[] args) {
    jay s1 = new jay(9);
    jay s2 = new jay(10);
    System.out.println("s2.total= " + s2.total);
    System.out.println("s1.total= " + s1.total);
}

}

