public class TestArray {
    public static void main (String[] args) {
        int[] m = {40,80,50,10,100,100};	//  array initialised
        int total=0;
        // Write the code to find the sum of all array elements
        
        for(int i = 0; i < m.length; i++) {
            total = total + m[i];
        }

        System.out.println("Total value = "+ total);	
    }
}
