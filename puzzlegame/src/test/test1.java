package test;

import java.util.Random;

//测试类,测试打乱图片索引并放到二维数组里面
//在GameJFrame类里面调用时就直接把图片索引对应每个图片路径
//把二维数组按照对应位置存放在窗体里面
public class test1 {
    public void test() {
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
        //创建二维数组
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
        //
    }
}
