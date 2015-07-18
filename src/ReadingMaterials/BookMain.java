
public class BookMain {

	public static void main(String[] args) {
		Comic Batman = new Comic(12,"New 52 Batman",false,"Batman","Joker", 1,"Clark Kent", "Mike Hunt");
		System.out.println(Batman);
		System.out.println();
		Encyclopedia brit = new Encyclopedia(420, "Trees", true, 2015, 12, "Totally about Trees");
		System.out.println(brit);
		System.out.println();
		Magazine natGeo = new Magazine(30, "Nat Geo Presents: Ayy Lmao", false, 2013, 2);
		System.out.println(natGeo);
	}

}
