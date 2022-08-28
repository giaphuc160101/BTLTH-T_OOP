package BT4;


import java.util.Scanner;

public class TestSinhVien {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	SinhVien sv1 = new SinhVien(11111, "Trinh Gia Phuc", 8, 9);
	SinhVien sv2 = new SinhVien(22222, "Tran van Cao", 6, 5);
	SinhVien sv3 = new SinhVien();
	
	//nhap du lieu cua sv tu ban phim
	System.out.println("Nhap ma so cua sinh vien 3: ");
	int maSv = sc.nextInt();
	sc.nextLine();
	System.out.println("Nhap ho va ten cau sv3: ");
	String hoTen = sc.nextLine();
	System.out.println("Nhap diem ly thuyet cua sv3: ");
	float dlt = sc.nextFloat();
	System.out.println("Nhap diem thuc hanh cua sv3:");
	float dth = sc.nextFloat();
	
	//Goi cac phuong thuc de gan gia tri cho sv3
	sv3.setMaSV(maSv);
	sv3.setHoTen(hoTen);
	sv3.setDlt(dlt);
	sv3.setDth(dth);
	
	//in thong tin cua 3 doi tuong
	
	System.out.println(String.format("|%-10s|%-20s|%10s|%10s|%10s","maSv","hoTen","dlt","dth" ,"dtb"));
	
	System.out.println(sv1);
	System.out.println(sv2);
	System.out.println(sv3);
	
	sc.close();
}
}
