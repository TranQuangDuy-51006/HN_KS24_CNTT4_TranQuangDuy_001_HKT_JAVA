package Cau1;

import java.util.Scanner;
//  Phần 2:
//  Đếm tần suất xuất hiện của ký tự
//  Hãy nhập vào 1 chuỗi bất kỳ và in ra số lần xuất hiện của mỗi ký tự trong chuỗi đó (Lưu ý phân biệt chữ hoa chữ thường)
public class Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str == ""){
            System.out.println("Khong nhap noi dung");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean countCheck = false;
            for (int j = 0; j < i; j++) {
                if(str.charAt(j) == c){
                    countCheck = true;
                    break;
                }
            }
            if(!countCheck){
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(j) == c){
                        count ++;
                    }

                }
                System.out.println(c + " : " + count );
            }

        }

        System.out.println();

    }
}
