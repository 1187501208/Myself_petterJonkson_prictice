package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//如果需要对对象进行操作,可以在对象自己里面设置各种属性和事件
// ,也可以在测试类里面创建一个对象,并在测试类里面直接调用对象的方法,设置对象的属性和事件

//直接用一个类继承JFrame类,实现ActionListener接口,重写方法
//本身就作为JFrame的对象来调用自己继承的方法
//本身作为ActionListener的实现类对象,也可以直接在本类里面重写接口的方法并调用
// 不用再单独定义一个实现类对象来实现接口
//和test2.java的写法对比方法不同
public class MyJFrame extends JFrame implements ActionListener{

    //把两个按钮放到成员位置
    //创建按钮对象1
    JButton jButton = new JButton("按钮1");
    //创建按钮对象2
    JButton jButton2 = new JButton("按钮2");



    public MyJFrame() {
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
        //添加动作监听(调用该方法,会根据用户行为判断是否调用重写的方法,而该重写的方法就是对机器行为的判断并该行为事件)
        //jButton表示组件对象,表示给哪个组件添加事件
        //addActionListener表示添加事件,表示给组件添加(动作监听:只有鼠标左键和空格键)
        //里面需要添加实现类对象(addActionListener里面是一个接口ActionListener的实现类对象类型的参数,需要重写方法也是ActionListener)
        jButton.addActionListener(this);
        //添加按钮到窗口
        this.getContentPane().add(jButton);
        //this.add(jButton);

        //设置按钮2大小和位置
        jButton2.setBounds(100, 100, 100, 50);
        jButton2.addActionListener(this);
        this.getContentPane().add(jButton2);

        //显示窗口
        this.setVisible(true);
    }

    //重写接口的方法(操作事件处理),参数ActionEvent e是事件(参考文档里面说明).
    //在方法重写的时候针对不同的按钮做不同的操作
    @Override
    public void actionPerformed(ActionEvent e) {
        //用getSource方法获取事件源,即事件的对象
        //把对象赋值给object类型,因为object是所有类的父类,可以接收所有类的对象实现多态
        Object source = e.getSource();

        //判断事件源是哪个按钮
        if (source == jButton) {
            System.out.println("点击了按钮1");
            //在分类里面也同时可以定义按钮的其他操作
            //改变按钮的大小
            jButton.setSize(200,200);

        } else if (source == jButton2) {
            System.out.println("点击了按钮2");
            //改变按钮的位置(随机)
            Random r=new Random();
            jButton2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }

    //因为把这个设置成实现类和继承类,运行类需要单独设置
}
