import java.util.Date;
import java.util.ArrayList;

public class Order 
{
    //訂單編號
    int OrderId;
    //訂單日期
    Date OrderDate;
    //預計到貨日期
    Date EstimatArrivalDate;
    //到貨日期
    Date ArrivalDate;
    //訂單內容(菜的陣列)
    ArrayList<Goods> OrderContent;
    //訂單狀態
    OrderStatus Status;
    //總價
    float TotalPrice;

    //建構
    public Order(int OrderId,ArrayList<Goods> OrderContent, Date OrderDate, Date EstimatArrivalDate)
    {
        this.OrderId = OrderId;
        this.OrderContent = OrderContent;
        this.OrderDate = OrderDate;
        this.EstimatArrivalDate = EstimatArrivalDate;
    }

    //設定訂單狀態
    public void SetOrderStatus(OrderStatus orderStatus)
    {
        Status = orderStatus;
        //如果狀態==貨到了，設定到貨日
        if(Status == OrderStatus.Arrived) SetArrivalDate();
    }

    //回傳訂單的狀態
    public OrderStatus ReturnOrderStatus()
    {
        return Status;
    }

    //取得預計到達日期
    public Date GetEstimatArrivalDate()
    {
        return EstimatArrivalDate;
    }

    //計算訂單總價
    public void CalTotalPrice()
    {
        for (Goods goods : OrderContent) 
        {
            TotalPrice += goods.getPrice();
        }
    }

    //設定到貨日
    void SetArrivalDate()
    {
        ArrivalDate = new Date();
    }
}
