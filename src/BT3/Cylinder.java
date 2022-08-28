package BT3;


public class Cylinder {
	private int banKinh;
	private int chieuCao;
	
	public Cylinder(int banKinh, int chieuCao) {
		super();
		this.banKinh = banKinh;
		this.chieuCao = chieuCao;
	}

	public Cylinder() {
		super();
	}

	public int getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(int banKinh) {
		this.banKinh = banKinh;
	}

	public int getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(int chieuCao) {
		this.chieuCao = chieuCao;
	}
	
	public float Tinhdtxq() {
		return ((float) Math.PI*2*banKinh*chieuCao);
	}
	
	public float Tinhdttp() {
		return ((float) Math.PI*2*banKinh+(banKinh + chieuCao));
	}
	
	public float TinhTheTich() {
		return ((float) Math.PI*banKinh*banKinh*chieuCao);
		
	}
	public String toString () {
		return String.format("|%10s|%10s|%10s|%10s|%10s|",banKinh, chieuCao,Tinhdtxq(), Tinhdttp(), TinhTheTich());
	}
}


