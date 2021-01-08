package bailam;

import java.util.ArrayList;
import java.util.List;

public class FileTaiLieu extends TaiLieu{

	public FileTaiLieu(String gUID, String ten, String ngayTao, double dungLuong) {
		super(gUID, ten, ngayTao, dungLuong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<TaiLieu> getAllFileTaiLieu() {
		List<TaiLieu> tam = new ArrayList<TaiLieu>();
		tam.add(this);
		// TODO Auto-generated method stub
		return tam;
	}

	@Override
	public double getTongDungLuong() {
		// TODO Auto-generated method stub
		return this.getDungLuong();
	}

	@Override
	public void addTaiLieuCon(TaiLieu taiLieuA) {
		// TODO Auto-generated method stub
		
	}

}
