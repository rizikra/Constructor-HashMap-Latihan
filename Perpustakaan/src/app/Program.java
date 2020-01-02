package app;
import app.data.Buku;
import app.data.Member;
import app.transaction.Peminjaman;

import java.util.HashMap;
import java.util.Scanner;
public class Program{
	
	public static void main (String[] args){
		//Buku buku1 = new Buku ("Sebelas Patriot", "2000-01-01", "Andrea Hirata", "Gramedia", 100)
		HashMap <String, Buku> LemariBuku = new HashMap <String, Buku>();
		HashMap <String, Peminjaman> DaftarTransaksi = new HashMap <String, Peminjaman>();
		LemariBuku.put ("2000-01-01", new Buku ("Sebelas Patriot", "2000-01-01", "Andrea Hirata", "Gramedia", 100, 2011, 11));
		LemariBuku.put ("2000-01-02", new Buku ("Duabelas Patriot", "2000-01-02", "Andrea Hirata", "Gramedia", 200, 2012, 12));
		
		//FOREACH data buku dari lemari buku berdasarkan key
		int No = 1;
		for (String Key : LemariBuku.keySet()){
		
			//Get data buku satu per satu masukkan ke variabel
			String judul = LemariBuku.get(Key).getJudulBuku();
			String isbn = LemariBuku.get(Key).getISBN();
			String penulis = LemariBuku.get(Key).getPenulis();
			int stok = LemariBuku.get(Key).getStok();
			
			//print variabel
			System.out.println("DAFTAR BUKU");
			System.out.println("No      : "+ No++);
			System.out.println("Judul   : "+ judul);
			System.out.println("ISBN    : "+ isbn);
			System.out.println("Penulis : "+ penulis);
			System.out.println("Stock   : "+ stok);
			System.out.println();
		}
		
		HashMap <String, Member> ListMember = new HashMap <String, Member>();
		ListMember.put ("1933-01", new Member ("1933-01", "I Made Wirawan", "01 Januari 2015"));
		ListMember.put ("1933-02", new Member ("1933-02", "Nick Kuipers", "01 Januari 2018"));
		ListMember.put ("1933-08", new Member ("1933-08", "Abdul Azis Luthfi", "01 Januari 2018"));
		
		//FOREACH data member dari list member berdasarkan key
		int no = 1;
		for (String Key : ListMember.keySet()){
			
			//Get data member satu per satu masukkan ke variabel
			String id = ListMember.get(Key).getID();
			String nama = ListMember.get(Key).getNama();
			String TglJoin = ListMember.get(Key).getTglJoin();
			
			//print variabel
			System.out.println("DAFTAR MEMBER");
			System.out.println("No       : "+ no++);
			System.out.println("No. ID   : "+ id);
			System.out.println("Nama     : "+ nama);
			System.out.println("Tgl Join : "+ TglJoin);
			System.out.println();
		}
		Scanner input = new Scanner (System.in);
		
		Member member = ListMember.get ("1933-01");
		Peminjaman transaction = new Peminjaman(member);
		transaction.setKodeTransaksi();
		//System.out.println (transaction.getKodeTransaksi());
		
		boolean runPinjam = true;
		while (runPinjam){
			//input ISBN
			System.out.print("Masukkan ISBN Buku yang Ingin Dipinjam : ");
			String isbn = input.nextLine(); 
			//Cek buku dengan ISBN tersebut ada atau tidak
			if (LemariBuku.containsKey(isbn)){
				//transaksi ketika suatu buku dipinjam
				//Jika buku ditemukan, kurangi stok buku

				Buku borrowedBook = LemariBuku.get(isbn);
				borrowedBook.Dipinjam(); // method yang digunakan untuk MENGURANGI STOK BUKU
				//Masukkan buku ke list buku yang ada di transaksi
				transaction.addBook (isbn, borrowedBook);
					int nomor = 1;
				for (String Key : LemariBuku.keySet()){
			
					//Get data buku satu per satu masukkan ke variabel
					String judul = LemariBuku.get(Key).getJudulBuku();
					String ISBN = LemariBuku.get(Key).getISBN();
					String penulis = LemariBuku.get(Key).getPenulis();
					int stok = LemariBuku.get(Key).getStok();
			
					//print variabel
					System.out.println("DAFTAR BUKU");
					System.out.println("No      : "+ nomor++);
					System.out.println("Judul   : "+ judul);
					System.out.println("ISBN    : "+ isbn);
					System.out.println("Penulis : "+ penulis);
					System.out.println("Stock   : "+ stok);
					System.out.println();
				}	
			}
			else{
				//jika tidak ditemukan, tampilkan pesan buku tidak ada
				System.out.println("Buku Tidak Ada");
			}
			//transaksi buku dipinjam
			System.out.print("Apakah Masih Ingin Meminjam Buku yang Lain? [Y/N] : ");
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase("N")){
				runPinjam = false;
			}
		}
		if(transaction.getBooks().size() > 0){
			for(String i : transaction.getBooks().keySet()){
				String judul = LemariBuku.get(i).getJudulBuku();
				String isbn = LemariBuku.get(i).getISBN();
				String penulis = LemariBuku.get(i).getPenulis();
				//Print Variable
				System.out.println("DAFTAR BUKU");
				System.out.println("No      : "+ No++);
				System.out.println("Judul   : "+ judul);
				System.out.println("ISBN    : "+ isbn);
				System.out.println("Penulis : "+ penulis);
				System.out.println();
			}
			System.out.println("Apakah Data Di Atas Sudah Benar? Pilih Y untuk meminjam. [Y/N] : ");
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("Y")){
				//masukkan data transaksi ke list transaksi (HashMap)
				DaftarTransaksi.put(transaction.getKodeTransaksi(), transaction);
			}
			else{
				System.out.println("Transaksi Peminjaman Dibatalkan.");
			}
		}
		else{
			System.out.println("Buku Apa yang Ingin Anda Pinjam? Anda Belum Meminjam Buku Apapun");
		}
	}
}