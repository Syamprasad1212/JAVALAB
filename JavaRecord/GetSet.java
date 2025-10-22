// Program to demonstrate getter and setter methods
class Persons {
    private String name;
    public void setName(String name) { 
this.name = name;
    }
    public String getName() { 
return name;
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Syamala");
        System.out.println("Name: " + p.getName());
    }
}

Output:
Name: Syamala
