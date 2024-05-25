package txtPakge.Demo5.managerANDcook;

public class test {
    public static void main(String[] args) {
        /*
        写一个带哟继承结构的标准javabean类:
        1.经理
        成员变量:工号，姓名，工资，管理奖金成员方法:工作(管理其他人)，吃饭(吃米饭)
        2.厨师
        成员变量:工号，姓名，工资公成员方法:工作(炒菜)，吃饭(吃米饭)
         */

        manager mg=new manager(12,"ads",19999,1000);
        cook ck=new cook(14,"ddd",2569);
        System.out.printf("经理工号:%s\n",mg.getId());
        System.out.printf("经理姓名:%s\n",mg.getName());
        System.out.printf("经理工资:%s\n",mg.getPay());
        System.out.printf("经理奖金:%s\n",mg.getManagerPrice());
        System.out.print("经理在");mg.work();
        System.out.print("经理在");mg.eat();
        System.out.println("------------------");
        System.out.printf("厨师工号:%s\n",ck.getId());
        System.out.printf("厨师姓名:%s\n",ck.getName());
        System.out.printf("厨师工资:%s\n",ck.getPay());
        System.out.print("厨师在");ck.work();
        System.out.print("厨师在");ck.eat();
        System.out.println("------------------");
    }
}
