package bailam;

import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		TaiLieu taiLieuA = new FileTaiLieu("tlA", "tailieuA", "2021-01-01", 1);
		TaiLieu taiLieuB = new FileTaiLieu("tlB", "tailieuB", "2021-01-02", 2);
		TaiLieu taiLieuC = new FileTaiLieu("tlC", "tailieuC", "2021-01-03", 3);
		TaiLieu taiLieuD = new FileTaiLieu("tlD", "tailieuD", "2021-01-04", 4);
		
		TaiLieu nhomTaiLieu1 = new NhomTaiLieu("ntl1", "nhomtl1", "2021-01-11", 10);
		nhomTaiLieu1.addTaiLieuCon(taiLieuA);
		nhomTaiLieu1.addTaiLieuCon(taiLieuB);
		
		
		TaiLieu nhomTaiLieu2 = new NhomTaiLieu("ntl2", "nhomtl2", "2021-01-12", 20);
		
		nhomTaiLieu2.addTaiLieuCon(taiLieuC);
		nhomTaiLieu2.addTaiLieuCon(taiLieuD);
		nhomTaiLieu2.addTaiLieuCon(nhomTaiLieu1);
		
		
		showAllFileTaiLieuOf(nhomTaiLieu1);
		showTongDungLuongOf(nhomTaiLieu1);
		
		showAllFileTaiLieuOf(nhomTaiLieu2);
		showTongDungLuongOf(nhomTaiLieu2);
	}
	
	public static void showTongDungLuongOf(TaiLieu taiLieu) {
		System.out.println("\nTổng dung lượng của " + taiLieu.getTen() + ": " + taiLieu.getTongDungLuong() + "KB");
	}
	
	public static void showAllFileTaiLieuOf(TaiLieu taiLieu) {
		System.out.println("\nTất cả file trong " + taiLieu.getTen() +": ");
		List<TaiLieu> listFile = taiLieu.getAllFileTaiLieu();
		
		for (TaiLieu tl : listFile) {
			System.out.println(tl.getGUID() + " " + tl.getTen() + " " + tl.getNgayTao() + " " + tl.getDungLuong() + "KB " + tl.getDuongDan());
		}
	}
	
	
	
}
