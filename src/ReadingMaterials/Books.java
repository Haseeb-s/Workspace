
public class Books extends BasicBooks{
	public String mainCharacter;
	public String villian;
	public String Genre;
	
	public Books(int numberOfPages, String title, boolean hardCover,
			String mainCharacter, String villian, String genre) {
		super(numberOfPages, title, hardCover);
		this.mainCharacter = mainCharacter;
		this.villian = villian;
		Genre = genre;
	}

	public String getMainCharacter() {
		return mainCharacter;
	}

	public void setMainCharacter(String mainCharacter) {
		this.mainCharacter = mainCharacter;
	}

	public String getVillian() {
		return villian;
	}

	public void setVillian(String villian) {
		this.villian = villian;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	@Override
	public String toString() {
		return "Books [mainCharacter=" + mainCharacter + ", villian=" + villian
				+ ", Genre=" + Genre + ", numberOfPages=" + numberOfPages
				+ ", title=" + title + ", hardCover=" + hardCover + "]";
	}
	
	
}
