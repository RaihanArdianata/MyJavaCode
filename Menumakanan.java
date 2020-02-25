import java.util.Scanner;
class Menumakanan
{
	public static void main(String[] args) 
	{
		int pilihan;
		System.out.println("1.mau pesan");
		System.out.println("2.keluar");

		Scanner makan = new Scanner(System.in);

		System.out.print("Masukkan Data : ");
		pilihan = makan.nextInt();

		while(pilihan == 1)
		{
			System.out.println("++++++++++++++++++++");
			System.out.println("|    1.Jus Cabe    |");
			System.out.println("|    2.Jus Tomcat  |");
			System.out.println("|    3.Jus Jusan   |");
			System.out.println("++++++++++++++++++++");

			int menu;

			Scanner scan = new Scanner(System.in);

			System.out.print("Masukkan Pilihan Minuman : ");
			menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("Pesanan Anda Adalah Jus Cabe");
			}
			else if(menu == 2){
				System.out.println("Pesanan Anda Adalah Jus Tomcat");
			}
			else if(menu == 3){
				System.out.println("Pesanan Anda Adalah Jus Jusan");
			}
			else{
			System.out.println("Pilihan Anda Tidak Ada");
			}
			pilihan--;
		}
	}
}