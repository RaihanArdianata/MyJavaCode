class Logika {

	public static void main(String[] args){
		// definisi variabel
		int x = 10;
		int y = 15;

		// menggunakan operator relasional
		System.out.println( (x == y) || (x != y) ); // false || true
		System.out.println( (x > y) && (x < y) ); // false && true
		System.out.println( !(x >= y) ); // !false
	}
}
/*Operator Logika
Operator logika membandingkan dua pernyataan kondisi. Penggunaannya biasa digabungkan dengan operator relasional yang sudah dibahas sebelumnya. Fungsinya untuk membentuk paduan kondisi yang akan membuat sebuah aturan yang cukup kompleks.

Operator logika yang harus kamu ingat antara lain:

&& artinya dan, dimana kondisi bernilai benar atau true hanya jika kedua operand bernilai true. Bila salah satu atau kedua operand bernilai false, maka nilai kondisi menjadi false
|| artinya atau, dimana kondisi bernilai benar atau true jika salah satu dari kedua operand bernilai true. Bila kedua operand bernilai false, maka kondisi akan bernilai false
! artinya negaSI, dimana nilai variabel akan dibalik menjadi lawannya, misal !true berarti false dan !false berarti true
Bila kamu terbiasa dengan logika matematika, hal ini bukan hal yang sulit.

PRAKTEK
Silahkan eksekusi kode di sebelah kanan dan lihat output yang akan dihasilkan
Buatlah variabel dengan kasusmu sendiri dengan tipe data yang kamu suka dan coba tampilkan isi variabel yang berisi operator logika tersebut dengan menggunakan System.out.println()*/