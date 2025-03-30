package HomeWork.文字格斗;

/*
    @Auther: exiashow
    @Date: 2025/3/26 00:27
    @Summary: 
*/
public class Game {
    public static void main(String[] args) {
        Role r1 = new Role("乔帮主", 100);
        Role r2 = new Role("黑曼巴", 100);


        while (true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }
    }
}
