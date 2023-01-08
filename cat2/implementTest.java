interface Animal {
    public void cowSound();
}

class Cow implements Animal {
    @Override
    public void cowSound() {
        System.out.print("Cow goes Moo!");
    }
}

public class implementTest {
    public static void main(String [] args) {
        Cow myCow = new Cow();
        myCow.cowSound();
    }
}
