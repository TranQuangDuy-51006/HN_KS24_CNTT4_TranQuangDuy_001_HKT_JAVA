package Cau3;

import java.util.Scanner;
//Câu 3: Tư duy Thuật toán nâng cao
//Mảng con:
//Cho mảng A[] gồm N phần tử, mảng B gồm M phần tử. Nhiệm vụ của bạn là xác định xem B có phải là một mảng con (không cần liên tiếp nhưng cần giữ đúng thứ tự các phần tử) của mảng A hay không
//Ví dụ: Mảng A[] = {1, 1, 2, 8, 9, 3, 4}, B[] = {1, 2, 9, 4} là một mảng con của mảng A

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        System.out.println("Nhap so luong phan tu mang A: ");
        int[] A = new int[N = sc.nextInt()];
        System.out.println("Nhap so luong phan tu mang B: ");
        int[] B = new int[M = sc.nextInt()];

        for (int i = 0; i < A.length; i++){
            System.out.printf("Nhap phan tu thu %d trong mang A: ", i + 1);
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < B.length; i++){
            System.out.printf("Nhap phan tu thu %d trong mang B: ", i + 1);
            B[i] = sc.nextInt();
        }

        System.out.printf("Mang A: ");
        for (int i = 0; i < A.length; i++){
            System.out.printf("%d ", A[i]);
        }
        System.out.printf("\nMang B: ");
        for (int i = 0; i < B.length; i++){
            System.out.printf("%d ", B[i]);
        }
        // check B co phai mang con cua A khong
        int indexNow = 0;
        boolean isChild = true;
        for(int i = 0; i < B.length; i++){
            boolean check = false;
            for (int j = 0; j < A.length;j++){

                if(B[i]== A[j] && indexNow <= j){
                    check = true;
                    indexNow = j;
                    break;
                }
            }
            if(!check){
                isChild = false;
            }
        }
        if(isChild) {
            System.out.println("\nB la mang con cua A");
        }else {
            System.out.println("\nB khong phai la mang con cua A");
        }
    }
}
