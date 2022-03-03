package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        TV sonyOldRemote = new SonyTv(new OldRemote());
        sonyOldRemote.on();
        sonyOldRemote.off();

        TV sonyNewRemote = new SonyTv(new NewRemote());
        sonyNewRemote.on();
        sonyNewRemote.off();

    }
}
