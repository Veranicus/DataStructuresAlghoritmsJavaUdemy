package com.patrikpolacek.Recursion;

public class NormalFactorial {


    public int iterativeFactorial(int num) {
        int factorial = 1;
        if (num == 0) {
            return 1;
        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }

//
//    0! = 1
//    1! = 1 = 1 * 0!
//    2! = 2 * 1 = 2 * 1!
//    3! = 3 * 2 * 1 = 3 * 2!
//    4! = 4*3*2*1 = 4 * 3!
//    n! = n * (n-1)!


//    Java uses call stack / recursion stack
//    Calls are in the reverse order
//    LIFO structure

//    We always need break condition to end the recursion
//    Its also called based case/breaking condition

//    Iterative implementation is usually faster and better optimised
//    Than recursive method.
//    Some problems are on the other hands much easier done recursively
//    than iteratively

//    even when we have recursive condition which is hit after 1 mil
//    methods we can get stackoverflow.
//there is so called tail recursion which deals with this problem, java
//    doesnt use this type of recursion


// recursiveFactorial(0) - pops of the stack
//    recursiveFactorial(1) - pops of the stack
//    recursiveFactorial(2) - pops of the stack
//    recursiveFactorial(3) - pops of the stack

    public Long recursiveFactorial(int num) {

        if (num == 0) {
            return (long) 1;
        }

        return num * recursiveFactorial(num - 1);

    }

    public static void main(String[] args) {

        NormalFactorial normalFactorial = new NormalFactorial();


        System.out.println(normalFactorial.iterativeFactorial(5));
        System.out.println(normalFactorial.recursiveFactorial(20));
    }
}
