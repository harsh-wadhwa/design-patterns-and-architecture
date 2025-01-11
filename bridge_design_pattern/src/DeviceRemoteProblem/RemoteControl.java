package DeviceRemoteProblem;

public class RemoteControl {

    protected Device device;   // reference to passed implementation

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
        System.out.println(device.getVolume());
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
        System.out.println(device.getVolume());
    }

}
