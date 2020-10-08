package Case;

public class DemoMain {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();

        // 创建鼠标
//        Mouse mouse = new Mouse();
        // 向上转型
        USB usbMouse = new Mouse();
        laptop.useDevice(usbMouse);
        USB usbKeyboard = new KeyBoard();
        laptop.useDevice(usbKeyboard);

        laptop.powerOff();

    }
}
