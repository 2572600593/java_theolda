package Demo2FanXing;


public class MyGenericInterfaceImpl<E> implements MyGenericInterface<E> {

    @Override
    public void add(E e) {
        System.out.println(e);
    }

    @Override
    public E getE() {
        return null;
    }
}
