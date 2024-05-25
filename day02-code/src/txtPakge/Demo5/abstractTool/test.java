package txtPakge.Demo5.abstractTool;

public class test {
    /*编写带有抽象类的标准javabean类:
    青蛙frog   属性:名字，年龄       行为  吃虫子  喝水
    狗Dog      行为属性:名字，年龄   行为  吃骨头  喝水
    山羊Sheep  属性:名字，年龄       行为  吃草    喝水
     */

    public static void main(String[] args) {
        Frog f=new Frog("青蛙",12);
        System.out.println(f.getAge()+","+f.getName());
        f.eat();
        f.swim();
        Dog d=new Dog("狗",13);
        System.out.println("------------------------------");
        System.out.println(d.getAge()+","+d.getName());
        d.eat();
        d.swim();
        Sheep s=new Sheep("羊",34);
        System.out.println("------------------------------");
        System.out.println(s.getAge()+","+s.getName());
        s.eat();
        System.out.println("------------------------------");
    }
}
