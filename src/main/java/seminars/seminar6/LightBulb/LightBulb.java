package seminars.seminar6.LightBulb;

public class LightBulb implements TurnOnOff{
    @Override
    public void turnOn() {
        System.out.println("Прибор включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Прибор выключен.");
    }
}
