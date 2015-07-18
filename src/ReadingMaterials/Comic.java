
public class Comic extends BasicBooks{
	
	public String Hero;
	public String Villian;
	public int numberInSeries;
	public String Author;
	public String Illustrator;
	public Comic(int numberOfPages, String title, boolean hardCover,
			String hero, String villian, int numberInSeries, String author,
			String illustrator) {
		super(numberOfPages, title, hardCover);
		Hero = hero;
		Villian = villian;
		this.numberInSeries = numberInSeries;
		Author = author;
		Illustrator = illustrator;
	}
	public String getHero() {
		return Hero;
	}
	public void setHero(String hero) {
		Hero = hero;
	}
	public String getVillian() {
		return Villian;
	}
	public void setVillian(String villian) {
		Villian = villian;
	}
	public int getNumberInSeries() {
		return numberInSeries;
	}
	public void setNumberInSeries(int numberInSeries) {
		this.numberInSeries = numberInSeries;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getIllustrator() {
		return Illustrator;
	}
	public void setIllustrator(String illustrator) {
		Illustrator = illustrator;
	}
	@Override
	public String toString() {
		return "Comic [Hero=" + Hero + ", Villian=" + Villian
				+ ", numberInSeries=" + numberInSeries + ", Author=" + Author
				+ ", Illustrator=" + Illustrator + ", numberOfPages="
				+ numberOfPages + ", title=" + title + ", hardCover="
				+ hardCover + "]";
	}

}
