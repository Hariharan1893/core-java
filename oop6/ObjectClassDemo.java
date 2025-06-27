package oop6;

public class ObjectClassDemo extends Object {

    int number;
    double decimal;

    ObjectClassDemo(int number, double decimal) {
        this.number = number;
        this.decimal = decimal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.number == ((ObjectClassDemo) obj).number) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("ObjectClassDemo object is being garbage collected");
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "ObjectClassDemo{" +
                "number=" + number +
                ", decimal=" + decimal +
                '}';
    }

    public static void main(String[] args) {
        ObjectClassDemo obj1 = new ObjectClassDemo(10, 20.5);
        ObjectClassDemo obj2 = new ObjectClassDemo(10, 30.5);
        ObjectClassDemo obj3 = new ObjectClassDemo(20, 40.5);

        System.out.println("obj1 equals obj2: " + obj1.equals(obj2)); // true
        System.out.println("obj1 equals obj3: " + obj1.equals(obj3)); // false

        System.out.println("obj1 hashCode: " + obj1.hashCode());
        System.out.println("obj2 hashCode: " + obj2.hashCode());
        System.out.println("obj3 hashCode: " + obj3.hashCode());

        System.out.println(obj1.toString());

    }

}
