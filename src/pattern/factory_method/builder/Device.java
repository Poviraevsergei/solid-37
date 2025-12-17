package pattern.factory_method.builder;

public class Device {
    private String model;
    private String weight;
    private String color;
    private int size;
    private String type;
    private int age;
    private int height;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static class DeviceBuilder {
        private Device device;

        public DeviceBuilder() {
            device = new Device();
        }

        public DeviceBuilder setModel(String model) {
            device.setModel(model);
            return this;
        }

        public DeviceBuilder setWeight(String weight) {
            device.setWeight(weight);
            return this;
        }

        public DeviceBuilder setColor(String color) {
            device.setColor(color);
            return this;
        }

        public DeviceBuilder setSize(int size) {
            device.setSize(size);
            return this;
        }

        public DeviceBuilder setType(String type) {
            device.setType(type);
            return this;
        }

        public DeviceBuilder setAge(int age) {
            device.setAge(age);
            return this;
        }

        public DeviceBuilder setHeight(int height) {
            device.setHeight(height);
            return this;
        }

        public Device build() {
            return device;
        }
    }
}
