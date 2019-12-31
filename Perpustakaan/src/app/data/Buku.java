package app.data;

public class Buku{
	private String JudulBuku;
	private String ISBN;
	private String Penulis;
	private String Penerbit;
	private int JumlahHalaman;
	
	//Constrution Method
	public Buku (String judul, String isbn, String penulis, String penerbit, int hal){
		this.JudulBuku = judul;
		this.ISBN = isbn;
		this.Penulis = penulis;
		this.Penerbit = penerbit;
		this.JumlahHalaman = hal;
	}
	
	public void setJudulBuku (String JudulBuku){
		this.JudulBuku = JudulBuku;
	}
	public String getJudulBuku(){
		return JudulBuku;
	}

	public void setISBN (String ISBN){
		this.ISBN = ISBN;
	}
	public String getISBN(){
		return ISBN;
	}
	
	public void setPenulis (String Penulis){
		this.Penulis = Penulis;
	}
	public String getPenulis(){
		return Penulis;
	}
	
	public void setPenerbit (String Penerbit){
		this.Penerbit = Penerbit;
	}
	public String getPenerbit(){
		return Penerbit;
	}
	
	public void setJumlahHalaman (int JumlahHalaman){
		this.JumlahHalaman = JumlahHalaman;
	}
	public int JumlahHalaman(){
		return JumlahHalaman;
	}
}

