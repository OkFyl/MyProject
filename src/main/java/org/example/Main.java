package org.example;

public class Main {


 public static void main(String[] args) {
  // Task 1
  byte num = 74;
  byte num1 = 36;
  int res = num + num1;
  System.out.println(res);
  // Task 2
  System.out.println(-5 + 8 * 6);
  System.out.println((55 + 9) % 9);
  System.out.println(20 + -3 * 5 / 8);
  System.out.println(20 + -3 * 5 / 8);
  System.out.println(5 + 15 / 3 * 2 - 8 % 3);
  //Task 3
  int num2 = 125, num3 = 24;

  int res1 = num2 + num3;
  System.out.println("125 + 24 = " + res1);

  int res2 = num2 - num3;
  System.out.println("125 - 24 = " + res2);

  int res3 = num2 * num3;
  System.out.println("125 * 24 = " + res3);

  double res4 = (double) num2 / (double) num3;
  System.out.println("125 / 24 = " + res4);

  double res5 = (double) num2 % (double) num3;
  System.out.println("125 % 24 = " + res5);
  // Task 4
  int array[] = {5,6,7,12,-5,32,43};

  sum(array);
 }
 public static void sum(int[] array)
  {
   // getting sum of array values
   int sum = 0;

   for (int i = 0; i < array.length; i++)
    sum+=array[i];

   System.out.println(sum);
  }


 }





