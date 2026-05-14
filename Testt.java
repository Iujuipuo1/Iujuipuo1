class Testt{
    int[] a = {7,2,11,5,3};

    public static int find_min(int[] a){
        int max = a[0];

        int n = a.length;

        for (int i = 0; i < n; i++ ){
            
          if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
    int[] arr = {7, 2, 11, 5, 3};
    System.out.println("Minimum value: " + find_min(arr));

}
}