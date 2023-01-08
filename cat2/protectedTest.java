public class protectedTest {
    protected String fname = "Tony";
    protected String lname = "Ochieng";
}

class Three extends protectedTest {
    public static void main(String [] args) {
        Three myDetails = new Three();
        System.out.println("First Name: " + myDetails.fname);
    }
}
