public class TempSensor 
{
    private Notifier notifier;
    private float temperature;

    public void SetNotifier(Notifier notifier)
    {
        this.notifier = notifier;
    }

    public void CheckTemperature()
    {
        if () 
        {
            notifier.NotifyAbnormalTemperature();
        }
    }
}
