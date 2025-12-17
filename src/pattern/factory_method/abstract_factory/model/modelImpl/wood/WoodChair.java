package pattern.factory_method.abstract_factory.model.modelImpl.wood;

import pattern.factory_method.abstract_factory.model.Chair;

public class WoodChair implements Chair {
    private String material;
    private double weight;

    public WoodChair() {
        material = "Wood";
        weight = 1.0;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void useChair() {
        System.out.println(material + " Chair ... Weight:" + weight);
    }
}
