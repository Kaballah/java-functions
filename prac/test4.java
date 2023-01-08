public class test4 {
    public static void main(String [] args) {
        findUniq(new double[]{ 1, 1, 1, 2, 1, 1 });
    }

    public static double findUniq(double arr[]) {
      
        for(int i = 0; i <= arr.length; i++) {
            int a = i++;

            if(i == a) {
                System.out.print(i);
                i++;
            }
            i++;
        }
          
        return arr[0];
    }
}
