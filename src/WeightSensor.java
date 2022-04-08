public class WeightSensor 
{
    private Notifier notifier;
    private float weight;
    private float minWeight;

    //設定通知器
    public void SetNotifier(Notifier notifier)
    {
        this.notifier = notifier;
    }

    //判斷重量過低後通知通知
    public void CheckTemperature()
    {
        if (weight <= minWeight) notifier.NotifyWeight();
    }

    //設定最大溫度
    public void SetMinWeight(float minWeight)
    {
        this.minWeight = minWeight;
    }

    //取得最大溫度
    public float GetMinWeight()
    {
        return minWeight;
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
