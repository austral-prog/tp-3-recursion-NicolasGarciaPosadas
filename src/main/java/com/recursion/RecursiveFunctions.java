package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursiveFunctions {

    public static int recursiveIndexOf(List<String> list, String target) {
        if (!list.contains(target)) {
            return -1;
        }
        return recursiveIndexOfByIndex(list, target,0);
        }



    public static int recursiveIndexOfByIndex(List<String> list, String target, int index) {
        if (index >= list.size()) {
            return -1;
        }
        if (list.get(index).equals(target)) {
            return index;
        }
        return recursiveIndexOfByIndex(list, target, index + 1);
    }

    public static int recursiveIndexOfEmpty(List<String> list) {
        return recursiveIndexOf(list, "");
    }

    public static int recursivePut(String target, List<String> list) {
        int index=recursiveIndexOfEmpty(list);
        if (index == -1) {
            return -1;
        }
        list.set(index, target);
        return index;
    }

    public static int recursiveRemove(List<String> list, String target) {
        int removals=0;
        if (!list.contains(target)) {
            return 0;
        }
        if (list.contains(target)) {
            list.remove(target);
            removals+=1;
        }
        return removals + recursiveRemove(list, target);
    }

    public static int recursiveSum(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        List<Integer> listCopy = new ArrayList<>(list);
        int sum=0;
        Integer number = listCopy.get(0);
        sum+=number;
        listCopy.remove(0);
        return sum + recursiveSum(listCopy);

    }

    public static int recursiveFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    public static int recursivePow(int base, int exponent) {
        if (exponent == 1) {
            return base;
        }
        return recursivePow(base, exponent - 1) * base;
    }

    public static int recursiveFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static boolean recursivePalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length()-1)) {
            return false;
        }
        return recursivePalindrome(word.substring(1, word.length()-1));

    }


}
