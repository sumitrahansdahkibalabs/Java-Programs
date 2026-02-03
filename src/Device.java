public class Device {
    void powerOn() {
        System.out.println("Device is powered on.");
    }
}
class SmartPhone extends Device {
    void powerOn() {
        System.out.println("Smartphone is powered on with a touch screen interface.");
    }
}
