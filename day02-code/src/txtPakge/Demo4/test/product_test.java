package txtPakge.Demo4.test;

import java.util.Scanner;

public class product_test {
    public static void main(String[] args) {
        /*
        //定义数组储存3个商品对象
        //商品属性:商品id,名字,价格,库存
        //创建三个商品对象,并把商品对象储存到数组中去

        //创建数组
        product[] arr=new product[3];

        //创建商品对象
        product p1=new product("牙刷",001,10,50);
        product p2=new product("香烟",003,100,20);
        product p3=new product("玩偶",003,200,10);

        //把商品添加到数组中
        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;

        //遍历
        for(int i=0;i<arr.length;i++){
            product goods=arr[i];
            System.out.println(goods.getID()+","+goods.getName()+","+ goods.getPrice()+","+ goods.getList());
        }
*/
        //定义数组存储3部汽车对象
        //汽车的属性:品牌,价格,颜色
        //创建3个汽车对象,数据通过键盘录入而来

        //创建数组
        product2[] arr2=new product2[3];
        //键入数组
        //体系1:
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串(遇到空格和回车自动停止,后面的符号放在下一个接受或者不接收
        //体系2:
        //nextLine();接收字符串(直接录入所有数据)
        //注意:键盘录入的两套体系不能混用.弊端:先用nextInt,再用nextLine会导致下面的nextLine接收不到数据
        //因为回车键不能被第一个接收,第nextLine把回车接收了

        //创建汽车对象及其属性
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("请输入%s号汽车品牌:",i+1);
            System.out.println();
            String pp=sc.next();
            System.out.println("请输入汽车价格:");
            int pr=sc.nextInt();
            System.out.println("请输入汽车颜色:");
            String col=sc.next();
            //把属性传入各个对象
            //必须每一次循环都创建一个新的对象并且赋值给数组对象每一个元素,
            //每一次新建对象都会分配给该元素所指向的对象的新的空间,因此创建对象必须写在循环里面,
            //否则每一次都只是修改了单个对象的各个属性,所有循环最后都指向这一个对象空间
            product2 car=new product2(pp,pr,col);
            arr2[i]=car;
        }

        //输出数据
        for (int i = 0; i < arr2.length; i++) {
            product2 car=arr2[i];
            System.out.printf("品牌%s:%s\t",i+1,car.getName());
            System.out.printf("价格:%s\t",car.getPrice());
            System.out.printf("颜色:%s\t",car.getColor());
            System.out.println();
        }
    }
}
