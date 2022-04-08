public class Setting 
{
    //冰箱格子陣列
    private FridgeDrawer myFridgeDrawer[][] = new FridgeDrawer[3][3];

    //這邊要怎麼處理我覺得很混亂
    //理論上每一個格子都需要一個重量Sensor
    //那我要在冰箱格子的class中hold一個WeightSensor嗎
    //還是我在這個class裡面開一個WeightSensor陣列
    //因爲我有冰箱有幾個分隔就應該有幾個重量感測器吧
    


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
