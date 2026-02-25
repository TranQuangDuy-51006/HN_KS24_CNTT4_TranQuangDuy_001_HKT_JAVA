package Cau2;

//  Tìm phần tử lặp lại (Find Duplicate)
//  Hãy nhập vào số phần tử và nhập vào mảng, các số nằm trong khoảng [1, n]. Có duy nhất một số bị lặp lại, hãy tìm số đó

import java.util.Scanner;

public class Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong phan tu mang: ");
        int[] arr = new int[n = sc.nextInt()];
        for (int i = 0; i < arr.length; i++){
            System.out.printf("Nhap phan tu thu %d trong mang: ", i + 1);
            arr[i] = sc.nextInt();
        }

        //tim va in ra phan tu lap
        for (int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length;j++){
                if(arr[i] == arr[j] && i > j){
                    System.out.printf("Phan tu lap la: %d", arr[i]);
                    return;
                }
            }
        }
    }
}
