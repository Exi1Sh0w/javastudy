package 面向对象进阶.继承.Test;

/*
    @Auther: exiashow
    @Date: 2025/4/4 23:43
    @Summary: 
*/
public class Chef extends Employee {

    public Chef() {
    }

    public Chef(String id, String name, double salary) {
        super(id, name, salary);
    }


    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
