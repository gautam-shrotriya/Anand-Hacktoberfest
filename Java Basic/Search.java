package com.company;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        helperMethod();
    }

    static void helperMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int n;
        if(scanner.hasNextInt()) {
            n = scanner.nextInt();
            if(n < 1) {
                System.out.println("NO. OF ELEMENTS CANNOT BE LESS THAN 1");
                return;
            }
        } else {
            System.out.println("INVALID ARGUMENT");
            return;
        }

        int[] arr = new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY:-");
        for (int i=0; i<n; i++) {
            if(!Insert(arr, i))
                return;
        }

        System.out.println("---BINARY SEARCH---");
        System.out.print("\nEnter the target element: ");
        int target;
        if(scanner.hasNextInt()) {
            target = scanner.nextInt();
        } else {
            System.out.println("INVALID TARGET");
            return;
        }

        LinearSearch(arr, target);
    }

    static boolean Insert(int[] arr, int i) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            arr[i] = scanner.nextInt();
            return true;
        } else {
            System.out.println("INVALID VALUE");
            return false;
        }
    }

    static void LinearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }

        System.out.println("ELEMENT NOT FOUND");
    }
}
