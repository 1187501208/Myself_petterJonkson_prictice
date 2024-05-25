package txtPakge.Demo4;

import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
        //已知正确的用户名和密码,请用程序实现模拟用户登陆
        //总共三次机会,登陆之后,给出相应提示

        //新建用户名和密码的字符串存储
        String user="123456";
        String passWord="000000";

        //输入内容(循环),若成功则跳出循环
        boolean temple=true;
        temple=getScanner(user,"用户名",temple);
        if(temple==true){
            temple=getScanner(passWord,"密码",temple);
            if(temple==true){
                System.out.printf("登陆中...");
            }
        }
    }

    //定义函数,对输入内容进行判定是否正确,对比是否正确,并给出提示
    private static boolean getScanner(String number,String input,boolean temple) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;true;i++){
            System.out.printf("请输入%s:",input);
            String inputNumber=sc.next();
            if(number.equals(inputNumber)){
                System.out.printf("%s输入正确,",input);
                break;
            }else if(i!=2){
                System.out.printf("%s不正确,还有%s次输入机会",input,2-i);
                System.out.println();
            }else {
                System.out.println("机会用完,账户已锁定");
                temple=false;
                break;
            }
        }
        return temple;
    }
}
