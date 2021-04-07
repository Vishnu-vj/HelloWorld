/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package helloworld;

import java.util.Scanner;

/**
 * @author VHM5COB
 */
public class Addition {

  /**
   * @param args
   */
  public static void main(final String[] args) {
    // TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int result = num1 + num2;
    System.out.println("Addition of " + num1 + " and " + num2 + " = " + result);

  }

}
