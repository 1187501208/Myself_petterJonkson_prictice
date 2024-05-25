package txtPakge.Demo4.StudentSystem;

public class StudentInfo {
    private String id;
    private String name;
    private int age;

    public StudentInfo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public StudentInfo(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
