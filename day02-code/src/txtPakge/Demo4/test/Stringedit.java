package txtPakge.Demo4.test;

public class Stringedit {
    public static void main(String[] args) {
        /*
        给定两个字符串,A 和 B.
        A的旋转操作就是将 A最左边的字符移动到最右边。
        例如,若 A='abcde'，在移动一次之后结果就是'bcdea'
        如果在若干次调整操作之后,A能变成B，那么返回True。如果不能匹配成功，则返回false
         */

        //设置A/B字符串
        String A="cab";
        String B="bca";

        //创建方法,可以移动字符串
        // (设置一个StringBlinder容器把每次最左边的字符拼接到右边字符串的右边,
        //把每次的A容器和B容器内容进行比较
        boolean result=getconpare(A,B);

        //返回结果,并打印
        if(result){
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }
    }

    //移动字符串的方法
    static boolean getconpare(String A,String B){
        StringBuilder a=new StringBuilder(A);
        boolean result=false;
        //先对比A和B本身
        result=A.equals(B);
        //定义A的旋转操作
        if(!result){
            for (int i = 0; i < A.length(); i++) {
                char first=a.charAt(0);
                String last=a.substring(1);
                a.delete(0,a.length());
                System.out.println(a);
                a.append(last).append(first);
                System.out.println(a);
                System.out.println(B);
                //这里的a.equals是"=="的意思,比较两者的hash地址,因此
                //必须用String.equals的方法比较才是比较的字符串内容
                result=a.toString().equals(B);
                System.out.println(result);
                System.out.println("---------------------");
                if(result){
                    break;
                }
            }
        }
        return result;
    }
}
