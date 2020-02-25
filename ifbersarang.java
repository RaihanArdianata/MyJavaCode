 class ifbersarang { 
	public static void main(String[] args){
		int nilai = 80;
		int skbm = 75;

		if (nilai > skbm){
			System.out.println("Nilai diatas rata - rata");

			if (nilai < 90 )
			{
				System.out.println("Nilai yang kamu dapat adalah B...");
			}
			else
			{
				System.out.println("Nilai yang kamu dapat adalah A...");
			}
		}
		else {
			System.out.println("Nilai dibawah rata - rata");
		}
	}
}

/*Statemen If Bersarang
Kita dapat mendeklarasikan statemen if di dalam statemen if lainnya untuk pengecekan bersarang.

Bila kondisi pertama terpenuhi, maka kondisi di dalamnya akan diperiksa dan bila kondisi di dalam kondisi pertama terpenuhi, maka kode akan dieksekusi.

if(kondisi a) {
  if(kondisi b) {
    // jalankan kode
  }
}
PRAKTEK
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Coba ganti nilai untuk variabel nilai dan jalankan kembali kode untuk melihat hasilnya.*/