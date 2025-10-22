// Program to demonstrate insert() and delete() methods of StringBuffer
class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HelloWorld");
        System.out.println("Original StringBuffer : " + sb);
        sb.insert(5, ' ');
        System.out.println("After insert operation : " + sb);
        sb.delete(5, 6);
        System.out.println("After delete operation : " + sb);
    }
}
Output:
Original StringBuffer : HelloWorld
After insert operation : Hello World
After delete operation : HelloWorld     
