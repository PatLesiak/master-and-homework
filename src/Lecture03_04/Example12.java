package Lecture03_04;
// Decrement Operator (--)

public class Example12 {
 public static void main ( String[] args ) {
  int x, result;
  x = 1;
  System.out.println("x = " + x);         // 1
  System.out.println("--x = " + --x);     // 2
  System.out.println("x-- = " + x--);     // 3
  System.out.println("x = " + x);         // 4
  result = x--;
  System.out.println("result = " + result);     // 5
  result = --x;
  System.out.println("--result = " + --result); // 6
 }
}
