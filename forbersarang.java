class forbersarang {
	public static void main (String[] args) {
    
    	// for pertama untuk membuat baris
		for (int i = 0; i < 10; i++) {
			
			System.out.print(i + " => ");
			
            // for kedua untuk mencetak angka di setiap baris
			for (int j = 0; j < 10; j++) {
				System.out.print(j + " ");
			}

			System.out.println();

		}
	}
}

/*Statemen For Bersarang
Perulangan biasanya diperlukan lebih dari satu tingkat. Misal untuk mencacah isi matriks berdimensi dua, kita memerlukan dua buah pengulangan untuk mengakses satu per satu elemen matriks. Perulangan bersarang atau nested loop dapat dilakukan di Java. Kamu cukup menaruh perulangan lain yang kamu perlukan di dalam pengulangan yang dipilih.

PRAKTEK
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Dapatkah Kamu membuat kode perulangan menggunakan for bersarang, sehingga outputnya menjadi seperti ini?
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
 Show Solution
*/