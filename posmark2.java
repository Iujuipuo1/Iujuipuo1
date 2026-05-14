public class posmark2 extends pos{
    public int getMark(int index) {
        if(index >= 0 && index <marks.length)
            super.getMark(index);

    }

    public posmark2(){
        super();
    }

    public static void main(String[] args){
        posmark2 s1 = new posmark2();
    
    }
}

