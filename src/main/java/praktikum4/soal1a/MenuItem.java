//MenuItem.java
package praktikum4.soal1a;

public class MenuItem {
	//Deklarasikan atribut di sini
	
	
	//Tulis konstruktor tanpa parameter di sini, nilai default objek MenuItem adalah: Nasi Goreng Seafood dengan harga 25000 dan jumlah 1 porsi.
	
	
	//Tulis konstruktor tanpa parameter di sini
	
	
	//setter
	public void setJenisPesanan(String jenisPesanan){
		this.jenisPesanan = jenisPesanan;
	}
	public void setNamaPesanan(String namaPesanan){
		this.namaPesanan = namaPesanan;
	}
	public void setHarga(int harga){
		this.harga= harga;
	}
	public void setJmlPesanan(int jmlPesanan){
		this.jmlPesanan= jmlPesanan;
	}
	//getter
	public String getJenisPesanan( ){
		return jenisPesanan;
	}
	public String getNamaPesanan(){
		return namaPesanan;
	}
	public int getHarga(){
		return harga;
	}
	public int getJmlPesanan(){
		return jmlPesanan;
	}
	public static int getNbInstance(){
		return nbInstance;
	}
	
	//tulis method buat pesanan di sini, yang akan mengubah state objek MenuItem berdasarkan isi dari varibel parameter
	
	
	//tulis method toString, lihat contoh keluaran yang diberikan pada deskripsi praktikum
	
	
	//method ini tidak boleh dihapus atau diubah
	public boolean equals(Object obj){
		MenuItem mi2 = (MenuItem) obj;
		return (getJenisPesanan().equals(mi2.getJenisPesanan()) && getNamaPesanan().equals(mi2.getNamaPesanan()) && getHarga() == mi2.getHarga() && getJmlPesanan()==mi2.getJmlPesanan());
	}
}

