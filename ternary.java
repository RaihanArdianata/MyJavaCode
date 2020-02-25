class ternary { 
	public static void main(String[] args){
		int nilai = 90;
		int skbm = 75;

		System.out.println( (nilai > skbm) ? "Nilai diatas rata - rata" : "Nilai dibawah rata - rata" );
	}
}

/*Operator Ternary
Kamu dapat menulis statemen if..else dengan lebih sederhana menggunakan operator ternary. Dengan operator ternary, Kamu dapat membuat sebuah kondisi hanya dengan satu baris saja.

(kondisi) ? //nilai bila kondisi true : //nilai bila kondisi false;
Sebagai contoh, statemen if..else berikut:

if(nilai > skbm) {
    status = "lulus";
} else {
    status = "tidak lulus";
}
dapat ditulis lebih sederhana menjadi:

status = (nilai > skbm) ? "lulus" : "tidak lulus";
Bila kondisi bernilai true, maka kode setelah tanda tanya (?) yang akan dikembalikan, dan bila kondisi bernilai false, kode setelah tanda titik dua (:) yang akan dikembalikan.

PRAKTEK
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan*/