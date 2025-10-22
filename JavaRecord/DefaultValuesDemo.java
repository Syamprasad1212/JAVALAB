// Program to display default values of primitive data types in Java
class DefaultValuesDemo {
    int number;
    float rate;
    boolean status;
    double balance;
    char grade;
    long distance;
    byte level;
    short code;

    void showDefaults() {
        System.out.println("---- Default Values of Data Types ----");
        System.out.println("int value       : " + number);
        System.out.println("float value     : " + rate);
        System.out.println("boolean value   : " + status);
        System.out.println("double value    : " + balance);
        System.out.println("char value      : '" + grade + "'");
        System.out.println("long value      : " + distance);
        System.out.println("byte value      : " + level);
        System.out.println("short value     : " + code);
    }

    public static void main(String[] args) {
        DefaultValuesDemo obj = new DefaultValuesDemo();
        obj.showDefaults();
    }
}
Output:
---- Default Values of Data Types ----
int value       : 0
float value     : 0.0
boolean value   : false
double value    : 0.0
char value      : ' '
long value      : 0
byte value      : 0
short value     : 0
