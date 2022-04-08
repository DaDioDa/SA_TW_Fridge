public class TempSensor 
{
    private Notifier notifier;
    private float temperature;
    private float MaxTemperature;

    //設定通知器
    public void SetNotifier(Notifier notifier)
    {
        this.notifier = notifier;
    }

    //判斷溫度過高後通知通知
    public void CheckTemperature()
    {
        if (temperature >= MaxTemperature) notifier.NotifyAbnormalTemperature();
    }

    //設定異常溫度
    public void SetMaxTemperature(float maxTemperature)
    {
        this.MaxTemperature = maxTemperature;
    }

    //取得異常溫度
    public float GetMaxTemperature()
    {
        return MaxTemperature;
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
