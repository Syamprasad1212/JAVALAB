// Program to demonstrate constructor overloading
class Boxes {
    int l, b, h;
    Boxes() {
 l = b = h = 1;
    }
    Boxes(int x) {
 l = b = h = x;
    }
    Boxes(int l, int b, int h) {
 this.l = l;
  	 this.b = b;
    	 this.h = h;
    }
    int volume() { 
return l * b * h;
    }
    public static void main(String[] args) {
        Boxes b1 = new Boxes();
        Boxes b2 = new Boxes(3);
        Boxes b3 = new Box(2, 3, 4);
        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());
    }
}

Output:
1
27
24
