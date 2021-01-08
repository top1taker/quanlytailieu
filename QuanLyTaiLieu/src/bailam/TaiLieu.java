package bailam;

import java.util.List;

public abstract class TaiLieu {
	private String GUID;
	private String ten;
	private String ngayTao;
	private double dungLuong;
	private TaiLieu taiLieuBao;
	private String duongDan;
	
	public TaiLieu(String gUID, String ten, String ngayTao, double dungLuong) {
		super();
		GUID = gUID;
		this.ten = ten;
		this.ngayTao = ngayTao;
		this.dungLuong = dungLuong;
		this.duongDan = ten;
	}
	
	
	
	public String getDuongDan() {
		String taiLieuChaPath = "";
		if (taiLieuBao != null) taiLieuChaPath = taiLieuBao.getDuongDan();
		return taiLieuChaPath + "\\" + this.duongDan;
		
	}



	public void setDuongDan(String duongDan) {
		this.duongDan = duongDan;
	}



	public TaiLieu getTaiLieuBao() {
		return taiLieuBao;
	}



	public void setTaiLieuBao(TaiLieu taiLieuBao) {
		this.taiLieuBao = taiLieuBao;
	}



	public String getGUID() {
		return GUID;
	}

	public void setGUID(String gUID) {
		GUID = gUID;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(String ngayTao) {
		this.ngayTao = ngayTao;
	}

	public double getDungLuong() {
		return dungLuong;
	}

	public void setDungLuong(double dungLuong) {
		this.dungLuong = dungLuong;
	}
	
	public abstract List<TaiLieu> getAllFileTaiLieu();
	
	public abstract double getTongDungLuong();


	public abstract void addTaiLieuCon(TaiLieu taiLieuA);
	
	
	
}
