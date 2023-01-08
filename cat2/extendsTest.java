// public class extendsTest {
    class Unit {
        String unit1 = "Java Programming";
    }
    class Lecturer extends Unit {
        String name = "Bahati Opetu";
    
        public static void main(String [] args) {
            Lecturer test1 = new Lecturer();
            System.out.println("Lecturer " + test1.name);
            System.out.println("Unit name "+ test1.unit1);
        }
    }
// }
