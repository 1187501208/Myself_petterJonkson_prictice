package txtPakge.Demo5.duotaiExercise;

public class Person {
    private String name;
    private int age;


    //这里的多态应用,但是只能针对通用性模板,针对非通用性的还是不能区别,因此
    //需要用到分类强转来针对非通用性问题
    /*public void keepPet(animal a,String something){
        System.out.printf("年龄为%s岁的%S养了一只%s颜色的%s岁的动物\n"
                ,this.age,this.name, a.getColor(),a.getAge());
        a.eat(something);
        System.out.println();
    }*/

    //利用instanceof来对其进行强转为对应类型(这里实际上就不是多态了)
    public void keepPet(animal a,String something){
        if(a instanceof dog d){
            System.out.printf("年龄为%s岁的%S养了一只%s颜色的%s岁的狗\n"
                    ,this.age,this.name, a.getColor(),a.getAge());
            a.eat(something);
            System.out.println();
        } else if (a instanceof cat c) {
            System.out.printf("年龄为%s岁的%S养了一只%s颜色的%s岁的猫\n"
                    ,this.age,this.name, a.getColor(),a.getAge());
            a.eat(something);
            System.out.println();
        }else {
            System.out.println("没有这种动物");
        }
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
