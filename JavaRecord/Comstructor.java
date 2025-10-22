// Program to demonstrate constructor usage
class Syam {
    String name;
    int roll;
    Syam(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
    public static void main(String[] args) {
        Syam s = new Syam("mahii", 19);
        s.display();
    }
}

Output:
Name: mahii, Roll: 19
