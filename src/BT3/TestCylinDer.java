package BT3;

import java.util.Scanner;

public class TestCylinDer {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Cylinder Cd = new Cylinder();
	System.out.println("Nhap vao ban kinh: ");
	int banKinh = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Nhap vao chieu cao: ");
	int chieuCao = sc.nextInt();
	sc.nextLine();
	
	Cd.setBanKinh(banKinh);
	Cd.setChieuCao(chieuCao);
	
	System.out.println(String.format("|%10s|%10s|%10s|%10s|%10s|","ban kinh", "chieu cao", "dtxq", "dttp", "the tich"));
	
	System.out.println(Cd);
}
}
