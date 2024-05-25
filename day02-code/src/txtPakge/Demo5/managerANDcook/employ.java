package txtPakge.Demo5.managerANDcook;

public class employ {
    private int id;
    private String name;
    private int pay;

    public void eat(){
        System.out.println("吃米饭");
    }

    public void work(){
    }

    public employ() {
    }

    public employ(int id, String name, int pay) {
        this.id = id;
        this.name = name;
        this.pay = pay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}
