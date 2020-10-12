package Demo2FanXing;

public class GenericInterface {

    public static void main(String[] args) {
        MyGenericInterfaceImpl<Integer> g2 = new MyGenericInterfaceImpl<>();
        g2.add(2);

        System.out.println(g2.getE());
    }
}
