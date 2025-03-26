package HomeWork.文字格斗;

import java.util.Random;

/*
    @Auther: exiashow
    @Date: 2025/3/26 00:15
    @Summary: 
*/
public class Role {
    private String name;
    private int blood;

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Role() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }


    // 定义一个方法用于攻击人

    /**
     * 思考：谁攻击谁
     * Role r1 = new Role()
     * Role r2 = new Role()
     * r1.攻击(r2)，用代码表示就是方法的调用者去攻击参数
     */

    public void attack(Role role) {
        // 计算造成的伤害1-20之间
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        // 剩余血量
        int remainBoold = role.getBlood() - hurt;
        // 对剩余的血量做一个验证，如果为负数，就修改为0
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        // 修改一下爱走人的血量
        role.setBlood(remainBoold);


        System.out.println(this.getName() + "举起了拳头，打了" + role.getName() + "一下," +
                "造成了" + hurt + "点伤害，" + role.getName() + remainBoold + "点血了");
    }
}
