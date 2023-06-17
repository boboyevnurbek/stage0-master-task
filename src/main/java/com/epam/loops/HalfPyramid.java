package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int i = 0; i < cathetusLength-row; i++) {
                System.out.print(' ');
            }
            for (int i = 0; i < row; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
