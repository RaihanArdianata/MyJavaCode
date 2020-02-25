class belahketupat{
	public static void main(String[] args) {
		/*for(int i=5;i<5;i++){
			for(int j=1;j<=i;j++)
			System.out.print("*");
			System.out.println();
		}
		for(int y=5;y>=1;y--){
			for (int j=y;j >=1 ;j-- )
			System.out.print("*");
			System.out.println();
		}*/
        int x, y;
        for (y = 1; y <= 5; y++) {//banyaknya baris/tinggi
            for (x = 0; x < 5 - y; x++) {
                System.out.print(' ');//pemberian spasi
            }
            for (x = (2 - y); x < (2 - y) + (2 * y - 1); x++) {
                System.out.print('*');
            }
            System.out.print('\n');//agar pindah lane
        }
        /*
        for (y = 4; y >= 1; y--) { //segitiga terbalik tinggal balik aja itunya kondisinya
            for (x = 0; x < 5 - y; x++) {
                System.out.print(' ');
            }
            for (x = (2 - y); x < (2 - y) + (2 * y - 1); x++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }*/
	}
}