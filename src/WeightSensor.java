public class WeightSensor 
{
    private float weight;

    //判斷重量過低後通知通知
    public void CheckWeight(Notifier notifier, FridgeDrawer fridgeDrawer)
    {

        if (weight <= fridgeDrawer.minWeight) notifier.NotifyWeight(fridgeDrawer);
   
    } 

    //取得當前重量
    public float GetMinWeight()
    {
        return weight;
    }

    //讓別的class取得現在的溫度
    public float GetWeight()
    {
        SetWeight();
        return weight;
    }
    //跟硬體取得溫度
    public void SetWeight()
    {

    }
}
