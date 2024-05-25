package game.ui;

import javax.swing.*;
import java.util.Random;

//继承JFrame类,因为要在本类里面使用JFrame类的方法
public class GameJFrame extends JFrame {

    //利用空参构造进行初始化设置
    public GameJFrame(){
        //初始化界面(ctrl+alt+M提取方法)
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //打乱图片顺序
        int[][] images=imageRandom();

        //初始化图片
        initImage(images);

        //界面默认是隐藏的,需要设置显示,一般写在最后
        this.setVisible(true);
    }


    //打乱
    private int[][] imageRandom() {
        //在GameJFrame类里面调用时就直接把图片索引对应每个图片路径
        //把二维数组存储的序号按照对应取出该图片,再存放在窗体里面(前提是图片是按照1-15的顺序命名的)

        //列出图片索引代替图片
        int[] image={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //把图片索引打乱
        Random r=new Random();
        for (int i = 0; i < image.length; i++) {
            int index=r.nextInt(image.length);
            int temp=image[i];
            image[i]=image[index];
            image[index]=temp;
        }
        //创建二维数组(如果只是存放的话,把一维数组打乱就行,存放时依次按照顺序存放就行
        // ,但是为了方便后续可能要按照位置的索引来对图片进行调换和移动,所以还是用二维数组存放一次更方便)
        int[][] images=new int[4][4];
        //把图片打乱后的索引依次放到二维数组里面
        //解法一:(遍历二维数组)
        int index=0;
        for (int i = 0; i < images.length; i++) {
            for (int j = 0; j < images[i].length; j++) {
                images[i][j]=image[index++];
            }
        }
        //解法二:(遍历一维数组)
        /*index=0;
        for (int i = 0; i < image.length; i++) {
            images[i/4][i%4]=image[index++];
        }*/
        return images;
    }


    //图片
    private void initImage(int[][] images) {
        int number=0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                number=images[j][i];
                //创建一个图片ImageIcon的对象
                ImageIcon icon=new ImageIcon("C:\\Users\\11875\\Desktop\\JAVA\\basic-code\\puzzlegame\\image\\animal\\animal3\\"+number+".jpg");
                //把图片放到JLabel容器里面
                JLabel jLabel=new JLabel(icon);

                //指定JLabel容器的位置
                jLabel.setBounds(105*i,105*j,105,105);

                //方法1:把JLabel容器添加到界面框架里面(这里是默认放到窗体里面,界面不能直接放东西,都只能放各种容器)
                //this.add(jLabel);
                //方法2:直接把图片设置为窗体的内容(但是因为重写了窗口,会恢复默认居中模式,且只展示最后一张图片)
                //this.setContentPane(jLabel);
                //方法3:获取窗体,并把图片传给窗体
                this.getContentPane().add(jLabel);

                //图片的编号只有1-15,当运行到加载16号的图片时,加载失败,但是依然会创建空白容器,把空白容器加载到了窗口里
            }
        }
    }


    //菜单
    private void initJMenuBar() {
        //创建JMenuBar容器
        JMenuBar jMenuBar=new JMenuBar();
        //设置菜单模块
        JMenu functionJMenu=new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于");
        //设置菜单项
        JMenuItem replayItem=new JMenuItem("重新开始");
        JMenuItem reLoginItem=new JMenuItem("重新登陆");
        JMenuItem closeItem=new JMenuItem("退出游戏");

        JMenuItem officialAccountItem=new JMenuItem("公众号");
        //将菜单项添加到菜单模块
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(officialAccountItem);

        //将菜单模块添加到菜单
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        //将菜单添加到界面
        this.setJMenuBar(jMenuBar);
    }


    //界面
    private void initJFrame() {
        //创建一个游戏主界面(需要导包)
        this.setSize(603,680);
        this.setTitle("拼图游戏单机版v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中(屏幕的居中)
        this.setLocationRelativeTo(null);
        //设置界面关闭时退出程序(不同的数字代表不同的退出方式)
        //参考文档:0关闭无线,1关闭当前窗口,2关闭当前窗口且关闭最后一个窗口时退出,3关闭当前窗口时就退出
        this.setDefaultCloseOperation(3);

        //取消默认居中模式,取消后才会按照XY轴形式添加组件(JFrame框架里面的坐标系的居中)
        this.setLayout(null);
    }
}
