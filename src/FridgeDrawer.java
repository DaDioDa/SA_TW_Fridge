import java.util.Date;

public class FridgeDrawer 
{
    private int i ,j;
    private DrawerMode drawerMode;
    private Goods goods;
    private float minWeight;   
    private Date ExpireDate; 

    public FridgeDrawer(int i, int j)
    {
        this.i = i;
        this.j = j;
    }

    public void EditFridgeDrawerDetail(Goods goods, DrawerMode drawerMode, float minWeight)
    {
        this.drawerMode = drawerMode;
        this.goods = goods;
        this.minWeight = minWeight;
    }

    public float GetMinWeight()
    {
        return minWeight;
    }
}
