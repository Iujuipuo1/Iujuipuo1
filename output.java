public class output{
    String s1;
    
    public void main(){
    s1 = "It is a String";

    int length = s1.length();
    
    System.out.println("The length is: " + length);
    
    int indexS = s1.indexOf("S");
    System.out.println("S is at:  " + indexS);
    


    int i = 0;
    while(i<s1.length()){
        System.out.println(s1.charAt(i));
        i++;
    }
}
}
