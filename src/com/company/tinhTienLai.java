package com.company;

import java.util.Scanner;

public class tinhTienLai {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so tien muon vay (VND)");
        int soTienVay = scanner.nextInt();
        System.out.println("nhap vao lai suat 1 thang (%)");
        double laiSuatThang = scanner.nextInt();
        System.out.println("nhap vao so thang muon vay (thang)");
        int soThangVay = scanner.nextInt();
        double tongTienlai = 0;
        for (int i = 0; i < soThangVay; i++) {
            tongTienlai += (tongTienlai + soTienVay) * laiSuatThang / 100;
        }
        System.out.printf("So tien lai thu duoc la: %.2f", tongTienlai);
    }
}
