package system12306;

import java.util.Vector;

public class System12306 {

    //设计一个单例模式
    private System12306(){}
    private static System12306 sys = new System12306();
    public static System12306 getInstance(){
        return sys;
    }

    //属性  集合ArrayList  Vector  synchronized  Stack
    private Vector<Ticket> tickets = new Vector<>();

    //当前系统创建后给tickets集合赋值
    {
        for(int i=10;i<100;i++){
            tickets.add(new Ticket("北京"+i,"深圳"+i,(i%5+5)*25F));
        }
    }

    //设计一个方法  从集合内获取一张火车票
    public Ticket getTicket(){
        try {
            return tickets.remove(0);
        }catch (Exception e){
            return null;
        }
    }
}
