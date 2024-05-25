package txtPakge.Demo4.test;

import java.util.Scanner;

public class CHNumberTrans {
    public static void main(String[] args) {
        //把数字的字符串转化为中文大写汉字,单位是:个\十\佰\仟\万\拾万\佰万\仟万


        //字符串副本创建和直接赋值的区别:

        //
        //直接赋值:                  String C变量 --------->|
        //                                                 |
        //                           String A变量----->new空间:地址Ox@adf指向----->字符串常量池:string "12345678"
        //                                                                           |
        //副本创建:                  String B变量----->new空间:地址Ox@asdgre指向----->|
        //


        //导入字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入金额(不超过8位):");
        //相当于new出来的字符串
        String input=sc.next();
        //这里需要的是创建副本,不能直接赋值,直接赋值只是把原地址传给新变量
        String getinput=new String(input);
        System.out.println(getinput);
        //查看两个的地址,查看是否是复用的(getinput=input是直接赋值地址的)
        System.out.println("查看两个的哈希地址");
        System.out.println(System.identityHashCode(input));
        System.out.println(System.identityHashCode(getinput));

        System.out.println("-------------------------------------------------");
        //输入数字字符串,调用检查是否是正确格式内容,并将其补全所有位数的方法
        String str2="";
        getinput=chackNumber(getinput,str2);

        //如果是直接把字符串赋值给变量,那么在编译时会直接把字符串常量池的地址赋给变量,如果是用new创建的字符串,那么会在堆中创建新的空间
        //如果是把input2的内容"1234"和str2的内容"000"直接拼接,"1234"+"000"的结果是"1234000",这个结果会在编译时直接拼接,并且把拼接后的字符串变量
        // 直接指向串池的地址,不会在堆中创建新的空间
        //另外:new string("xxx")生成的字符串和直接赋值的字符串是不一样的,直接赋值的字符串是直接指向串池的地址,而new出来的字符串是在堆中创建新的空间
        //把新空间再指向串池的地址,这个过程也是在编译时进行的,在运行之前完成

        //
        //拼接示意图:          getinput变量-------->new空间:地址Ox@adf指向(存放的串池地址)----->字符串常量池:string 12342345
        //                         |                  |
        //                         |                  |                str2变量-------->new空间:地址Ox@asdgre指向(存放的串池地址)----->字符串常量池:string 000
        //     (存放新字符串的地址) |                  V      (+)                              |
        //                         |                   --------------------------------------------------->New空间:地址Ox@adg指向(new空间存放两个地址)---(class编译时进行,直接把new空间存放新字符串常量的地址)--->字符串常量池:string 00012342345
        //                         |                                                                                                                                                                              ^
        //                         |                                                                                                                                                                              |
        //                         -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //                                        (编译时重新拼接的字符串,直接由串池指向,不会在堆中创建新空间,只是重新指向串池的地址)


        //因为此时main函数使用getinput,在有字符串变量参与的拼接当中在编译时,会使用StringBuilder方法对引用地址拼接的字符串重新拼接
        // ,str2形参创建的储存"000"的新空间的地址还在被引用,故当函数使用结束,串池里面的str2创建的内存不会被释放掉,
        // 但是实参指向的还是""字符串,打印出来依然是"".
        System.out.println("str2:"+str2);
        System.out.println("拼接后的数:"+getinput);
        String test="0000"+"1234";
        System.out.println("拼接2:"+test);
        System.out.println("-------------------------------------------------");

        //调用方法转化数字为对应汉字大写的字符串
        String newNumber="";
        newNumber=smallToBig(getinput,newNumber);
        System.out.println(newNumber);

        //把字符串的字符填入相应单位格式的空位,打印结果
        //也可以用查表法,把不同单位的放进数组,把对应字符串索引和单位的索引对应上,直接用循环取得每一个数位的表达
        System.out.printf("%s仟万 %s佰万 %s拾万 %s万 %s仟 %s佰 %s十 %s元",newNumber.charAt(0),newNumber.charAt(1),newNumber.charAt(2)
                ,newNumber.charAt(3),newNumber.charAt(4),newNumber.charAt(5),newNumber.charAt(6),newNumber.charAt(7));
    }

    //检查并补全数字的函数
    public static String chackNumber(String Number,String str2){
        int count=Number.length();
        System.out.println("数的位数"+count);
        if(count<8&&count>=0){
            //j代表需要补全的位数
            int j=8-count;
            //循环用0补全的字符串
            for(int i=0;i<j;i++){
                str2=str2+'0';
            }
            //这里拼接的根本原理是把两个字符串的地址拼接在一起的,如果其中一个字符串不在主函数里面,结束就释放了
            // ,因此需要把str2也设置在main函数里面,传递到函数上面的参数里面使用(考察字符串内存原理以及拼接原理)
            //并且这里需要把改变的值传回给实参,因为这里形参指向的是新空间,原实参指向的空间内容并没有改变
            System.out.println("补全的字符串:"+str2);
            //这种拼接方式是把两个字符串的地址拼接在一起,具体方式是在编译时创建StringBuilder容器,把两个地址拼接在一起放到容器里面,然后分别指向各个串池的地址,
            // 编译时再把指向的字符实际进行拼接,把新的字符串本身直接放到StringBuilder容器里面(具体编码方式见笔记).
            //然后再tostring方法把容器变成字符串的一个堆的new空间,然后把这个new空间指向拼接后的串池的地址,而原变量指向这个new空间,这个过程是在编译时进行的
            // (JDK8以前就是直接创建一个StringBuilder使用stringbuilder的append方法,过程就是：str6 = new StringBuilder(str2).append(Number).toString();
            //JDK8以后是预估一个数组来存放.
            // 但是如果串池已经存在这个字符串,那么把Number在堆中开辟的new空间直接指向串池的地址,而不是创建StringBuilder容器)
            Number=str2+Number;
        } else if (count == 8) {
        }else {
            System.out.println("请输入1-8位数字");
        }
        System.out.println("补全后的8位数字:"+Number);
        return Number;
    }

    //数字转化成汉字的函数
    public static String smallToBig(String number,String newNumber){
        for (int i = 0; i < number.length(); i++) {
            char tuple=number.charAt(i);
            //也可以定义一个数组,把这些汉字和对应下表联系起来,索引数字就代表其汉字.
            switch (tuple){
                case '0':
                    newNumber=newNumber+'零';
                    break;
                case '1':
                    newNumber=newNumber+'壹';
                    break;
                case '2':
                    newNumber=newNumber+'贰';
                    break;
                case '3':
                    newNumber=newNumber+'叁';
                    break;
                case '4':
                    newNumber=newNumber+'肆';
                    break;
                case '5':
                    newNumber=newNumber+'伍';
                    break;
                case '6':
                    newNumber=newNumber+'陆';
                    break;
                case '7':
                    newNumber=newNumber+'柒';
                    break;
                case '8':
                    newNumber=newNumber+'捌';
                    break;
                case '9':
                    newNumber=newNumber+'玖';
                    break;
                default:
                    System.out.println("字符非法,请输入数字");
                    break;
            }
        }
        return newNumber;
    }
}