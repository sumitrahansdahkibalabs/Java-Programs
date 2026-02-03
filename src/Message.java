public class Message {
    public void send() {
        System.out.println("Message sent.");
    }
}
class TextMessage extends Message {
    public void send() {
        System.out.println("Text message sent.");
    }
}
class VoiceMessage extends Message {
    public void send() {
        System.out.println("Voice message sent.");
    }
}
class VideoMessage extends Message {
    public void send() {
        System.out.println("Video message sent.");
    }
}
