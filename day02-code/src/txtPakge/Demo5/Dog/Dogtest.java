package txtPakge.Demo5.Dog;

public class Dogtest {
    public static void main(String[] args) {
        /*现在有三种动物:哈士奇、沙皮狗、中华田园犬
        暂时不考虑属性，只要考虑行为。
        请按照继承的思想特点进行继承体系的设计:

        三种动物分别有以下的行为:
        哈士奇:吃饭(吃狗粮)喝水、看家、拆家
        沙皮狗:吃饭(吃狗粮、吃骨头)喝水、看家
        中华田园犬:吃饭(吃剩饭)喝水、看家
        */

        Husky hs=new Husky();
        sad sd=new sad();
        chineseDog cd=new chineseDog();
        System.out.println("---------------");
        System.out.print("哈士奇:");
        hs.eat();
        hs.drink();hs.lookHome();hs.breakHome();
        System.out.println("---------------");
        System.out.print("沙皮狗:");
        sd.eat();sd.drink();sd.lookHome();
        System.out.println("---------------");
        System.out.print("中华田园犬:");
        cd.eat();cd.drink();cd.lookHome();

    }
}




