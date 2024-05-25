package txtPakge.Demo5.interior;

public class test {
   /* 需求:写一个Javabean类描述汽车。
    属性:汽车的品牌，车龄，颜色，发动机的品牌，使用年限
    内部类的访问特点:
    内部类可以直接访问外部类的成员，包括私有外部类要访问内部类的成员，必须创建对象*/

    //定义匿名成员内部类(继承)
    Car c=new Car() {
        @Override
        public void show() {
            System.out.println("游泳");
        }
    };
    //调用匿名成员内部类,把匿名内部类的对象(c)的方法进行调用,因为成员匿名内部类
    //相当于从car类里面继承到匿名内里面(大括号里面代表一个匿名类),并用多态重写了父类car的show方法,
    // 前面加上car代表把继承的多态结果传递给Car实现多态,前面加上new和后面加上";"代表把新建了一个对象
    // (多态的生成也需要new一个对象的)
    public void test(){
        System.out.println("-----------匿名成员内部类---------------");
        c.show();
    }

    public static void main(String[] args) {
        System.out.println("-----------匿名局部内部类---------------");

        //定义匿名局部内部类(实现)
        // ,并把对象作为参数传给相应的方法,调用其对象的接口内方法
        method(
                new swim() {
                    @Override
                    public void show() {
                        System.out.println("游泳");
                    }
                }
        );

        //方法内写的匿名内部类可以在末尾直接使用方法
        new swim() {
            @Override
            public void show() {
                System.out.println("游泳");
            }
        }.show();


        //访问外部类的非静态内容需要实例化
        Car c=new Car();
        c.carBrand="奔驰";
        c.carAge=15;
        c.carColor="红";
        c.show();
        System.out.println("--------访问外部类的非静态内容------------");
        //访问外部类的静态内容不需要实例化
        System.out.println(Car.carNumber);
        Car.show2();

        System.out.println("---------访问外部类的静态内容----------");
        //访问内部非静态类也需要实例化
        Car.engine ce=new Car().new engine();
        //或者因为上面已经实例化了外部类:Car.engine ce=c.new engine();
        ce.engineName="瑞锂";
        ce.engineAge=10;
        ce.show();
        c.show();

        //访问内部静态类的静态方法不需要实例化
        System.out.println("---------访问内部静态类的静态方法-----------");
        Car.inner.out();
        //访问内部静态类的非静态方法需要实例化该静态内部类,再调用非静态方法
        System.out.println("---------访问内部静态类的非静态方法-----------");
        Car.inner ci=new Car.inner();
        ci.out2();
        //在调用类时,对内部类的实例化格式和在内部类里面互相调用其他内实例化时的格式略有区别:
        //直接调用内部类实例化:            外部类名.内部类名 变量名=new 外部类名().new 内部类名();
        //在内部类里面实例化其他内部类:     外部类名.内部类名 变量名=new 外部类名.内部类名();

    }

    //对匿名内部类的对象的方法调用
    public static void method(swim c){
        c.show();
    }
}
