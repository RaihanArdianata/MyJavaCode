import java.util.Scanner;
class kasir{
	public static void main(String[] args) 
	{
		
		int uangmu;
		int bayar;
		String co;
		int banyak;
		int byk;
		int nominal;
		Scanner scan= new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Scanner scbyk = new Scanner(System.in);


		/*for( int i = 0; i < uang.length; i++ )
		{
        System.out.print("Masukkan Uang Anda : ");
        uang[i] = scan.nextInt();
        }*/
        System.out.print("  Masukan Uang Anda: ");
        uangmu=scan.nextInt();
        String ulang ="y";
       	while (ulang.equals("y"))
       	{
			if(uangmu>0)
			{
				int menu;
	       		System.out.println("+++++++++++++++++++++++++++++");
		       	System.out.println("    Uang Anda:" +uangmu     );
		       	System.out.println("+++++++++++++++++++++++++++++");
		       	System.out.println("+++++++++++++++++++++++++++++");
				System.out.println("|        Menu Makanan       |");
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println("");
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println("|    1.Nasi Goreng  25.000  |");
				System.out.println("|    2.Mi Goreng    20.000  |");
				System.out.println("|    3.Mi Rebus     20.000  |");
				System.out.println("|    4.Cek Saldo            |");
				System.out.println("|    5.Tambah Saldo         |");
				System.out.println("|    6.Keluar               |");
				System.out.println("+++++++++++++++++++++++++++++");
				Scanner scum = new Scanner(System.in);
				System.out.print("Masukkan Pilihan Makanan : ");
				menu = scum.nextInt();
				while((menu>6)||(menu<=0))
				{
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println("|       Masukan Salah       |");
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println("");
	       		System.out.println("+++++++++++++++++++++++++++++");
		       	System.out.println("      Uang Anda:" +uangmu     );
		       	System.out.println("+++++++++++++++++++++++++++++");
		       	System.out.println("+++++++++++++++++++++++++++++");
				System.out.println("|        Menu Makanan       |");
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println("");
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println("|    1.Nasi Goreng  25.000  |");
				System.out.println("|    2.Mi Goreng    20.000  |");
				System.out.println("|    3.Mi Rebus     20.000  |");
				System.out.println("|    4.Cek Saldo            |");
				System.out.println("|    5.Tambah Saldo         |");
				System.out.println("|    6.Keluar               |");
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.print("Masukkan Pilihan Makanan : ");
				menu = scum.nextInt();
				}
				switch (menu) 
			    {
			   		case 1:
			   		{
			   			System.out.println("+++++++++++++++++++++++");
				     	System.out.println("|     Nasi Goreng     |");
				     	System.out.println("+++++++++++++++++++++++");
				     	System.out.println("Berapa Banyak :");
				     	byk = scbyk.nextInt();
				     	banyak = 25000*byk;


			    		if(uangmu<25000)
			    		{
			    			System.out.println("+++++++++++++++++++++++++++");
			    			System.out.println("   Uang Anda Tidak Cukup   ");
			    			System.out.println("+++++++++++++++++++++++++++");
			    			System.out.println("Jumlah yang Harus Dibayar :"+banyak);
						    System.out.println("++++++++++++++++++++++++++++++");
					        System.out.println("|   Isi Ulang Kembali?(y/t)  |");
					        System.out.println("++++++++++++++++++++++++++++++");
					        co=input.next();
					        if(co.equals("y")){
					        	System.out.println("Isi Ulang Saldo");
					        	uangmu=uangmu+scan.nextInt();
					        }
					        else if(co.equals("t")){
					        	System.exit(0);
					        }
			    		}
			    		else{
			    			System.out.println("Jumlah yang Harus Dibayar :"+banyak);
			    			System.out.println("Sisa Uang Kamu : "+(uangmu=uangmu-banyak));
			    		}

			     		break;
			     	}
			     	case 2:
			     	{
			     		System.out.println("++++++++++++++++++++");
			     		System.out.println("|     Mi Goreng    |");
			     		System.out.println("++++++++++++++++++++");
			     		System.out.println("Berapa Banyak :");
				     	byk = scbyk.nextInt();
				     	banyak = 25000*byk;
			     
			      		if(uangmu<banyak)
			    		{
			    			System.out.println("+++++++++++++++++++++++++++");
			    			System.out.println("   Uang Anda Tidak Cukup   ");
			    			System.out.println("+++++++++++++++++++++++++++");
			    			System.out.println("Jumlah yang Harus Dibayar :"+banyak);
						    System.out.println("++++++++++++++++++++++++++++++");
					        System.out.println("|   Isi Ulang Kembali?(y/t)  |");
					        System.out.println("++++++++++++++++++++++++++++++");
					        co=input.next();
					        if(co.equals("y")){
					        	System.out.println("Isi Ulang Saldo");
					        	uangmu=uangmu+scan.nextInt();
					        }
					        else if(co.equals("t"))
					        {
					        	System.exit(0);
					        }
			    		}
			    		else{
			    			System.out.println("Jumlah yang Harus Dibayar :"+banyak);
			    			System.out.println("Sisa Uang Kamu : "+(uangmu=uangmu-banyak));
			    		}
			     		break;
			     	}
			     	case 3:
			     	{
			     		System.out.println("++++++++++++++++++++++");
			     		System.out.println("|       Mi Rebus     |");
			     		System.out.println("++++++++++++++++++++++");
			     		System.out.println("Berapa Banyak :");
				     	byk = scbyk.nextInt();
				     	banyak = 25000*byk;
			      		
			      		if(uangmu<banyak)
			    		{
			    			System.out.println("+++++++++++++++++++++++++++");
			    			System.out.println("   Uang Anda Tidak Cukup   ");
			    			System.out.println("+++++++++++++++++++++++++++");
			    			System.out.println("Jumlah yang Harus Dibayar :"+banyak);			    			
						    System.out.println("++++++++++++++++++++++++++++++");
					        System.out.println("|   Isi Ulang Kembali?(y/t)  |");
					        System.out.println("++++++++++++++++++++++++++++++");
					        co=input.next();
					        if(co.equals("y"))
					        {
					        	System.out.println("Isi Ulang Saldo");
					        	uangmu=uangmu+scan.nextInt();
					        }
					        else if(co.equals("t"))
					        {
					        	System.exit(0);
					        }
			    		}
			    		else{
			    			System.out.println("Jumlah yang Harus Dibayar :"+banyak);
			    			System.out.println("Sisa Uang Kamu : "+(uangmu=uangmu-banyak));
			    		}
			     		break;
			     	}
			     	case 4:
			     	{
			     		System.out.println("Saldo Anda Sebesar : "+uangmu);
			     		break;

			     	}
			     	case 5:
			     	{
			     		System.out.println("Masukkan Nominal");
			     		nominal=scan.nextInt();
			     		System.out.println("Nominal yang anda tambahkan sebesar : "+nominal);
			     		uangmu=uangmu+nominal;
			     		System.out.println("Uang Anda Sekarang: "+uangmu);
			     		break;
			     	}
			     	case 6:
			     	{
			     		System.exit(0);
			     	}
			    }
			}
			else if(uangmu<=0){
				System.out.println("++++++++++++++++++++++++++++++");
				System.out.println("      Uang Kamu "+uangmu);
				System.out.println("++++++++++++++++++++++++++++++");
				System.out.println("");
				System.out.print("    Isi Ulang Kembali :");
		        uangmu=scan.nextInt();
		        String ul;
			    System.out.println("+++++++++++++++++++++++");
		        System.out.println("|   Pesan Lagi?(y/t)  |");
		        System.out.println("+++++++++++++++++++++++");
		        ul=input.next();
		        ulang=ul.toLowerCase();
			}

		    /*while(uangmu<0)
			{
				System.out.print("Masukan Uang Anda Kembali :");
		        uangmu=scan.nextInt();

			}*/

		    String ul;
		    System.out.println("+++++++++++++++++++++++");
	        System.out.println("|   Kemenu Utama(y/t)  |");
	        System.out.println("+++++++++++++++++++++++");
	        ul=input.next();
	        ulang=ul.toLowerCase();
			if(ulang.equals("t"))
			{
				System.out.println("Terima Kasih");
				System.exit(0);
			}
			while(!(ulang.equals("y")||(ulang.equals("t"))))
			{
				System.out.println("Pesan Lagi?(y/t)");
				ul=input.next();
				ulang=ul.toLowerCase();
			}
		}

        /*while(uangmu>0)
        {

        }*/
	}
}