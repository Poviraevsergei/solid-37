package pattern.factory_method.builder;

public class Main {
    public static void main(String[] args) {
        Device device = new Device.DeviceBuilder().setAge(10).setColor("red").setHeight(10).build();
        Device device2 = new Device.DeviceBuilder().setModel("Test").setType("Type").build();
        Device device3 = new Device.DeviceBuilder().setModel("test").setHeight(10).setColor("red").setType("Test").build();
    }
}
