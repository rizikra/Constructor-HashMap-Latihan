package app;
import app.data.Buku;
import app.data.DataMember;

import java.util.HashMap;
public class Program{
	
	public static void main (String[] args){
		//Buku buku1 = new Buku ("Sebelas Patriot", "2000-01-01", "Andrea Hirata", "Gramedia", 100)
		HashMap <String, Buku> LemariBuku = new HashMap <String, Buku>();
		LemariBuku.put ("2000-01-01", new Buku ("Sebelas Patriot", "2000-01-01", "Andrea Hirata", "Gramedia", 100));
		LemariBuku.put ("2000-01-02", new Buku ("Duabelas Patriot", "2000-01-02", "Andrea Hirata", "Gramedia", 200));
		
		//FOREACH data buku dari lemari buku berdasarkan key
		int No = 1;
		for (String key : LemariBuku.keySet()){
			
			//Get data buku satu per satu masukkan ke variabel
			String judul = LemariBuku.get(key).getJudulBuku();
			String isbn = LemariBuku.get(key).getISBN();
			String penulis = LemariBuku.get(key).getPenulis();
			
			//print variabel
			System.out.println("No      : "+ No++);
			System.out.println("Judul   : "+ judul);
			System.out.println("ISBN    : "+ isbn);
			System.out.println("Penulis : "+ penulis);
			System.out.println();
		}
		
		HashMap <String, DataMember> ListMember = new HashMap <String, DataMember>();
		ListMember.put ("1933-01", new DataMember ("1933-01", "I Made Wirawan", "01 Januari 2015", "Denpasar, Bali"));
		ListMember.put ("1933-02", new DataMember ("1933-02", "Nick Kuipers", "01 Januari 2018", "Deen Hag, Belanda"));
		ListMember.put ("1933-08", new DataMember ("1933-08", "Abdul Azis Luthfi", "01 Januari 2018", "Lembang, Bandung"));
		
		//FOREACH data member dari list member berdasarkan key
		int no = 1;
		for (String Key : ListMember.keySet()){
			
			//Get data member satu per satu masukkan ke variabel
			String id = ListMember.get(Key).getID();
			String nama = ListMember.get(Key).getNama();
			String TglJoin = ListMember.get(Key).getTglJoin();
			String alamat = ListMember.get(Key).getAlamat();
			
			//print variabel
			System.out.println("No       : "+ no++);
			System.out.println("No. ID   : "+ id);
			System.out.println("Nama     : "+ nama);
			System.out.println("Tgl Join : "+ TglJoin);
			System.out.println("Alamat   : "+ alamat);
			System.out.println();
		}
	}
}