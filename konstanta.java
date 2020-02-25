class konstanta{

	static int radius;
	static final double pi = 3.14;

	public static void main(String[] args) {
		konstanta.pi = 3.14159;
		konstanta.radius = 7;
		double luas = (konstanta.radius*konstanta.radius*konstanta.pi);

		System.out.println(luas);
	}
}

/*
Konstanta pada pemrograman berfungsi mirip dengan variabel. Bedanya variabel dapat kita ubah isinya selama runtime,
sedangkan konstanta tidak.

Di Java sebenarnya tidak ada term konstanta. Namun kita dapat membuat variabel yang bersifat seperti konstanta dengan
menambahkan kata final pada deklarasi variabel sebelum menuliskan tipe data. Dan seperti konstanta umumnya, pada Java juga
kita dianjurkan untuk menuliskan final variabel dengan menggunakan nama variabel menggunakan huruf kapital.

static final float PI = 3,14;
PRAKTEK
Pada editor terdapat class Lingkaran dengan dua buah class variable radius dan PI. Jalankan kode dan lihat outputnya.
PI pada kode adalah class variable dengan kata kunci final yang berarti ia berlaku sebagai konstanta, sehingga tidak 
dapat diubah sepanjang runtime. Pada baris ke-7 terdapat snippet untuk mencoba mengubah nilai konstanta PI. Hapus garis 
miring ganda di awal baris tersebut, dan jalankan kembali kode. Pesan error apa yang muncul?*/