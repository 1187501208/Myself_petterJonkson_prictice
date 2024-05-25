package txtPakge.Demo5.StudentClass;

import java.util.ArrayList;

public class GetMaxAgeUtil {
    //私有化工具类(不让该工具类被创建对象,因为只需要里面的方法,工具的对象没有实际意义)
    //当然后面可以用接口来实现方法,就不需要创建工具类了
    private GetMaxAgeUtil(){
    }

    //静态方法
    public static int getmax(ArrayList<StudentTool> list){
        int maxAge=getageNumber(list.get(0).getAge());
        for (int i = 1; i < list.size(); i++) {
            String age = list.get(i).getAge();
            int age2=getageNumber(age);
            if(age2>maxAge){
                maxAge=age2;
            }
        }
        return maxAge;
    }

    //把字符串的年龄转化为整数年龄
    public  static  int getageNumber(String age){
        int sum=0;
        for (int i = 0; i < age.length(); i++) {
            char c = age.charAt(i);
            if(!(c>='0'&&c<='9')){
                System.out.println("请输入数字!");
                break;
            }
            sum=sum*10;
            sum=sum+(c-48);
        }
        return sum;
    }
}
