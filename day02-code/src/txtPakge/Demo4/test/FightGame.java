package txtPakge.Demo4.test;

import java.util.Random;

public class FightGame {
    //生成成员变量(对象的属性)
    private String name;
    private int blood;
    private char gender;
    private String face;

    //长相
    String[] boyFace={"风流倜傥","气宇轩昂","丑八怪"};
    String[] girlFace={"貌美如花","沉鱼落雁","猪八婆"};

    //武功招式
    String[] attack_desc={
            "%s使出一招[扫堂腿],转到对方身后,一掌向%s背心拍去",
            "%s使出一招[降龙十八掌],打了%s",
            "%s大喝一声,身形向下,一招[劈雷坠地,捶向%s的腿",
            "%s阴手翻起阳首跟进,一招[没遮拦],结结实实垂向%s",
            "%s上步抢身,招中套招,一招[劈挂连环],连环攻向%s"
    };

    //受伤描述
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇兄兄，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果「轰」的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去",
            "%s经脉尽断"
    };


    //生成构造方法(方便把对象的属性打包)
    //生成空参构造方法
    public FightGame(){
    }
    //生成带参构造方法(这里face是用的gender参数)
    public FightGame(String name, int blood,char gender){
        this.name=name;
        this.blood=blood;
        this.gender=getGender();
        //setFace是void类型,因此和上面的格式不一样
        //上面的属性在调用构造方法时已经给赋值了,不需要使用set方法,但是face必须在set方法里面才能赋值,
        //因此必须在构造方法里面使用一次set方法,保证face得到值
        setFace(gender);
    }


    //生成get和set方法
    //gender
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    //face
    public void setFace(char gender) {
        Random r=new Random();
        if(gender=='男'){
            int index=r.nextInt(boyFace.length);
            this.face=boyFace[index];
        } else if(gender=='女'){
            int index=r.nextInt(girlFace.length);
            this.face=girlFace[index];
        }else {
            System.out.println("输入错误");
            this.face="丑八怪";
        }
    }
    public String getFace() {
        return face;
    }

    //name
    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    //blood
    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }


    //生成战斗的方法
    /*写一个对象
    方法调用者去攻击参数
     */
    public void attackRole(FightGame Gameplayer){
    //输出攻击效果
        Random r=new Random();
        int index=r.nextInt(attack_desc.length);
        String zhaoshu=attack_desc[index];
        System.out.printf(zhaoshu,this.getName(),Gameplayer.getName());
        System.out.println();

        //生成攻击,伤害效果1~20;
        int attack=r.nextInt(20)+1;
        //生成剩余血量
        int remainBlood=getBlood()-attack;
        remainBlood=remainBlood>0 ? remainBlood : 0;
        Gameplayer.setBlood(remainBlood);
    //生成攻击过程
        System.out.println(this.getName()+"举起了拳头,攻击了"+Gameplayer.getName()+
                ",对"+Gameplayer.getName()+"造成"+attack+"点伤害,"+ Gameplayer.getName()+"剩下"+remainBlood+"点血");

    //输出伤害效果
        //根据伤害不同,描述逐渐递增
        //血量>90 0 index
        if (remainBlood > 90) {
            System.out.printf(injureds_desc[0],Gameplayer.getName());
            System.out.println();
        }
        //80~90 1 index
        else if (remainBlood >= 80&&remainBlood<90) {
            System.out.printf(injureds_desc[1],Gameplayer.getName());
            System.out.println();
        }
        //70~80 2 index
        else if (remainBlood >= 70&&remainBlood<80) {
            System.out.printf(injureds_desc[2],Gameplayer.getName());
            System.out.println();
        }
        //60~70 3 index
        else if (remainBlood >= 60&&remainBlood<70) {
            System.out.printf(injureds_desc[3],Gameplayer.getName());
            System.out.println();
        }
        //50~60 4 index
        else if (remainBlood >= 50&&remainBlood<60) {
            System.out.printf(injureds_desc[4],Gameplayer.getName());
            System.out.println();
        }
        //30~50 5 index

        else if (remainBlood >= 30&&remainBlood<50) {
            System.out.printf(injureds_desc[5],Gameplayer.getName());
            System.out.println();
        }
        //20~30 6 index
        else if (remainBlood >= 20&&remainBlood<30) {
            System.out.printf(injureds_desc[6],Gameplayer.getName());
            System.out.println();
        }
        //10~20 7 index
        else if (remainBlood >= 10&&remainBlood<20) {
            System.out.printf(injureds_desc[7],Gameplayer.getName());
            System.out.println();
        }
        //0~10 8 index
        else {
            System.out.printf(injureds_desc[8],Gameplayer.getName());
            System.out.println();
        }
    }

//玩家信息
    public void showRoleInfo(){
        System.out.println("姓名为:"+getName());
        System.out.println("性别为:"+getGender());
        System.out.println("血量为:"+getBlood());
        System.out.println("长相为:"+getFace());
        System.out.println("=====================");
    }
}
