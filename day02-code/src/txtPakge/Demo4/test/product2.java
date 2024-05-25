package txtPakge.Demo4.test;

public class product2 {
    private String name;
    private int price;
    private String color;

    //构造函数
    public product2() {
    }

    public product2(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    //初始化

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //
}
