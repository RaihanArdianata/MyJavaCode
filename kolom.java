import java.util.Scanner;
public class ggwp{
	public static void main(String[] args) {
		String[][] kursi = {{"Andi"},{"Ari"},{"Chyo"}};
		
		System.out.println("-------------------------");
        for(int bar = 0; bar < kursi.length; bar++)
        {
            for(int kol = 0; kol < kursi[bar].length; kol++){
                System.out.format("| %s | \t", meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
		}
	}
}