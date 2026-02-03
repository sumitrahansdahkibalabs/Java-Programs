public class Main{
    public static void main(String[] args) {
        Device myDevice = new SmartPhone();
        myDevice.powerOn();
        System.out.println();

        Appliance myBlender = new Blender();
        Appliance myMicrowave = new MicroWave();
        myBlender.turnOn();
        myMicrowave.turnOn();
        System.out.println();

//Tiger t = new Tiger();
        Animal a = new Tiger();
// Upcasting or Parent type reference to child class object.
//a = t;
        a.eat();
        a.sleep();

        ((Tiger)(a)).hunt();
        System.out.println();

        Bird brd = new Eagle();
        brd.eat();
        brd.sleep();
        ((Eagle) brd).fly();
        brd = new Sparrow();
        brd.eat();
        brd.sleep();
        ((Sparrow) brd).fly();
        System.out.println();

        Message text = new TextMessage();
        text.send();
        Message voice = new VoiceMessage();
        voice.send();
        Message video = new VideoMessage();
        video.send();
        System.out.println();

        PaymentApp upi = new Upi();
        upi.pay();
        PaymentApp wal = new Wallet();
        wal.pay();
        PaymentApp card = new Card();
        card.pay();
    }
}
