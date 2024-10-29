
import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner userInput = new Scanner(System.in);
		String[] kodedanjam = userInput.nextLine().split(" ");
String kode = kodedanjam[0];
int jamsebulan = Integer.parseInt(kodedanjam[1]);
}
public static String cekKodeDanTunjanganHonor(String kode, int jamSebulan){
	int jumlahHonor = 30000*jamSebulan;
switch (kode) {
	case "Des":
	jumlahHonor += 600000;
	break;
	case "PRG":
	jumlahHonor += 1200000;
	break;
	case "WRT":
	jumlahHonor += 400000;
	break;
	case "MKT";
	jumlahHonor += 500000;
	break;
	default:
	
}
}
}
