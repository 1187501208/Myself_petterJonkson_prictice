package txtPakge.Demo4;

public class User {
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;
    private int id;

    //生成空参构造和有构造
    //快捷键:alt+insert
    //快捷键2:插件PTG


    public User() {
    }

    public User(String username, String password, String email, String gender, int age,int id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.id=id;
    }

    //生成set方法和get方法
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
