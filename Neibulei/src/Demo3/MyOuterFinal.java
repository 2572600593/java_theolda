package Demo3;

public class MyOuterFinal {

    public void methodOuter() {
        final int num = 10;

        class MyInner {
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
