package txtPakge.Demo4;

public class PhoneNumber {
    public static void main(String[] args) {
        //以152****1283格式来显示手机号

        //获取需要展示的片段
        String number="18783827738";
        String start=number.substring(0,3);
        String end=number.substring(7);

        //展示号码
        System.out.println(start+"****"+end);


        //获取身份证信息

        //定义身份证
        String id="513021197812318878";
        //获取年月日和性别
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        //ASCII码的'0'字符码为48
        int sex=id.charAt(id.length()-1)-48;
        System.out.println(sex);
        char sex2=sex%2==0?'男':'女';
        System.out.println(sex2);

        //打印结果
        System.out.println("----------------------------------");
        System.out.printf("出生日期:%s年%s月%s日\n性别:%s",year,month,day,sex2);
        System.out.println();

        //替换铭感信息
        //这里的替换函数replace实际上不是改变string的内容,是检测到铭感字段,
        // 把原内容切片,把铭感字段替换掉,成为一个新字段再放回原的空间
        System.out.println("----------------------------------");
        //获取需要说的话
        String talk="你玩的真tmd菜";

        //替换
        System.out.print("查看哈希地址");
        System.out.println(System.identityHashCode(talk));
        String result=talk.replace("tmd","***");
        System.out.println(result);
        System.out.print("查看哈希地址");
        System.out.println(System.identityHashCode(talk));
        System.out.println("----------------------------------");

        //定义铭感词库
        String[] arr={"tmd","cnm","sb","mlgb","屎"};

        //把字符串和铭感词库对比,并替换
        String talk2="你玩的真tmd菜,臭sb,去吃屎吧";
        System.out.print("查看哈希地址");
        System.out.println(System.identityHashCode(talk2));
        String result2=new String(talk2);
        System.out.print("查看哈希地址");
        System.out.println(System.identityHashCode(talk2));
        for (int i = 0; i < arr.length; i++) {
            result2=result2.replace(arr[i],"***");
        }
        System.out.println(talk2);
        System.out.println(result2);
        System.out.print("查看哈希地址");
        System.out.println(System.identityHashCode(talk2));
    }
}
