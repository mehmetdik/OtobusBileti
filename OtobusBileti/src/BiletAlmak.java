import java.util.Scanner;


public class BiletAlmak {

	static String isim;
	static String soyad;
	static long telno=0;
	static int koltuk;
	public static void biletalmak(String Nereden,String Nereye,int ücret)
	{
		Scanner scan=new Scanner(System.in);
		try {

			System.out.println("Isim=");
			isim=scan.nextLine();
			System.out.println("Soyad=");
			soyad=scan.nextLine();
			System.out.println("Tel No=");
			telno=scan.nextLong();
			System.out.println("Koltuk No giriniz(40)=");
			koltuk=scan.nextInt();

			if (koltuk>40)
			{
				System.out.println("Yanlış koltuk girişi.");
				BiletAlmak.biletalmak(Nereden, Nereye);
			}
		} catch (Exception e) {
			System.out.println("HAtalı giris");
			BiletAlmak.biletalmak(Nereden, Nereye);
		}

	}
	public static String getIsim() {
		return isim;
	}
	public static void setIsim(String isim) {
		BiletAlmak.isim = isim;
	}
	public static String getSoyad() {
		return soyad;
	}
	public static void setSoyad(String soyad) {
		BiletAlmak.soyad = soyad;
	}
	public static long getTelno() {
		return telno;
	}
	public static void setTelno(long telno) {
		BiletAlmak.telno = telno;
	}
	public static int getKoltuk() {
		return koltuk;
	}
	public static void setKoltuk(int koltuk) {
		BiletAlmak.koltuk = koltuk;
	}
	public static void biletalmak(String Nereden,String Nereye)
	{
		Scanner scan=new Scanner(System.in);
		try {

			System.out.println("Isim=");
			isim=scan.nextLine();
			System.out.println("Soyad=");
			soyad=scan.nextLine();
			System.out.println("Tel No=");
			telno=scan.nextLong();
			System.out.println("Koltuk No giriniz(40)=");
			koltuk=scan.nextInt();

			if (koltuk>40)
			{
				System.out.println("Yanlış koltuk girişi.");
				BiletAlmak.biletalmak(Nereden, Nereye);
			}
		} catch (Exception e) {
			System.out.println("HAtalı giris");
			BiletAlmak.biletalmak(Nereden, Nereye);
		}
	}
}
