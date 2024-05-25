import game.ui.GameJFrame;
import game.ui.LoginJFrame;
import game.ui.RegisterJFrame;

public class APP {
    public static void main(String[] args) {
        //创建三个对象,代表三个界面入口,在创建的时候利用初始化创建界面
        //在用new创建本类对象的时候就相当于创建了一个界面new JFrame,所以不用再在本类里面再创建对象了
        //直接用this调用对象自身
        new GameJFrame();
        new LoginJFrame();
        new RegisterJFrame();
    }
}

