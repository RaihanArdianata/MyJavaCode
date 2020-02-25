import java.util.Scanner; //memasukkan fungsi scanner java
class kelas{ //memberikan nama kelas //publick membuat kelas/method/atribut dapat diakses
	public static void main(String[] args)
	
	{
		int nilai; //pendeklarasian nilai

		Scanner scan = new Scanner(System.in);

		System.out.print("Masukkan Data : ");
		nilai = scan.nextInt();

		if(nilai >= 80){
			System.out.println("A");
		}
		else if(nilai >= 70 ){
			System.out.println("B");
		}
		else if(nilai >= 60){
			System.out.println("C");
		}
		else{
			System.out.println("D");
		}
	}
}