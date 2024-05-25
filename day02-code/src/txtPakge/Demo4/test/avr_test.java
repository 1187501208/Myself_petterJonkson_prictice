package txtPakge.Demo4.test;

public class avr_test {
    public static void main(String[] args) {
        //定义数组存储对象及其属性
        avr[] girlFriend = new avr[4];
        //查看数组更新前地址,以及其中一个元素内容
        System.out.println(girlFriend);
        System.out.println(girlFriend[0]);
        for (int i = 0; i < girlFriend.length; i++) {
            switch (i){
                case 0:
                    girlFriend[i]=new avr(18,"juily","girl","tenais");
                    break;
                case 1:
                    girlFriend[i]=new avr(20,"tomjud","girl","baseboll");
                    break;
                case 2:
                    girlFriend[i]=new avr(28,"milson","girl","ping-pang");
                    break;
                case 3:
                    girlFriend[i]=new avr(21,"sald","girl","football");
                    break;
            }
        }
        //查看数组更新后地址,以及其中一个元素内容
        System.out.println(girlFriend);
        System.out.println(girlFriend[0]);

        //展示个人信息
        System.out.println("==================================");
        System.out.println("姓名\t年龄\t性别\t爱好");
        for (int i = 0; i < girlFriend.length; i++) {
            avr girl=girlFriend[i];
            System.out.printf("%s\t%s\t\t%s\t%s",girl.getName(),girl.getAge(),girl.getSex(),girl.getHob());
            System.out.println();
        }
        System.out.println("----------------------------------");

        //计算平均年龄
        double avrAge=0;
        for (int i = 0; i < girlFriend.length; i++) {
            double age=girlFriend[i].getAge();
            avrAge+=age;
        }
        avrAge=avrAge/ (girlFriend.length);

        //输出平均年龄
        System.out.printf("平均年龄是%s\n",avrAge);
        System.out.println("----------------------------------");

        //统计比平均年龄低的女朋友个数
        int count=0;
        for (int i = 0; i < girlFriend.length; i++) {
            count+=(girlFriend[i].getAge()<avrAge?1:0);
        }

        //输出比平均年龄低的女朋友个数
        System.out.printf("比平均年龄低的女朋友个数有%s个\n",count);
        System.out.println("==================================");
    }
}
