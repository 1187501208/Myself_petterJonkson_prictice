package txtPakge.Demo5.polymorphismDemo1;

public class test {
    public static void main(String[] args) {
        student st=new student();
        st.setAge(18);
        st.setName("小明");
        teacher th=new teacher();
        th.setAge(24);
        th.setName("李老师");
        register(st);
        register(th);
    }

    //此处相当于调用了多态:
    // person p=new student();
    // person p=new teacher();
    //多态是相当于把对象地址传给父类构造方法,父类拿到子类的地址传递给相应调用的方法
    //如果该方法没有被子类重写则直接调用父类方法,否则调用子类重写的方法
    public static void register(person p){
        p.show();
    }
}
