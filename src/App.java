import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        //訂單列表
        ArrayList<Order> MyOrder = new ArrayList<Order>();

        OrderGoods orderGoods = new OrderGoods();

        //GUI新增訂單該做的事
        Order NewOrder = orderGoods.OutputOrder();
        MyOrder.add(NewOrder); 


        /*--------------------------------------------------------*/
        Notifier notifier = new Notifier();
        TempSensor tempSensor = new TempSensor();
        //if (tempSensor.GetTemperature() >= 20) notifier.NotifyAbnormalTemperature();
    }
}
