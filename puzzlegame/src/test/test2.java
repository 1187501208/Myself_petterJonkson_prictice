package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//
//
//  |测试类test2|----->|创建窗口对象jFrame|------------------>----->|显示窗口|
//                              |
//                              |----------------->>|创建按钮对象jButton|----->|设置按钮属性|
//                              |                          |
//                              |                          |-------------------------------------------->|添加动作监听|--------->|实现接口方法|
//                              |                          |                                                   |
//                              |                           ----------------->|添加按钮到窗口|                  |
//                              |                                                                               ------------------>在参数(是接口)里面创建匿名内部类,重写接口所有方法(1个),用匿名内部类实现接口方法
//                               ----->|设置窗口属性|----->|创建标题|----->|设置窗口|



public class test2 {
    public static void main(String[] args) {
        //创建窗口
        JFrame jFrame= new JFrame();
        //设置窗口大小
        jFrame.setSize(603,680);
        //创建标题
        jFrame.setTitle("拼图游戏");
        //设置窗口居中
        jFrame.setLocationRelativeTo(null);
        //设置窗口永远在最上层
        jFrame.setAlwaysOnTop(true);
        //设置窗口关闭时退出程序
        jFrame.setDefaultCloseOperation(3);
        //取消默认居中(否则会覆盖原布局情况)
        jFrame.setLayout(null);

        //创建按钮对象
        JButton jButton = new JButton("按钮");
        //设置按钮大小和位置
        jButton.setBounds(0,0,100,50);
        //添加动作监听
        //jButton表示组件对象,表示给哪个组件添加事件
        //addActionListener表示添加事件,表示给组件添加(动作监听:只有鼠标左键和空格键)
        //里面需要添加实现类对象(addActionListener里面是一个接口ActionListener的实现类对象类型的参数,需要重写方法是actionPerformed)
        //jButton.addActionListener(new MyActionListener());

        //因为只用到了一次该功能,所以可以在里面定义一个匿名内部类,不用再单独定义一个MyActionListener类来实现接口.
         /*ActionListener al= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了按钮");
            }
        };
        jButton.addActionListener(al);*/
        //把对象直接添加到参数中来,简化代码
        jButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了按钮");
            }
        }
        );

        //添加按钮到窗口
        jFrame.getContentPane().add(jButton);
        //jFrame.add(jButton);

        //显示窗口
        jFrame.setVisible(true);

    }
}
