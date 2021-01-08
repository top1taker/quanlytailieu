package bailam;

import java.util.ArrayList;
import java.util.List;

public class NhomTaiLieu extends TaiLieu{
	private List<TaiLieu> listTaiLieuCon;
	public NhomTaiLieu(String gUID, String ten, String ngayTao, double dungLuong) {
		super(gUID, ten, ngayTao, dungLuong);
		// TODO Auto-generated constructor stub
		listTaiLieuCon = new ArrayList<TaiLieu>();
	}
	
	
	
	
	@Override
	public List<TaiLieu> getAllFileTaiLieu() {
		List<TaiLieu> listFile = new ArrayList<TaiLieu>();
		
		for (TaiLieu taiLieu : listTaiLieuCon) {
			if (taiLieu instanceof FileTaiLieu) {
				listFile.add(taiLieu);
			} else if (taiLieu instanceof NhomTaiLieu) {
				listFile.addAll(taiLieu.getAllFileTaiLieu());
			}
		}
		
		return listFile;
	}
	
	private double getTongDungLuongTaiLieuCon() {
		double tong = 0;
			for (TaiLieu taiLieu : listTaiLieuCon) {
				if (taiLieu instanceof FileTaiLieu) {
					tong += taiLieu.getDungLuong();
				} else if (taiLieu instanceof NhomTaiLieu) {
					tong += taiLieu.getTongDungLuong();
				}
			}
		return tong;
	}

	@Override
	public double getTongDungLuong() {
		return this.getDungLuong() + this.getTongDungLuongTaiLieuCon();
	}
	
	

	@Override
	public void addTaiLieuCon(TaiLieu taiLieu) {
		if (listTaiLieuCon == null) listTaiLieuCon = new ArrayList<TaiLieu>();
		taiLieu.setTaiLieuBao(this);
		listTaiLieuCon.add(taiLieu);
	}
}
