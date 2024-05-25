package txtPakge.Demo4.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;
/*
    学生类:属性:id、姓名、年龄、家庭住址

    添加功能:键盘录入每一个学生信息并添加，需要满足以下要求:
             id唯一

    删除功能:键盘录入要删除的学生id，需要满足以下要求
            id存在删除
            id不存在，需要提示不存在，并回到初始菜单

    修改功能:键盘录入要修改的学生id，需要满足以下要求
            id存在，继续录入其他信息
            id不存在，需要提示不存在，并回到初始菜单
    查询功能:查询所有学生信息
 */


public class StudentSystem {
    public static void startStudentSystem() {
        //设置集合储存学生对象
        ArrayList<StudentInfo> list= new ArrayList<>();
        //ctrl+alt+t:包围选项,使每个选项运行完可以重新回到主界面
        loop:while (true) {
            //打印主界面
            System.out.println("--------------------学生管理系统-----------------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择:");
            //设置输入选项
            Scanner sc=new Scanner(System.in);
            String input=sc.next();
            switch (input){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                    //System.exit(0);该语句也表示退出,是停止虚拟机所有程序运行的意思
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加功能
    public static void addStudent(ArrayList<StudentInfo> list) {
        System.out.println("请输入添加学生的信息:");
        System.out.println("---------------------------");
        StudentInfo student = null;
        while (true) {
            student = new StudentInfo();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入ID:");
            student.setId(sc.next());
            System.out.println("请输入姓名:");
            student.setName(sc.next());
            System.out.println("请输入年龄:");
            student.setAge(sc.nextInt());
            //把学生对象导入到集合中
            list.add(student);
            System.out.println("添加成功!");
            System.out.println("---------------------------");
            System.out.println("继续添加请输入1,若回到主页面请输入0");
            String input = sc.next();
            if (input.equals("1")) {
            } else{
                break;
            }
        }
    }

    //删除功能
    public static void deleteStudent(ArrayList<StudentInfo> list) {
        while (true) {
            System.out.println("请输入需要删除学生ID");
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            int getnumber = chackID(list, id);
            if (getnumber >= 0) {
                list.remove(getnumber);
                System.out.println("删除成功");
                break;
            } else {
                System.out.println("删除失败! 该ID学生信息不存在");
                System.out.println("---------------------------");
                System.out.println("继续删除请输入1,若回到主页面请输入0");
                String input = sc.next();
                if (input.equals("1")) {
                } else {
                    break;
                }
            }
        }
    }

    //修改功能
    public static void updStudent(ArrayList<StudentInfo> list){
        while (true) {
            System.out.println("请输入需要修改的学生ID");
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            int getnumber = chackID(list, id);
            if (getnumber > 0) {
                System.out.println("请输入修改后的学生姓名");
                list.get(getnumber).setName(sc.next());
                System.out.println("请输入修改后的学生年龄");
                list.get(getnumber).setAge(sc.nextInt());
                System.out.println("修改成功");
                break;
            } else {
                System.out.println("修改失败! 该ID学生信息不存在");
                System.out.println("---------------------------");
                System.out.println("继续修改请输入1,若回到主页面请输入0");
                String input = sc.next();
                if (input.equals("1")) {
                } else {
                    break;
                }
            }
        }
    }


    //查询功能
    public static void queryStudent(ArrayList<StudentInfo> list){
        System.out.println("----------------学生信息表-------------------");
        if(list.size()==0){
            System.out.println("学生信息为空,请导入学生信息后查询");
        }else {
            System.out.println("ID\t\t姓名\t年龄");
            for (int i = 0; i < list.size(); i++) {
                String ID=list.get(i).getId();
                String name=list.get(i).getName();
                int age=list.get(i).getAge();
                System.out.printf("%-8s%-8s%-8s",ID,name,age);
                System.out.println();
            }
        }
    }


    //查看id是否存在,并返回该学生索引
    public static int chackID(ArrayList<StudentInfo> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
