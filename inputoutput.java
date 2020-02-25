import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) { 
        //membuat objek input dengan nama input
        Scanner input = new Scanner(System.in);

        //mendklarasikan klm sebagai string
        String klm;               
              
        System.out.println("Input : ");

        //memasukkan input ke variabel string klm
        klm=input.nextLine();

        //membuat array sebagai wadah untuk proses            
        char a[]=new char[100]; 

        //memindahkan string ke array        
        a=klm.toCharArray(); 
                   
        System.out.println("\n\n Output : \n");
        //perulangan untuk mengecek karakter spasi pada inputan
        for(int l=0;l<a.length;l++){
            //cek apa spasi atau bukan            
            if (a[l]==' ') {
                //jika spasi cetak garis baru                    
                System.out.println();           
            }else{
                //jika bukan spasi cetak carakter tnp garis baru
                System.out.print(a[l]);         
            }
        }
    }
}