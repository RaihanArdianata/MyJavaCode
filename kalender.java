class kalender{
	public static void main(String[] args) {
		String[][] kalender = {{"Januari","30"},{"Februari","28"}};

		for (int i=0; i< kalender.length; i++){
			System.out.println("Bulan : " + kalender[i] [0]);
			System.out.println("Hari  : " + kalender[i] [1]);
			System.out.println("----------------------------");
		}

	}
}