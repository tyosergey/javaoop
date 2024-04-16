package seminars.seminar6.LightBulb;

public class Switch {
    private TurnOnOff switcher;

    public Switch(TurnOnOff switcher){
        this.switcher = switcher;
    }

    public void operate(){
        switcher.turnOn();
    }
}
