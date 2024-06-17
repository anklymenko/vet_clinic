package main.java.com.magicvet.model;

public class Dog extends Pet {

    private Size size;

    public Dog() {}

    public Dog(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "\n\ttype = " + this.getType() +
                ", sex = " + this.getSex() +
                ", age = " + this.getAge() +
                ", name = " + this.getName() +
                ", ownerName = " + this.getOwnerName() +
                ", size = " + size +
                "\n\t}";
    }

    public enum Size {
        XS(1),
        S(2),
        M(3),
        L(4),
        XL(5),
        UNKNOWN(0);

        private final int value;

        Size(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
