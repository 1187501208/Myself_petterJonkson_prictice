package txtPakge.Demo5.interior;

public class Car {
    String carBrand;
    String carColor;
    int carAge;
    static int carNumber;

    //内部类:类-->类
    //局部内部类:类-->方法-->类
    //匿名内部类:类-->方法-->对象
    //一般内部类:类-->类
    //静态内部类:类-->static类
    //成员内部类:类-->类-->类


    //外部类的静态方法show2
    public static void show2(){
        System.out.println("外部类的静态方法");

    }

    //外部类的非静态方法show
    public void show(Car this){
        //定义局部变量
        int a=12;
        System.out.println(this.carBrand);
        System.out.println(this.carAge);
        System.out.println(this.carColor);
        //外部类的非静态方法里面访问非静态内部类需要创建对象
        Car.engine e=new Car.engine();
        System.out.println(e.engineName);
        e.show();
        //外部类的非静态方法访问静态内部类
        Car.inner i=new Car.inner();
        //外部类非静态方法可以直接访问静态内部类的静态成员方法,成员变量需要创建对象
        inner.out();
        i.aab=20;
        i.show();


        //局部内部类(不能被其他类的方法访问,只能在所在局部方法里面访问)
        class inside{
            //定义局部内部类的成员变量和方法
            int aab=10;
            public void show1(){
                System.out.println("局部内部类的方法");
            }
            public static void show2(){
                System.out.println("局部内部类的静态方法");
            }
        }
        //在方法里面使用局部内部类(需要创建对象)
        inside is=new inside();
        System.out.println(is.aab);
        is.show1();
        inside.show2();
    }

    //静态内部类(不能被其他类方法访问,只能在所在类里面访问,可以直接访问外部类的静态方法和静态变量,
    // 不能直接访问外部类的非静态方法和非静态变量,需要创建对象)
    public static class inner{
        //定义静态内部类的成员变量和方法
        int aab=10;

        //静态内部类的静态和非静态方法
        //定义成员变量和方法
        public static void out(){
            System.out.println("静态内部类静态方法");
        }
        public void out2(){
            System.out.println("静态内部类非静态方法");
        }

        //访问外部类的静态方法和非静态方法
        //静态内部类的非静态方法show
        public void show(){
            //静态类访问外部类的静态方法不需要实例化
            Car.show2();
            System.out.println(carNumber);

            //静态类访问外部类的非静态方法需要实例化,创建对象
            Car c= new Car();
            System.out.println(c.carBrand);
            c.show();
            //静态类里面无法访问其他内部类
            //Car.engine ce=new Car.engine();
        }
        //静态内部类的静态方法show2
        public static void show2(){
            System.out.println("静态类的静态方法");
        }
    }

    //成员变量的匿名内部类c
    //new后面的其实不是car,new的是后面的匿名内部类,再把内部类传递给左边的car类,这样才是实现多态的方式(父类类型=new 子类类型),
    //右边的car只是为了声明后面的大括号里面的内是重写的car的方法
    Car c=new Car() {
        @Override
        public void show() {
            System.out.println("游泳");
        }
    };


    //匿名内部类的特点:
    //1.匿名内部类只能使用一次,但是定义给对象后就可以多次使用了
    //2.匿名内部类没有构造方法
    //3.匿名内部类没有名字
    //4.可以访问外部类的成员变量和方法

    //外部类的成员方法内的匿名内部类的方法show3
    public void show3(){
        //展示在成员位置的匿名内部类对象
        c.show();
        System.out.println(c.carBrand);
        //匿名内部类
        new Car() {
            @Override
            public void show() {
                System.out.println("游泳");
            }
        }.show();
    }



    //非静态内部类engine
    public class engine{
        //不能在在内部类里面再创建内部类
        //只能在外部类的成员范围里面创建或者在外部类的方法里面创建
        /*new Car() {
            @Override
            public void show() {
                System.out.println("游泳");
            }
        }.show();*/

        //非静态内部类里面不能有静态方法
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            System.out.println(engineAge);
            System.out.println(carBrand);
        }
        public void show1(){
            //非静态类可以访问外部类的静态方法,不需要实例化
            Car.inner.show2();
            Car.inner.out();
            //非静态类访问外部类的非静态方法,需要实例化
            Car c=new Car();
            c.show();
            //非静态内部类可以访问其他内部类
            //只是在访问其他非静态内部类时需要实例化,访问其他静态内部类不需要,
            //但是如果是访问静态类里面的非静态方法也需要实例化
            Car.inner ci=new Car.inner();
            ci.show();
            ci.out2();
        }

    }
}
