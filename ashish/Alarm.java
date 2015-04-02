/**
 * Created by Ashish on 4/2/2015.
 */
public class Alarm {
    public static void main(String[] args) {
        SetTime alarm = new SetTime();
        alarm.SetHour();
        alarm.SetMin();
        alarm.SetDN();
        SetDate date = new SetDate();
        date.setMonth();
        date.setWeek();
        date.setDay();
    }
    SetRing ring = new SetRing();
    ring.SetTone();
}
