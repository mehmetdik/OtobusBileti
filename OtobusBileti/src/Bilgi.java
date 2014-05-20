import java.util.Scanner;


public class Bilgi {
	String Nereden,Nereye;
	static int sec;
	static int fark;
	static int saat=0;
	static int dk=0;
	static int x=0;
	static int ücret=0;
	static Scanner scan=new Scanner(System.in);
	public Bilgi()
	{

	}

	public String getNereden() {
		return Nereden;
	}

	public void setNereden(String nereden) {
		Nereden = nereden;
	}

	public String getNereye() {
		return Nereye;
	}

	public void setNereye(String nereye) {
		Nereye = nereye;
	}

	public static int getSec() {
		return sec;
	}

	public static void setSec(int sec) {
		Bilgi.sec = sec;
	}

	public static int getFark() {
		return fark;
	}

	public static void setFark(int fark) {
		Bilgi.fark = fark;
	}

	public static int getSaat() {
		return saat;
	}

	public static void setSaat(int saat) {
		Bilgi.saat = saat;
	}

	public static int getDk() {
		return dk;
	}

	public static void setDk(int dk) {
		Bilgi.dk = dk;
	}

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Bilgi.x = x;
	}

	public static int getÜcret() {
		return ücret;
	}

	public static void setÜcret(int ücret) {
		Bilgi.ücret = ücret;
	}

	public static Scanner getScan() {
		return scan;
	}

	public static void setScan(Scanner scan) {
		Bilgi.scan = scan;
	}

	public Bilgi(String Nereden,String Nereye)
	{
		this.Nereden=Nereden;
		this.Nereye=Nereye;
	}

	public static void bilgi(String Nereden,String Nereye)
	{

		if (Nereden.equalsIgnoreCase("istanbul") && Nereye.equalsIgnoreCase("Ankara") || Nereden.equalsIgnoreCase("Ankara") && Nereye.equalsIgnoreCase("istanbul"))
		{fark=452; ücret=35;}
		else	if (Nereden.equalsIgnoreCase("istanbul") && Nereye.equalsIgnoreCase("izmir") || Nereden.equalsIgnoreCase("izmir") && Nereye.equalsIgnoreCase("istanbul"))
		{fark=564; ücret=44;}
		else	if (Nereden.equalsIgnoreCase("istanbul") && Nereye.equalsIgnoreCase("Sanlıurfa") || Nereden.equalsIgnoreCase("Sanlıurfa")  && Nereye.equalsIgnoreCase("istanbul"))
		{fark=1297; ücret=100;}
		else	if (Nereden.equalsIgnoreCase("Ankara") && Nereye.equalsIgnoreCase("izmir") || Nereden.equalsIgnoreCase("izmir") && Nereye.equalsIgnoreCase("Ankara"))
		{fark=586; ücret=45;}
		else	if (Nereden.equalsIgnoreCase("Ankara") && Nereye.equalsIgnoreCase("Sanlıurfa") || Nereden.equalsIgnoreCase("Sanlıurfa") && Nereye.equalsIgnoreCase("Ankara"))
		{fark=844;  ücret=64;}
		else	if (Nereden.equalsIgnoreCase("izmir") && Nereye.equalsIgnoreCase("Sanlıurfa") || Nereden.equalsIgnoreCase("Sanlıurfa") && Nereye.equalsIgnoreCase("izmir"))
		{fark=1261;ücret=100;}
		System.out.print(Nereden+"-"+Nereye);
		System.out.println("\n1-Iki şehir arası uzaklık="+fark+" km");

		System.out.println("2-Ortalama hız=100 km");
		saat=fark/100;

		dk=fark%100;
		if (dk>60) 
		{
			x=dk/60;
			dk=dk%60;
			saat=saat+x;

		}


	}
}
