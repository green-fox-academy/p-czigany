package com.greenfoxacademy.frontend.service;

/**
 * Created by peter on 2017.05.10..
 */
public class ArrayCounter {

  public int sum(int[] array) {
    int sum = 0;
    for (int item :
            array) {
      sum += item;
    }
    return sum;
  }

  public int multiply(int[] array) {
    int result = 1;
    for (int item :
            array) {
      result *= item;
    }
    return result;
  }

  public int[] doubling(int[] array) {
    int[] doubled = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      doubled[i] = array[i] * 2;
    }
    return doubled;
  }
}
