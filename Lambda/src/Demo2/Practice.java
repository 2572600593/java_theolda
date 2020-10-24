package Demo2;

public class Practice {

    public static void main(String[] args) {
        invokeCook(() -> {
            System.out.println("吃饭啦！");
        });
    }

    private static void invokeCook(Cook c) {
        c.makeFood();
    }

}
