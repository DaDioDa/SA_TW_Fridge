import java.util.ArrayList;
import java.util.Date;

public class OrderGoods
{
    //可用的小農商品清單
    private ArrayList<Goods> AvailableGoods;
    //購物車
    private ArrayList<Goods> Cart;
    //訂單列表
    //private ArrayList<Order> MyOrder;

    //從外部取得可用的小農商品清單
    public void GetStoreList()
    {
        //從外部取得目前仍有庫存的商品
        //假設從外部取得庫存
        AvailableGoods = new ArrayList<Goods>();
    }

    //GUI抓小農商品清單
    public ArrayList<Goods> GetAvailableGoods()
    {
        return AvailableGoods;
    }

    //加入購物車
    public void AddToCart(Goods g)
    {
        Cart.add(g);
    }

    //GUI抓回傳當前購物車
    public ArrayList<Goods> ShowCart()
    {
        return Cart;
    }

    //刪除購物車商品
    public void RemoveFromCart(Goods g)
    {
        Cart.remove(g);
    }


    //輸出訂單
    public Order OutputOrder()
    {
        //新增一個訂單obj
        return new Order(1,Cart,new Date(),new Date()/*<--這個應該是預計到貨日*/);
    }
    
}
