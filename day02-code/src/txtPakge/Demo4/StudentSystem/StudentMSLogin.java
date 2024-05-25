package txtPakge.Demo4.StudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentMSLogin {
        /*需求:
        登陆界面
            为学生管理系统书写一个登陆、注册、忘记密码的功能。
            只有用户登录成功之后，才能进入到学生管理系统中进行增删改查操作。

        用户类:
            属性:用户名、密码、身份证号码、手机号码
        注册功能:
             1.用户名需要满足以下要求:
                验证要求:
                用户名唯一
                用户名长度必须在3~15位之间
                只能是字母加数字的组合，但是不能是纯数字
             2.密码键盘输入两次，两次一致才可以进行注册。
             3.身份证号码需要验证。
                验证要求:
                长度为18位
                不能以0为开头
                前17位，必须都是数字
        登录功能:
            1.键盘录入用户名
            2.键盘录入密码
            3.键盘录入验证码
            验证要求:
                用户名如果未注册，直接结束方法，并提示:用户名未注册，请先注册
                判断验证码是否正确，如不正确，重新输入
                再判断用户名和密码是否正确，有3次机会
        忘记密码功能:
            1.键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束方法，并提示:未注册
            2.键盘录入身份证号码和手机号码
            3.判断当前用户的身份证号码和手机号码是否一致，
                如果一致，则提示输入密码，进行修改。
                如果不一致，则提示:账号信息不匹配，修改失败。
        验证码规则:
            长度为5
            由4位大写或者小写字母和1位数字组成，同一个字母可重复
            数字可以出现在任意位置
            比如:aQa1K
        */


    //设置登陆界面

    //用常量字符串来增加后面代码可读性
    private static final String REGISTER_USER = "1";
    private static final String LOGIN_USER = "2";
    private static final String FORGET_USER = "3";
    private static final String SHOW_USER = "4";
    private static final String EXIT_USER = "5";

    public static void main(String[] args) {
        System.out.println("-------------学生管理系统---------------");
        ArrayList<StudentUser> list = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统!");
            System.out.println("-----------------------------------------");
            System.out.println("1.用户注册");
            System.out.println("2.用户登陆");
            System.out.println("3.忘记密码");
            System.out.println("4.显示用户");
            System.out.println("5.退出系统");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的选择:");
            String choice = sc.next();
            switch (choice) {
                //注册功能
                case REGISTER_USER -> getUser(list);
                //登陆功能
                case LOGIN_USER -> userLogin(list);
                //忘记密码功能
                case FORGET_USER -> forgetPassword(list);
                //显示用户功能
                case SHOW_USER -> showUserList(list);
                //退出
                case EXIT_USER -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                //测试
                case "6" -> code();
                default -> System.out.println("没有这个选项");
            }
        }
    }


    //显示登陆用户信息
    private static void showUserList(ArrayList<StudentUser> list) {
        System.out.println("----------------用户信息------------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("用户\t密码\tID\t\t\t\t\t手机号");
        if (list.size() == 0) {
            System.out.println("用户信息为空,请导入用户信息后查询!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                String name = list.get(i).getUserName();
                String password = "****";
                String id = list.get(i).getID();
                String phoneNumber=list.get(i).getPhoneNumber();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                //ID输出格式
                for (int i1 = 0; i1 < id.length() - 4; i1++) {
                    sb.append(id.charAt(i1));
                }
                String ID = sb.append("****").toString();
                //电话号码输出格式
                for (int i2 = 0; i2 < phoneNumber.length() - 4; i2++) {
                    sb2.append(id.charAt(i2));
                }
                String PNumber = sb2.append("****").toString();
                //输出
                System.out.printf("%-8s%-8s%-20s%-8s", name, password,PNumber,ID);
                System.out.println();
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("-----------按任意键返回主菜单---------------");
        sc.next();
        System.out.println();
        System.out.println();
    }


    //忘记密码
    private static void forgetPassword(ArrayList<StudentUser> list) {
       /* 忘记密码功能:
        1.键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束方法，并提示:未注册
        2.键盘录入身份证号码和手机号码
        3.判断当前用户的身份证号码和手机号码是否一致，
        如果一致，则提示输入密码，进行修改。
        如果不一致，则提示:账号信息不匹配，修改失败。*/
        Scanner sc = new Scanner(System.in);
        //验证用户名是否存在
        loop:
        while (true) {
            System.out.println("请输入用户名:");
            String user = sc.next();
            int exist = getUserexit(list, user);
            if (exist < 0) {
                System.out.println("用户名未注册，请先注册");
                break loop;
            }
            System.out.println("请输入身份证:");
            String id=sc.next();
            System.out.println("请输入手机号:");
            String phoneNumber=sc.next();
            //验证是否匹配
            int count=0;
            for (; count < list.size(); count++) {
                if(id.equals(list.get(count).getID())&&phoneNumber.equals(list.get(count).getPhoneNumber())){
                    break ;
                }
            }
            if(count==list.size()){
                System.out.println("账号信息不匹配，修改失败!");
                System.out.println("-----------------------");
                continue loop;
            }else {
                System.out.println("输入修改后的密码:");
                String newPassword=sc.next();
                list.get(count).setPassword(newPassword);
            }
            break ;
        }
        System.out.println("-------------------------------------------");
        System.out.println("-----------按任意键返回主菜单---------------");
        sc.next();
        System.out.println();
        System.out.println();
    }


    //登录
    private static void userLogin(ArrayList<StudentUser> list) {
        //登录功能:
        /* 1.键盘录入用户名
           2.键盘录入密码
           3.键盘录入验证码
             验证要求:
                 用户名如果未注册，直接结束方法，并提示:用户名未注册，请先注册
                 判断验证码是否正确，如不正确，重新输入
                 再判断用户名和密码是否正确，有3次机会*/
        Scanner sc = new Scanner(System.in);
        int Chance = 2;
        //验证用户名是否存在
        loop:
        while (true) {
            System.out.println("请输入用户名:");
            String user = sc.next();
            int exist = getUserexit(list, user);
            if (exist < 0) {
                System.out.println("用户名未注册，请先注册");
                break loop;
            }
            //获取登陆密码
            System.out.println("请输入密码:");
            String password = sc.next();
            //获取验证码
            loop1:
            while (true) {
                String code = code();
                System.out.printf("验证码是:%s\n", code);
                System.out.println("请输入验证码:");
                String inputCode = sc.next();
                if (!inputCode.equals(code)) {
                    System.out.println("验证码输入错误,请重新输入");
                    continue loop1;
                }
                break;
            }
            //验证用户名和密码是否正确
            loop1:
            while (true) {
                if (!user.equals(list.get(exist).getUserName())) {
                    System.out.println("用户名不正确,请重新输入,还有" + Chance + "次机会");
                    Chance--;
                    if (Chance > 0) {
                        continue loop;
                    } else {
                        System.out.println("账户已经被冻结!请联系管理员,微信1234546");
                        break loop;
                    }
                }
                if (!password.equals(list.get(exist).getPassword())) {
                    System.out.println("密码不正确,请重新输入,还有" + Chance + "次机会");
                    Chance--;
                    if (Chance > 0) {
                        continue loop;
                    } else {
                        System.out.println("账户已经被冻结!请联系管理员,微信1234546");
                        break loop;
                    }
                }
                break;
            }
            System.out.println("登陆成功!");
            StudentSystem.startStudentSystem();
            break ;
        }

        System.out.println("-------------------------------------------");
        System.out.println("-----------按任意键返回主菜单---------------");
        sc.next();
        System.out.println();
        System.out.println();
    }


    //注册
    private static void getUser(ArrayList<StudentUser> list) {
        //注册功能
        /*1.
        1.用户名需要满足以下要求:
            验证要求:
            用户名唯一
            用户名长度必须在3~15位之间
            只能是字母加数字的组合，但是不能是纯数字
        2.密码键盘输入两次，两次一致才可以进行注册。
        3.身份证号码需要验证。
            验证要求:
            长度为18位
            不能以0为开头
            前17位，必须都是数字*/
        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {
            StudentUser student = new StudentUser();
            loop1:
            while (true) {
                //验证用户名是否唯一
                System.out.println("请输入用户名:(必须由字母和数字组成)");
                String user = sc.next();
                int exist = getUserexit(list, user);
                if (exist > 0) {
                    System.out.println("用户名已存在,请直接登陆");
                    break loop;
                }
                //验证用户名长度
                if (!(user.length() >= 3 && user.length() <= 15)) {
                    System.out.println("用户名错误,请输入长度3-15位长度的用户名");
                    continue;
                }
                //验证用户名组成
                int numberCount = 0;
                int alphbetcount = 0;
                for (int i = 0; i < user.length(); i++) {
                    char temple = user.charAt(i);
                    if (temple >= '0' && temple <= '9') {
                        numberCount++;
                    } else if (temple >= 'a' && temple <= 'z' || temple >= 'A' && temple <= 'Z') {
                        alphbetcount++;
                    }
                }
                if (numberCount == user.length() || alphbetcount == user.length() || numberCount + alphbetcount != user.length()) {
                    System.out.println("用户名错误,请输入必须由字母和数字组成的用户名");
                    continue;
                }
                student.setUserName(user);
                System.out.println("用户名格式正确!");
                System.out.println("-------------------------");
                break;
            }


            //验证密码
            loop2:
            while (true) {
                System.out.println("请输入密码:");
                String password = sc.next();
                System.out.println("请再次输入密码确认");
                String password2 = sc.next();
                if (!password.equals(password2)) {
                    System.out.println("两次密码不一致,请重新输入:");
                } else {
                    student.setPassword(password);
                    System.out.println("密码格式正确!");
                    System.out.println("-------------------------");
                    break loop2;
                }
            }
            //验证身份证
            loop3:
            while (true) {
                System.out.println("请输入身份证:(长度为18位,且开头不能为0,前17位必须为数字)");
                String id = sc.next();
                if (!(id.length() == 18)) {
                    System.out.println("身份证格式错误,长度为18位!");
                    continue loop3;
                }
                if (id.charAt(0) == '0') {
                    System.out.println("身份证格式错误,不能以0开头!");
                    continue loop3;
                }
                for (int i = 0; i < id.length() - 1; i++) {
                    if (!(id.charAt(i) >= '0' && id.charAt(i) <= '9')) {
                        System.out.println("身份证格式错误,前17位必须为数字!");
                        continue loop3;
                    }
                }
                char temple = id.charAt(id.length() - 1);
                if (!(temple >= 'a' && temple <= 'z' || temple >= 'A' && temple <= 'Z' || temple >= '0' && temple <= '9')) {
                    System.out.println("身份证格式错误,最后一位只能为数字或者数字");
                    continue loop3;
                }
                student.setID(id);
                break loop3;
            }
            //录入手机号码
            loop4:
            while (true){
                System.out.println("请输入手机号码:");
                String number=sc.next();
                if(number.length()!=11){
                    System.out.println("手机号码格式错误,请输入正确长度的号码(11位)!");
                    continue loop4;
                }
                for (int i = 0; i < number.length(); i++) {
                    if(!(number.charAt(i)>='0'&&number.charAt(i)<='9')){
                        System.out.println("手机号格式错误,请输入数字!");
                        continue loop4;
                    }
                }
                student.setPhoneNumber(number);
                break ;
            }
            //添加集合元素
            System.out.println("-------------------------");
            list.add(student);
            System.out.printf("用户名:%s\n", student.getUserName());
            System.out.printf("密码:%s\n", student.getPassword());
            System.out.printf("身份证:%s\n", student.getID());
            System.out.printf("电话号码:%s\n",student.getPhoneNumber());
            System.out.println("注册成功!");
            System.out.println("-------------------------");
            System.out.println("继续注册请输入1,若回到主页面请输入0");
            String input = sc.next();
            if (input.equals("1")) {
            } else {
                break loop;
            }
        }
    }


    //验证用户名
    public static int getUserexit(ArrayList<StudentUser> list, String user) {
        //验证用户名是否唯一的方法
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(user)) {
                return i;
            }
        }
        return -1;
    }


    //生成验证码
    public static String code() {
        //生成验证码方法
        /*验证码规则:
             长度为5
             由4位大写或者小写字母和1位数字组成，同一个字母可重复
             数字可以出现在任意位置
             比如:aQa1K*/
        StringBuilder code = new StringBuilder();
        //大小写交错存入一个容器
        for (int i = 0; i < 26; i++) {
            code.append((char) ('a' + i));
            code.append((char) ('A' + i));
        }
        Random r = new Random();
        StringBuilder code2 = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            code2.append(code.charAt(r.nextInt(code.length())));
        }
        //添加最后一位数字
        char number = (char) (r.nextInt(9) + 48);
        code2.append(number);
        char[] end = code2.toString().toCharArray();
        //重新打乱
        for (int i = 0; i < end.length; i++) {
            char temple = ' ';
            int index = r.nextInt(5);
            temple=end[i];
            end[i]=end[index];
            end[index]=temple;
        }
        //把字符型数字直接变成字符串
        String result=new String(end);
        return result;
    }
}



//是否用while(true)来控制循环分情况:
/*               1.执行完,停止此次循环后面部分,并进行下一次循环用continue;
                 2.执行完,直接跳出所有循环用break;
                 若无以上两种情况,则不需要循环.
                 若该项功能(方法)需要循环,并且里面的每个小部分需要循环,则选择用loop分开每种循环.
                 若流程执行完毕,不需要再次循环,直接在循环最后用break跳出.(中途执行错误结果的情况走不到流程最后)
//生成验证码:
           需要用两个StringBuilder来装,一个装字母表,一个装最后的结果,然后在用toString和toCharArray来转变成字符数组.
           把字符数字进行再次打乱,最后把结果用String(str)生成字符数组对应字符串.
 */
