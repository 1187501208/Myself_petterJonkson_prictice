package txtPakge.Demo4.test;

import java.util.Scanner;

public class student_Image_test {
    public static void main(String[] args) {
        /*
        定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同
        学生的属性:学号，姓名，年龄。
        要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        要求2:添加完毕之后，遍历所有学生信息。
        要求3:通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败，
        要求4:删除完毕之后，遍历所有学生信息。
        要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
        */

        //输入对象信息
        student_Image[] student=new student_Image[3];
        student[0]=new student_Image(1,"petter",18);
        student[1]=new student_Image(2,"jack",15);
        student[2]=new student_Image(3,"marry",16);

        //展示对象信息
        System.out.println("------------------------------------------");
        System.out.println("学号\t姓名\t年龄");
        for (int i = 0; i < student.length; i++) {
            System.out.printf("%s\t\t%s\t%s",student[i].getNumber(),student[i].getName(),student[i].getAge());
            System.out.println();
        }
        System.out.println("------------------------------------------");

        //加入新的对象,并判断是否存在
        student_Image newstudent=new student_Image(4,"tom",17);
        boolean include=false;
        int count=0;
        for (int i = 0; i < student.length; i++) {
            include=(student[i].getNumber()==newstudent.getNumber()?true:false);
            count++;
        }
        String exist=(include==true?"存在":"不存在");
        System.out.printf("新的学生%s",exist);
        System.out.println();
        System.out.println("------------------------------------------");

        //判断数组是否是满的,如果不是直接把新数据加入,如果是就创建新的数组
        student_Image[] laststudent=new student_Image[count+1];
        if (include==false){
            add_student(count, student, newstudent,laststudent);
        }else {
            laststudent=student;
        }

        //遍历学生信息
        System.out.println("学号\t姓名\t年龄");
        for (int i = 0; i < laststudent.length; i++) {
            //-表示左对齐，+或省略表示右对齐，8表示长度（即总共占8个字符长度）
            System.out.printf("%-8s%-8s%-8s",laststudent[i].getNumber(),laststudent[i].getName(),laststudent[i].getAge());
            System.out.println();
        }
        System.out.println("------------------------------------------");

        //查找id是否存在并删除学生信息
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要查询学生的ID:");
        int find=sc.nextInt();
        System.out.println(laststudent.length);
        System.out.println(laststudent[0]);
        System.out.println(laststudent[1]);
        System.out.println(laststudent[2]);
        for (int i = 0; i < laststudent.length; i++) {
            if(find==laststudent[i].getNumber()){
                student_Image[] newArr=new student_Image[laststudent.length-1];
                laststudent[i]=null;
                laststudent=changeArr(laststudent,newArr,i);
                System.out.println("删除成功");
                System.out.println("------------------------------------------");
                break;
            } else if (i == student.length - 1) {
                System.out.println("删除失败");
                System.out.println("------------------------------------------");

            }
        }
        //遍历学生信息
        System.out.println("学号\t姓名\t年龄");
        for (int i = 0; i < laststudent.length; i++) {
            //-表示左对齐，+或省略表示右对齐，8表示长度（即总共占8个字符长度）
            System.out.printf("%-8s%-8s%-8s",laststudent[i].getNumber(),laststudent[i].getName(),laststudent[i].getAge());
            System.out.println();
        }
        System.out.println("------------------------------------------");


        //查询数组id为“002”的学生，如果存在，则将他的年龄+1岁
        for (int i = 0; i < laststudent.length; i++) {
            if(laststudent[i].getNumber()==2) {
                laststudent[i].setAge(laststudent[i].getAge() + 1);
            }
        }
        //遍历学生信息
        System.out.println("学号\t姓名\t年龄");
        for (int i = 0; i < laststudent.length; i++) {
            //-表示左对齐，+或省略表示右对齐，8表示长度（即总共占8个字符长度）
            System.out.printf("%-8s%-8s%-8s",laststudent[i].getNumber(),laststudent[i].getName(),laststudent[i].getAge());
            System.out.println();
        }
        System.out.println("------------------------------------------");

    }


    private static void add_student(int count, student_Image[] student, student_Image newstudent,student_Image[] laststudent) {
        if(count == student.length){
            //不能直接把student赋值给lastudent,这样相当于还是把原来的student给lastudent,覆盖了lastudent新开辟空间的地址
            // ,相当于没有开辟新的空间,laostudent原空间被抛弃了,因此只能每个元素单独赋值
            for (int i = 0; i < student.length; i++) {
                laststudent[i]=student[i];
            }
            laststudent[laststudent.length-1]= newstudent;
        }else {
            student[count]= newstudent;
            laststudent=student;
        }
    }

    //调整删除数据后的数组,把null部分填满
    private static student_Image[] changeArr(student_Image[] student,student_Image[] newArr,int number) {
        //for循环遇到null时,会自动中断循环,因此无法用是否是null来筛选遍历
        /*for (int i = 0; i < newArr.length; i++) {
            if(student[i]!=null){
                newArr[i]=student[i];
            }
        }
        */
        System.out.println("------------------------------------------");
        for (int i = 0, j = 0; i < student.length; i++) {
            if (i != number) {
                System.out.println(student[i]);
                newArr[j] = student[i];
                System.out.println(newArr[j]);
                j++;
            }
        }
        return newArr;
    }
}
