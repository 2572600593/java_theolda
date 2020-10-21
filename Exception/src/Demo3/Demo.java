package Demo3;

import java.util.Scanner;

public class Demo {
    static String[] usernames = {"a","b","c"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名:");
        String username = sc.next();
        checkUsername(username);
    }

    // 判断用户名
    public static void checkUsername(String username) /*throws RegisterException*/ {  // 输入的用户名
        for(String name : usernames) {  // 数据库存储的用户名
            if(name.equals(username)) { // 比较
                // true :抛x出异常
                try {
                    throw new RegisterException("该用户名已被注册");
                } catch(RegisterException e) {
                    e.printStackTrace();
                    return;  // 使用RuntimeException(运行期异常)不用return
                }
            }
        }
        System.out.println("注册成功");
    }
}
