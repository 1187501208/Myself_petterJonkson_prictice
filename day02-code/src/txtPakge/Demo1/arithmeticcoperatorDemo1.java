package txtPakge.Demo1;

public class arithmeticcoperatorDemo1 {
    //算术运算
    public static void main(String[] args) {
        //+(算术运算里面,小数运算可能不精确)
        System.out.println(2+3);
        System.out.println(2.2+3.4);
        //-
        System.out.println(5-4);
        System.out.println(2.4-3.1);
        //*
        System.out.println(2*5);
        System.out.println(2.5*3.7);
        //除(整数相除,结果取整,小数参与,结果按照正常结果处理)
        System.out.println(4/2);
        System.out.println(2.3/3.6);
        //%(取余数/模,只能用整数运算,结果也是整数)
        System.out.println(10%2);
        System.out.println(10%3);
    }
}
