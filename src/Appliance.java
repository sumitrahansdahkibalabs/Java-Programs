public class Appliance {
    public void turnOn() {
        System.out.println("Generic Appliance is turned on.");
    }
}
class Blender extends Appliance {
    public void turnOn() {
        System.out.println("Blender is set to mix.");
    }
}
class MicroWave extends Appliance {
    public void turnOn() {
        System.out.println("Microwave is ready to heat.");
    }
}

