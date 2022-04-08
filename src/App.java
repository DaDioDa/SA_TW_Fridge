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
        //給溫度感應一個通知器
        tempSensor.SetNotifier(notifier);
        //應該要週期性的呼叫檢查溫度
        tempSensor.CheckTemperature();
        //if (tempSensor.GetTemperature() >= 20) notifier.NotifyAbnormalTemperature();

        /*--------------------------------------------------------*/
        FridgeDrawer myFridgeDrawer[][] = new FridgeDrawer[3][3];
        Setting set = new Setting();
        //加入我要設定0，0格的細節
        set.SetFridgeDrawer(myFridgeDrawer);
        //set.SetDrawerDetail(0, 0, goods, drawerMode, minWeight);
    }
}
