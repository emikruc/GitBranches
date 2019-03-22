package branch1;


public class Branch1{
    int a = 100;
    public String name = "Misha na master chenged a value";

    public Branch1(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Branch1{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }
}
