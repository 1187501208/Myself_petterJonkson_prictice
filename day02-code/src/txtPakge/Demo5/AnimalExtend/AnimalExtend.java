package txtPakge.Demo5.AnimalExtend;

public class AnimalExtend {
    public static void main(String[] args) {
        RagDoll rd=new RagDoll();
        rd.catchMouse();
        System.out.println("----------------------");
        Husky hs=new Husky();
        hs.breakHome();
        hs.lookHome();
        //有一部分函数是默认继承了Object
    }
}
