package Cau2;

import java.util.Scanner;

// Phần 1:
//  Nhập vào mảng số nguyên arr gồm n phần tử
//  Thống kê tần suất: Đếm số lần xuất hiện của từng phần tử trong mảng
//  Ví dụ: [1, 2, 1, 3, 2] --> 1 xuất hiện 2 lần, 2 xuất hiện 2 lần, 3 xuất hiện 1 lần
//  Lưu ý: In ra kết quả sao cho mỗi số chỉ liệt kê 1 lần (Tránh in lặp lại)
public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m = 0;
        System.out.println("Nhap so luong phan tu mang: ");
        int[] arr = new int[n = sc.nextInt()];
        int[] arr2 = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.printf("Nhap phan tu thu %d trong mang: ", i + 1);
            arr[i] = sc.nextInt();
        }
        // tach phan tu khong trung lap
        arr2[m] = arr[0];
        m++;
        for (int i = 0; i < arr.length; i++){
            boolean isHas = false;
            for (int j = 0; j < arr.length; j++){
                if(arr2[j] == arr[i]){
                    isHas = true;
                }
            }
            if(!isHas){
                arr2[m] = arr[i];
                m++;
            }
        }
        // kiem tra
//        System.out.printf("mang arr 2 co %d phan tu:", m);
//        for (int i = 0; i < m; i++){
//            System.out.printf("%d ", arr2[i]);
//        }

        // den so lan lap
        for (int i = 0; i < m; i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if(arr2[i] == arr[j]){
                    count++;
                }
            }
            System.out.println("So " + arr2[i] + " Xuat hien: " + count + " lan");
        }
    }
}
