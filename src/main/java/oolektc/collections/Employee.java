package oolektc.collections;

public class Employee {
    private static int countOfObjects = 0;

    private final int id;
    private final String name;
    private final int numberOfObject;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        numberOfObject = countOfObjects++;
    }

    public int getNumberOfObject() {
        return numberOfObject;
    }

    @Override
    public String toString() {
        return "Employee id: " + id + "  name: " + name;
    }
}
