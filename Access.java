// private access modifier
 class A {
    private void display() {
        System.out.println("Private method");
    }
    public void display1(){
    	System.out.println("Public method");
    }
    // protected access modifier
    protected void display2() {
        System.out.println("Protected method");
    }
}

class Access {
    public static void main(String args[]) {
        A obj = new A();
        obj.display1();
        obj.display2();
    }
}
