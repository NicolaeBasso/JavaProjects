package Sortings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sortings {
    // enter the number of elements n and the numbers themselves after
    // then call the sorting fuction

    public void QuickSort() throws Exception{
        File file = new File("D:\\!Works\\Java\\_JavaProjects_GitHub\\Train\\src\\com\\base\\input");
        Scanner in = new Scanner(file);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        QuickSort_PivotHigh ob = new QuickSort_PivotHigh();
        ob.sort(arr, 0, n-1);

        ob.printArray(arr);
        System.out.println("sorted array");
    }

    public void MergeSort() throws Exception{
        File file = new File("D:\\!Works\\Java\\_JavaProjects_GitHub\\Train\\src\\com\\base\\input");
        Scanner in = new Scanner(file);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        MergeSort_TopDown ob = new MergeSort_TopDown();
        ob.mergeSort(arr, 0, n-1);

        ob.printArray(arr);
        System.out.println("sorted array");
    }
}