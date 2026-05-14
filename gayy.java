public class gayy {
    String name = "TOm";
    int[] mark = {90,70};

    public void changeMark(){
        int[] m = mark;
        m[0] = m[0] + 2;
        System.out.println("m[0]=" + m[0]);

    }


    public static void main(){

        gayy s1 = new gayy();
        s1.changeMark();
        System.out.println("mark[0]="+s1.mark[0]);
    }

    
}
