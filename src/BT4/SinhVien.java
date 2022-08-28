package BT4;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private float dlt;
	private float dth;
	public SinhVien() {
		// TODO Auto-generated constructor stub
		maSV = 0;
		hoTen = "";
		dlt = 0;
		dth = 0;
	}
	public SinhVien(int maSv, String hoTen, float dlt, float dth) {
		super();
		this.maSV = maSV < 0 ? 0 : maSV ;
		this.hoTen = (hoTen.compareTo("")==0  ? "@":hoTen);
		this.dlt = (dlt<0 || dlt>10)?0:dlt;
		this.dth = (dth<0 || dth>10)?0:dth;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV < 0 ? 0 : maSV ;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = (hoTen.compareTo("")==0  ? "@":hoTen);
	}
	public float getDlt() {
		return dlt;
	}
	public void setDlt(float dlt) {
		this.dlt = (dlt<0 || dlt>10)?0:dlt;
	}
	public float getDth() {
		return dth;
	}
	public void setDth(float dth) {
		this.dth = (dth<0 || dth>10)?0:dth;
	}
	
	public float getDtb() {
		return (dlt + dth)/2;
		}
	public String toString () {
		
		return String.format("|%-10s|%-20s|%10s|%10s|%10s",maSV,hoTen,dlt,dth , getDtb());
		
	}
}
