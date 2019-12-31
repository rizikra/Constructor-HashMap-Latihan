package app;
import app.data.Buku;

import java.util.HashMap;
public class Program{
	
	public static void main (String[] args){
		//Buku buku1 = new Buku ("Sebelas Patriot", "2000-01-01", "Andrea Hirata", "Gramedia", 100)
		HashMap <String, Buku> LemariBuku = new HashMap<String, Buku>();
		LemariBuku.put ("2000-01-01", new Buku ("Sebelas Patriot", "2000-01-00", "Andrea Hirata", "Gramedia", 100));
		LemariBuku.put ("2000-01-02", new Buku ("Duabelas Patriot", "2000-01-01", "Andrea Hirata", "Gramedia", 200));
		
		//FOREACH data buku dari lemari buku berdasarkan key
		int no = 1;
		for (String key : LemariBuku.keySet()){
			
			//Get data buku satu per satu masukkan ke variabel
			String judul = LemariBuku.get(key).getJudulBuku();
			String isbn = LemariBuku.get(key).getISBN();
			String penulis = LemariBuku.get(key).getPenulis();
			
			//print variabel
			System.out.println("No      : "+ no++);
			System.out.println("Judul   : "+ judul);
			System.out.println("ISBN    : "+ isbn);
			System.out.println("Penulis : "+ penulis);
			System.out.println();
		}
	}
}