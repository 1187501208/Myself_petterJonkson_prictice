package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//实现的是ActionListener接口类型
public class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        //这里是实现接口的方法,需要在这里写具体的业务逻辑
        //这里是点击按钮后的业务逻辑
        System.out.println("点击了按钮");
    }
}
