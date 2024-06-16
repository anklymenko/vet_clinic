package main.java.com.magicvet.model;

public class Dog extends Pet {

    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String XL = "XL";
    private String size;

    public Dog() {}

    public Dog(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
}
