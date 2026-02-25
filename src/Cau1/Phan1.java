package Cau1;

import java.util.Scanner;
// Phần 1:
// Nhập vào một chuỗi ký tự hỗn hợp (bao gồm chữ cái, số và ký tự đặc biệt) từ bàn phím. Ví dụ: "a1b2c d3ef 45 gh"
// Tách số và tính tổng: Trích xuất tất cả các ký tự số có trong chuỗi, coi các chuỗi số liên tiếp là một số nguyên, sau đó tính tổng chúng
// Ví dụ: "abc12mn4t5" --> Lấy ra 12, 4, 5 --> Tổng = 12 + 4 + 5 = 21
public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("Khong nhap noi dung");
            return;
        }

        int sum = 0;
        String number = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                number += c;
            } else {
                if (!number.isEmpty()) {
                    sum += Integer.parseInt(number);
                    number = "";
                }
            }
        }

        if (!number.isEmpty()) {
            sum += Integer.parseInt(number);
        }

        System.out.println(sum);
    }
}
