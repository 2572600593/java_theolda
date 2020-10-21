package Demo3;

public class RegisterException extends Exception {

    public RegisterException() {  // 空参构造方法

    }

    public RegisterException(String message) {
        super(message);
    }
}
