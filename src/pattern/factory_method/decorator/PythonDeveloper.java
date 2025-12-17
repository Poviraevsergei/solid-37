package pattern.factory_method.decorator;

public class PythonDeveloper implements Developer {
    @Override
    public void skill() {
        System.out.println("I can write Python code!");
    }
}
