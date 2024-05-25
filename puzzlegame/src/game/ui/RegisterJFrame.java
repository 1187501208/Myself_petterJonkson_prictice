package game.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame{

    //初始化
    public RegisterJFrame(){
        //创建一个注册界面
        this.setSize(488,430);
        //设置界面标题
        this.setTitle("拼图 注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭时退出程序(不同的数字代表不同的退出方式)
        //参考文档:0关闭无线,1关闭当前窗口,2关闭当前窗口且关闭最后一个窗口时退出,3关闭当前窗口时就退出
        this.setDefaultCloseOperation(3);

        //显示(最后)
        this.setVisible(true);
    }
}
