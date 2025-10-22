// Program to demonstrate class with methods and invocation
class Employee {
    String name;
    int id;
    void setData(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
class ClassMechanismDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setData("syam", 104);
        e.display();
    }
}

Output:
Employee ID: 104, Name: syam
