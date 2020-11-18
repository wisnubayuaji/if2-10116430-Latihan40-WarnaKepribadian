/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
 public class App {
    public static void main(String[] args) throws Exception {

	String warnaMu;
        String namaMu;
        Warnain warni = new Warnain();
        Scanner scn = new Scanner(System.in);
        
        System.out.print(warni.ANSI_RED+"YUK "+warni.ANSI_RESET);
        System.out.print(warni.ANSI_GREEN+"CEK "+warni.ANSI_RESET);
        System.out.print(warni.ANSI_YELLOW+"KEPRIBADIANMU "+warni.ANSI_RESET);
        System.out.print(warni.ANSI_CYAN+"DARI "+warni.ANSI_RESET);
        System.out.print(warni.ANSI_PURPLE+"WARNA "+warni.ANSI_RESET);
        System.out.print(warni.ANSI_BLUE+"FAVORITMU "+warni.ANSI_RESET+"\n");
        
        System.out.print("\n"+warni.ANSI_RED_BACKGROUND+warni.ANSI_WHITE+"\t MERAH \t\t\n"+warni.ANSI_RESET);
        System.out.print(warni.ANSI_GREEN_BACKGROUND+warni.ANSI_WHITE+"\t HIJAU \t\t\n"+warni.ANSI_RESET);
        System.out.print(warni.ANSI_YELLOW_BACKGROUND+warni.ANSI_WHITE+"\t KUNING \t\n"+warni.ANSI_RESET);
        System.out.print(warni.ANSI_BLUE_BACKGROUND+warni.ANSI_WHITE+"\t BIRU \t\t\n"+warni.ANSI_RESET);
        System.out.print(warni.ANSI_PURPLE_BACKGROUND+warni.ANSI_WHITE+"\t UNGU \t\t\n\n"+warni.ANSI_RESET);
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaMu = scn.next();
        System.out.print("NAMA KAMU : ");
        namaMu = scn.next();
        
        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + namaMu.toUpperCase()+"====");
        warni.hasilWarna(warnaMu);
    }
}
