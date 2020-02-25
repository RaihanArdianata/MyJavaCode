import java.util.Scanner;
class menuminum
{
	public static void main(String[] args) 
	{
		String ulang = "y";
		while (ulang.equals("y")) 
		{
			System.out.println(" ");
			Scanner input = new Scanner(System.in);

			System.out.println("++++++++++++++++++++");
			System.out.println("|    1.Jus Cabe    |");
			System.out.println("|    2.Jus Tomcat  |");
			System.out.println("|    3.Jus Jusan   |");
			System.out.println("|    4.Keluar      |");
			System.out.println("++++++++++++++++++++");
			int menu;

			Scanner scan = new Scanner(System.in);

			System.out.print("Masukkan Pilihan Minuman : ");
			menu = scan.nextInt();

			while((menu>4)||(menu<=0))
			{
				System.out.println("++++++++++++++++++");
				System.out.println("|  Masukan Salah |");
				System.out.println("++++++++++++++++++");
				System.out.println("");
				System.out.println("++++++++++++++++++++");
				System.out.println("|    1.Jus Cabe    |");
				System.out.println("|    2.Jus Tomcat  |");
				System.out.println("|    3.Jus Jusan   |");
				System.out.println("|    4.Keluar      |");
				System.out.println("++++++++++++++++++++");
				Scanner scum = new Scanner(System.in);
				System.out.print("Masukkan Pilihan Minuman : ");
				menu = scum.nextInt();
			}

			switch(menu)
			{
				case 1:{
					System.out.println("++++++++++++++++++++++++++++");
					System.out.println("|   pilihan anda Jus Cabe  |");
					System.out.println("++++++++++++++++++++++++++++");
					break;
					}
				case 2:{
					System.out.println("++++++++++++++++++++++++++++");
					System.out.println("|    pilihan anda Tomcat   |");
					System.out.println("++++++++++++++++++++++++++++");
					break;
					}
				case 3:{
					System.out.println("++++++++++++++++++++++++++++");
					System.out.println("|   pilihan anda Jus Jusan |");
					System.out.println("++++++++++++++++++++++++++++");
					break;
					}
				case 4:{
					System.exit(0);
				}
			}
				
			
			String ul;
			System.out.println("Pesan Lagi?(y/t)");
			ul=input.next();
			ulang=ul.toLowerCase();
			while(!(ulang.equals("y")||(ulang.equals("t")))){
				System.out.println("Pesan Lagi?(y/t)");
				ul=input.next();
				ulang=ul.toLowerCase();
				if(ulang.equals("t")){
					System.out.println("Terima Kasih");
				}
			}

			/*do{
			System.out.println("Pesan Lagi?(y/t)");
			ul=input.next();
			ulang=ul.toLowerCase();
			}

			while(!(ulang.equals("y")));//

			if (ulang.equals("t")) {
				System.out.println("ty");
			}
			else{
				System.out.println("Kode Salah");
				System.out.println("Pesan Lagi?(y/t)");
				ul=input.next();
				ulang=ul.toLowerCase();
			}///*/
		}
	}
}