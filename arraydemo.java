class arraydemo{
	public static void main(String[] args) 
	{
		String[][] kursi = {{"Andi","01"},{"Ari","02"},{"Chyo","03"},{"Cahyono","04"},{"Cahyoni","05"}};

		System.out.println("===========================================");
		for(int x=0;x<kursi.length;x++)
		{
			for(int y = 0; y < kursi[x].length; y++)
			{
	            System.out.format("| % x=s | \t", kursi[x][y]);
			}
			System.out.println("");
		}
		System.out.println("===========================================");
		

		for (int x=0;x < kursi.length ;x++ ) 
		{
			System.out.println("Nama : " +kursi[x][0]);
			System.out.println("Kursi : " +kursi [x][1]);
			System.out.println("==========================");
			System.out.println("");
		}
	}
}