package txtPakge.Demo4;

import txtPakge.Demo4.test.NewPhone;

import java.util.ArrayList;

public class PhoneList {
    public static void main(String[] args) {
        /*定义Javabean类:Phone
        Phone属性:品牌，价格。
        main方法中定义一个集合，存入三个手机对象。
        分别为:小米，1000。苹果，8000。锤子2999.
        定义一个方法，将价格低于3000的手机信息返回。
         */


        //创建集合并存入对象信息
        ArrayList<NewPhone> list=new ArrayList<>();
        NewPhone p1=new NewPhone("苹果",8000);
        NewPhone p2=new NewPhone("小米",1000);
        NewPhone p3=new NewPhone("锤子",2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //调用查询方法查看是否有低于3000价格的手机
        getindex(list);
    }

    //返回价格低于3000的手机
    public static void getindex(ArrayList<NewPhone> list){
        //把价格低于3000的手机索引存在一个集合里面
        ArrayList<Integer> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice()<3000){
                list1.add(i);
            }
        }
        //输出信息
        if(list1.size()!=0){
            for (int i = 0; i < list1.size(); i++) {
                System.out.println(list.get(list1.get(i)).getBrand()+","+list.get(list1.get(i)).getPrice());
            }
        }else {
            System.out.println("不存在价格低于3000的手机品牌");
        }
    }
}
