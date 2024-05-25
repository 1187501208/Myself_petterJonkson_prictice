package test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


//          ---------------->|实现接口类型MouseListener|
//         |
//         |---------------->|继承JFrame类|
//         |
//  |创建窗口的子类型MyJFrame2|------------------------------->----->|显示窗口|=====================>|传给测试类test3|======>|创建MyJFrame2对象|
//              |
//              |----------------->>|创建按钮对象jButton|----->|设置按钮属性|
//              |                          |
//              |                          |-------------------------------------------->|添加鼠标监听|--------->|实现接口方法|
//              |                          |
//              |                           ----------------->|添加按钮到窗口|
//              |
//              |----->|设置窗口属性|----->|创建标题|----->|设置窗口|
//              |
//              |
//               ------------------>直接重写接口所有方法(5个),重写后就可以直接在内部调用方法





public class MyJFrame2 extends JFrame implements MouseListener{

    //创建按钮对象1
    JButton jButton = new JButton("按钮1");

    public MyJFrame2() {
        //设置窗口大小
        this.setSize(603, 680);
        //创建标题
        this.setTitle("拼图游戏");
        //设置窗口居中
        this.setLocationRelativeTo(null);
        //设置窗口永远在最上层
        this.setAlwaysOnTop(true);
        //设置窗口关闭时退出程序
        this.setDefaultCloseOperation(3);
        //取消默认居中(否则会覆盖原布局情况)
        this.setLayout(null);


        //设置按钮1大小和位置
        jButton.setBounds(0, 0, 100, 50);
        //添加鼠标监听
        jButton.addMouseListener(this);
        this.getContentPane().add(jButton);

        //显示窗口
        this.setVisible(true);
    }

    //重写所有接口的方法
    //如果只需要其中部分方法,可以写一个接口实现类作为适配器,
    // 然后继承该类,再选择重写部分方法即可(抽象类同理)
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击了按钮");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下了按钮");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("释放了按钮");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("进入了按钮");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("离开了按钮");
    }

    //因为把这个设置成实现类和继承类,运行类需要单独设置
}
