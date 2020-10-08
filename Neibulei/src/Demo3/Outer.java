package Demo3;

// 局部内部类：在外部类的方法中 定义的内部类
// 只有当前所属的方法可以使用局部内部类

/*
定义类时，权限修饰符规则:
外部类：public / (default)
成员内部类：public / protected / (default) / private
局部内部类：不写修饰符
 */
public class Outer {

    public void methodOuter() {
        class Inner {  // 局部内部类
            int num = 10;
            public void methodInner() {
                System.out.println(num);
            }
        }

        Inner inner = new Inner();  // 在所属方法里使用局部内部类
        inner.methodInner();
    }
}
