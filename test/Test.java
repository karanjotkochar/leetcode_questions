package test;

public class Test {
     public static void main(String[] args) {
          String name = "Hello World";

          // static member
          testFunction1(name);

          // non-static member
          Test testInstance = new Test();
          testInstance.mainSecond();
          testInstance.testfunction2(name);
     }
     public void mainSecond() {
          testfunction2("hi");
     }

     private static void testFunction1(String name) {
          System.out.println("in function one, printing: " + name);

          // cannot call non static member
          // testFunction2();
     }

     private void testfunction2(String name) {
          System.out.println("in function two, printing: " + name);

          // can call static member
          testFunction1(name);
     }

}
