package Builder;

public class ConcreteBuilder extends Builder{

    @Override
    public void buildPartA() {
        product.setPartA("建造PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造PartC");
    }
}
