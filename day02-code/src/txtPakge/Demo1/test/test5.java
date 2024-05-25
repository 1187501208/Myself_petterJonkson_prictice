package txtPakge.Demo1.test;

public class test5 {
    public static void main(String[] args) {
        /*需求:
        一座寺庙住着三个和尚,身高分别为150cm,210cm,165cm.
        用程序获取三者最大值
         */

        //1.初始化
        int a=150;int b=210;int c=165;
        //2.比较大小
        int max=a>b?a:b;
        //自动格式化代码:ctrl+alt+L
        //上/下移一行代码ctrl+shift+上下键
        System.out.println("最高身高为:"+(max=max>c?max:c));
    }
}
