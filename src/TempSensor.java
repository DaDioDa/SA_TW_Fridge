public class TempSensor 
{
    private Notifier notifier;
    private float temperature;
    private float maxTemperature;

    //設定通知器
    public void SetNotifier(Notifier notifier)
    {
        this.notifier = notifier;
    }

    //判斷溫度過高後通知通知
    public void CheckTemperature()
    {
        if (temperature >= maxTemperature) notifier.NotifyAbnormalTemperature();
    }

    //設定最大溫度
    public void SetMaxTemperature(float maxTemperature)
    {
        this.maxTemperature = maxTemperature;
    }

    //取得最大溫度
    public float GetMaxTemperature()
    {
        return maxTemperature;
    }

    //讓別的class取得現在的溫度
    public float GetTemperature()
    {
        SetTemperature();
        return temperature;
    }

    //跟硬體取得溫度
    public void SetTemperature()
    {

    }
}
