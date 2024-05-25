package txtPakge.Demo4;

public class GirlFriend2 {
    //编写女朋友类,创建女朋友类的对象,给女朋友的属性赋值并调用女朋友类中的方法


    //private属性只能在本类中调用
    private String name;
    private int age;
    private String gender;

    //设置set和get方法
    //name
    public void setName(String n){
        name=n;
    }

    public String getName(){
        return  name;
    }

    //age
    public void setAge(int a){
        if(a>=18&&a<=50){
            age=a;
        }else {
            System.out.printf("非法参数");
        }
    }

    public int getAge(){
        return age;
    }

    //gender
    public void setGender(String g){
        gender=g;
    }

    public  String getGender(){
        return gender;
    }
    //行为
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }

    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
