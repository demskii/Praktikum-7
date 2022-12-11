public class Infinix implements Phone {

    private int volume;
    private boolean isPowerOn;

    public Infinix() {
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone ON");
        System.out.println("Welcome to Infinix");
        System.out.println("Android version 16");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Phone Shutting Down");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL");
                System.out.println("Done " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume now: " + this.getVolume());
            }
        } else {
            System.out.println("Turn on the Phone!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume now: " + this.getVolume());
            }
        } else {
            System.out.println("Please turn on the Phone");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
