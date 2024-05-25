package txtPakge.Demo5.managerANDcook;

public class manager extends employ {
    private int managerPrice;

    //虽然父类的work没有任何内容,我们还是要往上抽取,方便后面要求默认值,我们直接在父类里面设置就行
    @Override
    public void work() {
        System.out.println("管理他人");
    }

    //空参构造
    public manager() {
    }

    //带参构造(父类和子类所有参数都要带上)
    public manager(int id, String name, int pay, int managerPrice) {
        super(id, name, pay);
        this.managerPrice = managerPrice;
    }

    //get和set方法

    public int getManagerPrice() {
        return managerPrice;
    }

    public void setManagerPrice(int managerPrice) {
        this.managerPrice = managerPrice;
    }
}
