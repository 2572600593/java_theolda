package Case;

// 笔记本类
public class Laptop {

    public void powerOn() {
        System.out.println("开机");
    }

    public void powerOff() {
        System.out.println("关机");
    }

//    使用接口作为方法参数
    public void useDevice(USB usb) {
        usb.open();

        // 向下转型
        if(usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        else if(usb instanceof KeyBoard) {
            KeyBoard keyboard = (KeyBoard) usb;
            keyboard.type();
        }

        usb.cloth();
    }
}
