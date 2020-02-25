class tipedata{
	public static void main(String[] args) {
		byte x =100;
		short y = 1000;
		int z = 10000000;
		double pi = 3.14;
		String pesan = "Test";
		char nilai = 'A';

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(pi);
		System.out.println(pesan);
		System.out.println(nilai);
	}
}

/*Tipe Data
Ada beberapa tipe data dasar yang wajib kamu ketahui bila ingin membuat sebuah 
aplikasi dengan bahasa pemrograman Java, diantaranya:

byte, diisi dengan angka bulat bukan bilangan koma dengan rentang -128 hingga 127
short, diisi dengan angka bulat bukan bilangan koma dengan rentang -32.767 hingga 32.767
int, diisi dengan angka bulat bukan bilangan koma dengan rentang -2.147.483.648 hingga 2.147.483.647
long, diisi dengan angka bulat bukan bilangan koma dengan rentang -9.223.372.036.854.775.808 hingga 9.223.372.036.854.775.807
float, diisi dengan bilangan koma dengan rentang 32-bit IEEE 754 floating point
double, diisi dengan bilangan koma dengan rentang 64-bit IEEE 754 floating point
boolean, diisi dengan true dan false saja. Selain itu akan error
String, diisi dengan rangkaian alfanumerik dan tanda baca yang diapit dengan tanda petik dua (")
char, diisi dengan alfanumerik yang diapit dengan tanda petik satu (')
Kamu dapat membuat sebuah variabel di dalam method yang tentu saja akan menjadi variabel lokal di dalam method tersebut. 
Atau menjadikannya atribut suatu kelas, namun harus menginstansiasi atau membuat objeknya dahulu bila ingin menggunakan 
variabel tersebut.

Setelah membuat variabel, kamu dapat melakukan berbagai operasi seperti operasi aritmatika dan menampilkannya ke konsol.

PRAKTEK
Jalankan kode di editor dan perhatikan outputnya.
Buat variabel baru dengan tipe data yang kamu suka dan isi dengan nilai. Lalu amati output yang dihasilkan.
Ganti nilai variabel z menjadi "10000000" (menggunakan kutip), lalu jalankan kode. Pesan error apa yang muncul pada output?
Ganti nilai variabel pesan menjadi 200, lalu jalankan kode. Pesan error apa yang muncul pada output?*/