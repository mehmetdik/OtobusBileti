import java.util.Scanner;


public class OBmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {


			String Nereden,Nereye;
			int sec;
			Scanner scan=new Scanner(System.in);
			System.out.println("1-Istanbul 2-Ankara 3-Izmir 4-Sanlıurfa");
			System.out.println("Nereden=");
			Nereden=scan.nextLine();
			if (!Nereden.equalsIgnoreCase("Istanbul") && !Nereden.equalsIgnoreCase("Ankara") && !Nereden.equalsIgnoreCase("izmir") && !Nereden.equalsIgnoreCase("Sanlıurfa")) {
				System.out.println("Hatalı Giris");
				main(args);	
			}
			System.out.println("Nereye=");
			Nereye=scan.nextLine();
			if (!Nereye.equalsIgnoreCase("Istanbul") && !Nereye.equalsIgnoreCase("Ankara") && !Nereye.equalsIgnoreCase("izmir") && !Nereye.equalsIgnoreCase("Sanlıurfa")) {
				System.out.println("Hatalı Giris");
				main(args);	
			}
			do{
				System.out.println("1-Bilgi almak istiyorum");
				System.out.println("2-Bilet almak istiyorum");
				System.out.println("Seçim=");
				sec=scan.nextInt();


				if (sec==1){
					Bilgi.bilgi(Nereden,Nereye);
					System.out.println("3-Ortalama varış süresi="+Bilgi.getSaat()+" saat "+Bilgi.getDk()+" dakika");

					do{

						System.out.println("Bilet Almak Istiyor musun?(1-evet/2-hayır)");
						sec=scan.nextInt();
						if (sec==1) 
							BiletAlmak.biletalmak(Nereden, Nereye,Bilgi.getÜcret());
						else if (sec==2)
							System.exit(-1);	
						else
							System.out.println("Hatalı giris,Tekrar dene.");
					}while(sec!=1 && sec!=2);
				}
				else if(sec==2){

					BiletAlmak.biletalmak(Nereden,Nereye);
					Bilgi.bilgi(Nereden, Nereye);
					Biletcıktısı.biletcıktısı(BiletAlmak.getIsim(),BiletAlmak.getSoyad(),BiletAlmak.getTelno(),BiletAlmak.getKoltuk(), Nereden, Nereye,Bilgi.getÜcret());
				}
				else
					System.out.println("Hatalı secim");
				if (sec==1)
				{
					Biletcıktısı.biletcıktısı(BiletAlmak.getIsim(),BiletAlmak.getSoyad(),BiletAlmak.getTelno(),BiletAlmak.getKoltuk(), Nereden, Nereye,Bilgi.getÜcret());
				}
			} while (sec!=1 && sec!=2);


		} catch (Exception e) {
			System.out.println("Hatalı Giris");
			main(args);
		}
	}

}
