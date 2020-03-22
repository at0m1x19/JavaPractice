/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int aDif = abs(a - 10);
        int bDif = abs(b - 10);

        if (bDif < aDif) {
            System.out.println(b);
        }
        else {
            if (aDif < bDif) {
                System.out.println(a);
            }
            else {
                System.out.println(a);
            }
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}