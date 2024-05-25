package txtPakge.Demo4.test;

public class product {
    //定义数组储存3个商品对象
    //商品属性:商品id,名字,价格,库存
    //创建三个商品对象,并把商品对象储存到数组中去

    //创建属性
    private String name;
    private int ID;
    private int price;
    private  int list;

    //构造函数
    public product(){
    }

    public product(String name, int ID, int price, int list) {
        this.name = name;
        this.ID = ID;
        this.price = price;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getList() {
        return list;
    }

    public void setList(int list) {
        this.list = list;
    }

    //
}
