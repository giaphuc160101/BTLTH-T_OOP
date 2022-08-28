package BT2;

public class TestPoint {
public static void main(String[] args) {
	Point p1 = new Point("A",1,2,3);
	System.out.println("");
	System.out.println("Toa Do diem A la: "+p1);
	System.out.println("Diem doi qua goc toa do la: " +p1.negate());
	System.out.println("Do dai la: " +p1.getDistance());
}
}
