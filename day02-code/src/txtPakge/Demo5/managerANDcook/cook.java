package txtPakge.Demo5.managerANDcook;

public class cook extends employ {
    @Override
    public void work() {
        System.out.println("炒菜");
    }

    public cook() {
    }

    public cook(int id, String name, int pay) {
        super(id, name, pay);
    }

}
