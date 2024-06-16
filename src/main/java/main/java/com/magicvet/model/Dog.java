package main.java.com.magicvet.model;

public class Dog extends Pet {
    private String size;

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
