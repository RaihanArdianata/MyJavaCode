import java.util.Scanner;
class sederhana
{
	public static void main(String[] args) 
	{

		int menu;
		int mkn;
		int saldo;
		int nominal;
		int pesan;
        int banyak;
        int byk;
        int saldo1;
        String lagi2="t";
        String lagi;
        String pilih2 = "y";
        String pilih ;
        int scc=1;
        Scanner lgi=new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner cdbyk = new Scanner(System.in);

		System.out.print("Masukkan Saldo Anda : ");
		Scanner sld = new Scanner(System.in);
		saldo = sld.nextInt();
		while((saldo > 0)||(scc>=1))
		{
			System.out.println("");
			System.out.println("       Pesan Mudah Bayar Susah          ");
			System.out.println("");
			System.out.println("Saldo : "+saldo);
			System.out.println("++++++++++++++++++++++++++++++++++++++++");
			System.out.println("|       1.Pesan Makanan/Minuman        |");
			System.out.println("|       2.Cek Saldo                    |");
			System.out.println("|       3.Tambah Saldo                 |");
			System.out.println("|       4.Keluar                       |");
			System.out.println("++++++++++++++++++++++++++++++++++++++++");
			Scanner scum = new Scanner(System.in);
			System.out.print("Masukkan Pilihanmu : ");
			menu = scum.nextInt();

			while(menu <= 4)
			{
				switch(menu)
				{
					case 1:
					{
						System.out.println("");
						System.out.println("++++++++++++++++++++++++++++++");
						System.out.println("|         Menu Pesanan       |");
						System.out.println("++++++++++++++++++++++++++++++");
						System.out.println("|    1.Jus Jeruk     4.000   |");
						System.out.println("|    2.Es Teh Anget  3.500   |");
						System.out.println("|    3.Jus Alpukat   5.000   |");
						System.out.println("|    4.Nasi Goreng   15.000  |");
						System.out.println("|    5.Mi Rebus      10.000  |");
						System.out.println("|    6.Mi Goreng     10.000  |");
						System.out.println("|    7.Menu Utama            |");
						System.out.println("|    8.Keluar                |");
						System.out.println("++++++++++++++++++++++++++++++");
						Scanner mm= new Scanner(System.in);
						System.out.print("Masukkan Pesanmu : ");
						pesan = mm.nextInt();

						switch(pesan)
						{
							
							case 1:
							{
								System.out.println("Jus Jeruk");
								System.out.print("Berapa Banyak :");
				     			byk = cdbyk.nextInt();
				     			banyak = 4000*byk;
				     			System.out.print("Anda Memesan : "+byk+"  Jus Jeruk Seharga  "+banyak+" y/t ");
				     			pilih = input.next();
				     			if(pilih.equals(pilih2))
				     			{
				     				
				     				if(saldo<banyak)
				     				{
				     					System.out.println("Saldo Anda Tidak Cukup");
				     					System.out.println("Silahkan Isi Ulang saldo ");
				     					menu=5;
				     				}
				     				else
				     				{
				     					saldo=saldo-banyak;
					     				System.out.println("Sisa Saldo Sebesar : "+saldo);
					     				System.out.println("Pesan Lagi: (y/t)");
					     				lagi = lgi.next();
					     				if (lagi.equals("y"))
					     				{
					     					menu = 1;
					     				}
					     				else if(lagi.equals(lagi2))
					     				{
					     					menu=5;
					     				}
				     				}
				     			}
				     			else if(pilih.equals("t"))
				     			{
				     				menu=5;
				     			}
				     			while(!(pilih.equals("y")||(pilih.equals("t"))))
				     			{
				     				System.out.print("Anda Memesan : "+byk+"  Jus Jeruk Seharga  "+banyak+" y/t ");
				     				pilih = input.next();
				     			}
				     			break;
							}
							case 2:
							{
								System.out.println("Es Teh Anget");
								System.out.print("Berapa Banyak :");
				     			byk = cdbyk.nextInt();
				     			banyak = 3500*byk;
				     			System.out.print("Anda Memesan : "+byk+"  Es Teh Anget Seharga  "+banyak+" y/t ");
				     			pilih = input.next();
				     			if(pilih.equals(pilih2))
				     			{
				     				
				     				if(saldo<banyak)
				     				{
				     					System.out.println("Saldo Anda Tidak Cukup");
				     					System.out.println("Silahkan Isi Ulang saldo ");
				     					menu=5;
				     				}
				     				else
				     				{
				     					saldo=saldo-banyak;
					     				System.out.println("Sisa Saldo Sebesar : "+saldo);
					     				System.out.println("Pesan Lagi: (y/t)");
					     				lagi = lgi.next();
					     				if (lagi.equals("y"))
					     				{
					     					menu = 1;
					     				}
					     				else if(lagi.equals(lagi2))
					     				{
					     					menu=5;
					     				}
				     				}
				     			}
				     			else if(pilih.equals("t"))
				     			{
				     				menu=5;
				     			}
				     			while(!(pilih.equals("y")||(pilih.equals("t"))))
				     			{
				     				System.out.print("Anda Memesan : "+byk+"  Es Teh Anget Seharga  "+banyak+" y/t ");
				     				pilih = input.next();
				     			}
				     			break;
							}
							case 3:
							{
								System.out.println("Jus Alpukat");
								System.out.print("Berapa Banyak :");
				     			byk = cdbyk.nextInt();
				     			banyak = 15000*byk;
				     			System.out.print("Anda Memesan : "+byk+"  Jus Alpukat Seharga  "+banyak+" y/t ");
				     			pilih = input.next();
				     			if(pilih.equals(pilih2))
				     			{
				     				
				     				if(saldo<banyak)
				     				{
				     					System.out.println("Saldo Anda Tidak Cukup");
				     					System.out.println("Silahkan Isi Ulang saldo ");
				     					menu=5;
				     				}
				     				else
				     				{
				     					saldo=saldo-banyak;
					     				System.out.println("Sisa Saldo Sebesar : "+saldo);
					     				System.out.println("Pesan Lagi: (y/t)");
					     				lagi = lgi.next();
					     				if (lagi.equals("y"))
					     				{
					     					menu = 1;
					     				}
					     				else if(lagi.equals(lagi2))
					     				{
					     					menu=5;
					     				}
				     				}
				     			}
				     			else if(pilih.equals("t"))
				     			{
				     				menu=5;
				     			}
				     			while(!(pilih.equals("y")||(pilih.equals("t"))))
				     			{
				     				System.out.print("Anda Memesan : "+byk+"  Nasi Goreng Seharga  "+banyak+" y/t ");
				     				pilih = input.next();
				     			}
				     			break;
							}
							case 4:
							{
								System.out.println("Nasi Goreng");
								System.out.print("Berapa Banyak :");
				     			byk = cdbyk.nextInt();
				     			banyak = 10000*byk;
				     			System.out.print("Anda Memesan : "+byk+"  Mi Rebus Seharga  "+banyak+" y/t ");
				     			pilih = input.next();
				     			if(pilih.equals(pilih2))
				     			{
				     				
				     				if(saldo<banyak)
				     				{
				     					System.out.println("Saldo Anda Tidak Cukup");
				     					System.out.println("Silahkan Isi Ulang saldo ");
				     					menu=5;
				     				}
				     				else
				     				{
				     					saldo=saldo-banyak;
					     				System.out.println("Sisa Saldo Sebesar : "+saldo);
					     				System.out.println("Pesan Lagi: (y/t)");
					     				lagi = lgi.next();
					     				if (lagi.equals("y"))
					     				{
					     					menu = 1;
					     				}
					     				else if(lagi.equals(lagi2))
					     				{
					     					menu=5;
					     				}
				     				}
				     			}
				     			else if(pilih.equals("t"))
				     			{
				     				menu=5;
				     			}
				     			while(!(pilih.equals("y")||(pilih.equals("t"))))
				     			{
				     				System.out.print("Anda Memesan : "+byk+"  Nasi Goreng Seharga  "+banyak+" y/t ");
				     				pilih = input.next();
				     			}
				     			break;
							}
							case 5:
							{
								System.out.println("Mi Rebus");
								System.out.print("Berapa Banyak :");
				     			byk = cdbyk.nextInt();
				     			banyak = 10000*byk;
				     			System.out.print("Anda Memesan : "+byk+"  Mi Goreng Seharga  "+banyak+" y/t ");
				     			pilih = input.next();
				     			if(pilih.equals(pilih2))
				     			{
				     				
				     				if(saldo<banyak)
				     				{
				     					System.out.println("Saldo Anda Tidak Cukup");
				     					System.out.println("Silahkan Isi Ulang saldo ");
				     					menu=5;
				     				}
				     				else
				     				{
				     					saldo=saldo-banyak;
					     				System.out.println("Sisa Saldo Sebesar : "+saldo);
					     				System.out.println("Pesan Lagi: (y/t)");
					     				lagi = lgi.next();
					     				if (lagi.equals("y"))
					     				{
					     					menu = 1;
					     				}
					     				else if(lagi.equals(lagi2))
					     				{
					     					menu=5;
					     				}
				     				}
				     			}
				     			else if(pilih.equals("t"))
				     			{
				     				menu=5;
				     			}
				     			while(!(pilih.equals("y")||(pilih.equals("t"))))
				     			{
				     				System.out.print("Anda Memesan : "+byk+"  Mi Rebus Seharga  "+banyak+" y/t ");
				     				pilih = input.next();
				     			}
				     			break;
							}
							case 6:
							{
								System.out.println("Mi Goreng");
								System.out.print("Berapa Banyak :");
				     			byk = cdbyk.nextInt();
				     			banyak = 4000*byk;
				     			System.out.print("Anda Memesan : "+byk+"  Mi Goreng Seharga  "+banyak+" y/t ");
				     			pilih = input.next();
				     			if(pilih.equals(pilih2))
				     			{
				     				saldo=saldo-banyak;
				     				if(saldo<banyak)
				     				{
				     					System.out.println("Saldo Anda Tidak Cukup");
				     					System.out.println("Silahkan Isi Ulang saldo ");
				     					menu=5;
				     				}
				     				else
				     				{
					     				System.out.println("Sisa Saldo Sebesar : "+saldo);
					     				System.out.println("Pesan Lagi: (y/t)");
					     				lagi = lgi.next();
					     				if (lagi.equals("y"))
					     				{
					     					menu = 1;
					     				}
					     				else if(lagi.equals(lagi2))
					     				{
					     					menu=5;
					     				}
				     				}
				     			}
				     			else if(pilih.equals("t"))
				     			{
				     				menu=5;
				     			}
				     			break;
							}
							case 7:
							{
								menu=5;
								break;
							}
							case 8:
							{
								System.exit(0);
								break;
							}
						}
						break;
					}
					case 2:
					{
						System.out.println("Saldo Anda Sebesar : "+saldo);
						System.out.println("Ke Menu Utama : (y)");
						pilih = input.next();
				     	if(pilih.equals("y"))
				     	{
				     		menu=5;
				     	}
				     	

						while(!(pilih.equals("y")||(pilih.equals("t"))))
						{
							System.out.println("Inputan yang Anda Masukan Salah");
							System.out.println("Saldo Anda Sebesar : "+saldo);
							System.out.println("Ke Menu Utama : (y)");
							pilih = input.next();
				     	}
				     	break;
					}
					case 3:
					{
						System.out.print("Masukkan Nominal: ");
						Scanner nml = new Scanner(System.in);
						nominal = nml.nextInt();
						System.out.println("Nominal yang Anda tambahkan sebesar : " +nominal);
						System.out.println("Saldo Sekarang Sebesar : " +(saldo=saldo+nominal));
						System.out.println("Ke Menu Utama : (y)");
						pilih = input.next();
				     	if(pilih.equals(pilih2))
				     	{
				     		menu=5;
				     	}

				     	while(!(pilih.equals("y")||(pilih.equals("t"))))
				     	{
				     		System.out.println("Inputan yang Anda Masukkan Salah");
				     		System.out.println("Saldo Sekarang Sebesar : " +(saldo=saldo+nominal));
							System.out.println("Ke Menu Utama : (y)");
							pilih = input.next();
				     	}
				     	break;
					}
					case 4:
					{
						System.exit(0);
					}
					
				}
				break;
			}
		}
	}
}