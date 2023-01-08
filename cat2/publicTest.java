public class publicTest {
    public String fname = "Ronnie";
    public String lname = "Kaballah";
}

class Two {
    public static void main(String [] args) {
        publicTest myDetails = new publicTest();
        System.out.print("First Name: " + myDetails.fname);
    }
}
