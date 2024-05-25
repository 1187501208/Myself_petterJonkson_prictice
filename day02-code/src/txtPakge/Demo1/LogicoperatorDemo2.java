package txtPakge.Demo1;

public class LogicoperatorDemo2 {
    //短路运算
    public static void main(String[] args) {
        //1.&&在表示意思和&是一样的
        System.out.println("&&:");
        System.out.println(true&&true);
        System.out.println(false&&false);
        System.out.println(true&&false);
        //2.||于|意思一样
        System.out.println("||:");
        System.out.println(true||true);
        System.out.println(false||false);
        System.out.println(true||false);
        //3.短路逻辑有短路效果
        //左边表达式能确定结果时,右边不参与运算
        int a=10;int b=10;
        boolean result=++a<5&&++b<8;
        System.out.println("result="+result+"\t"+"a="+a+"\t"+"b="+b);
    }
}
