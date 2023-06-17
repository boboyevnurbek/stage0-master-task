package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int i = 0; i < cathetusLength-row; i++) {
                System.out.print(' ');
            }
            for (int i = row; i >= 1 ; i--) {
                System.out.print(i);
            }
            for (int i = 2; i <= row ; i++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
