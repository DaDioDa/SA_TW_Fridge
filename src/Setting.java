public class Setting 
{
    //冰箱格子陣列
    private FridgeDrawer myFridgeDrawer[][] = new FridgeDrawer[3][3];

    //可能跟DB或者local取得格子資料
    

    //設定這格什麼菜、最小重量、模式冷藏/冷凍/生鮮/急速冷凍
    public void SetDrawerDetail(int i, int j,Goods goods, DrawerMode drawerMode, float minWeight)
    {
        myFridgeDrawer[i][j].drawerMode = drawerMode;
        myFridgeDrawer[i][j].goods = goods;
        myFridgeDrawer[i][j].minWeight = minWeight;
    }
    
    //格子交換位子
    public void ChangeDrawerPosition(int i, int j, int m, int n)
    {
        
    }
}
