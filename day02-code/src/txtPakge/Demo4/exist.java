package txtPakge.Demo4;

import java.util.ArrayList;

public class exist {
    public static void main(String[] args) {
        /*需求:
        1.main方法中定义一个集合，存入三个用户对象。
        用户属性为:id，username，password
        2.要求:定义一个方法，根据id查找对应的用户信息。如果存在，返回索引
        如果不存在，返回-1
         */


        //创建集合并存入给定对象
        ArrayList<User> list=new ArrayList<>();
        User user1=new User("aaa","123123","","",0,12);
        User user2=new User("bbb","12324","","",0,13);
        User user3=new User("ccc","1sdf23123","","",0,14);
        //添加
        list.add(user1);
        list.add(user2);
        list.add(user3);
        //调用方法,查找对象是否存在,并返回
        int id=15;
        int result=findId(list,id);
        //打印结果
        System.out.println(result);
    }

    //创建查找方法
    //也可以调用getindex方法.
    public static int findId(ArrayList<User> list,int id){
        int index=-1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id){
                index=i;
                break;
            }
        }
        return index;
    }
}
