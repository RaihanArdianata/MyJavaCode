import java.util.Scanner;

public class MetodeTrapezoida {

    public static void main(String[] args) {
        double a;
        double b;
        int aturan;
        double ba;
        double h;
        double sum = 0;
        
        // int batasatas;
        Scanner batasatas = new Scanner(System.in);
        System.out.print("Masukkan Batas Atas (b) : ");
        b = batasatas.nextDouble();

        Scanner batasbawah = new Scanner(System.in);
        System.out.print("Masukkan Batas Bawah (a): ");
        a = batasbawah.nextDouble();

        Scanner aturanTrapezoida=  new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Aturan Trapezoida/segmen(n) : ");
        aturan = aturanTrapezoida.nextInt();
        batasatas.close();
        batasbawah.close();
        aturanTrapezoida.close();

        double[] data = new double[aturan+1];

        //mencari h
        ba = b - a;
        h = ba /aturan;

        for(int nilaiawal= 0;nilaiawal < aturan + 1 ; nilaiawal++){
            
            //x(n) /x ke n
            double na = a + (nilaiawal * h);
            data[nilaiawal] = na;
            System.out.println("|"+ " x " + nilaiawal + "| = " + "a + " +nilaiawal+" * h "+" |"+ data[nilaiawal] + "|" );
        }

        int pangkat = 2;

        //menjumlahkan semua f(x) = x(n)^2 dan dijumlahkan semua
        for(double num : data ){
            sum = sum + Math.pow(num, pangkat);
        }

        //menampilkan fungsi F(X)
        for(int m=0;m<aturan+1;m++){
            double FungsiF;
            FungsiF = Math.pow(data[m], pangkat);
            System.out.println("F(" + "x" + m + ") = " + FungsiF);
        }
        System.out.println("====================================");
        System.out.println("  batas atas b : "+ " " + b);
        System.out.println("  batas bawah a : "+ " " + a);
        System.out.println("  segment(n) : "+ aturan);
        System.out.println("  h = (b-a)/n : " + h);
        System.out.println("===================================");
        System.out.println("");

        double hasilAkhir = h*sum;

        System.out.println("  HasilAkhir : "+ " " + hasilAkhir);


        
    }
}