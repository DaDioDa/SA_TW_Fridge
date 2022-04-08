public class Goods 
{
    //菜ID
    private int ProductID;
    //小農名稱
    private String FarmName;
    //購買的菜名
    private String ProductName;
    //100g的價格
    private float Price;
    //有效期限，day
    private int ExpirationDate;

    public Goods(){}

    public Goods(int ProductID, String FarmName, String ProductName, float Price , int ExpirationDate)
    {
        this.ProductID = ProductID;
        this.FarmName = FarmName;
        this.ProductName = ProductName;
        this.Price = Price;
        this.ExpirationDate = ExpirationDate;
    }

    //取得菜ID
    public int getProductID() 
    {
        return ProductID;        
    }
    //取得小農名稱
    public String GetFarmName()
    {
        return FarmName;
    }
    //取得菜名
    public String GetProductName()
    {
        return ProductName;
    }   
    //取得價錢
    public float getPrice()
    {
        return Price;
    }
    //取得有效期限
    public int GetExpirationDate()
    {
        return ExpirationDate;
    }
}
