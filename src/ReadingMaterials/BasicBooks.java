
public class BasicBooks {
	public int numberOfPages;
	public String title;
	public boolean hardCover;
	
	public BasicBooks(int numberOfPages, String title, boolean hardCover) {
		super();
		this.numberOfPages = numberOfPages;
		this.title = title;
		this.hardCover = hardCover;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isHardCover() {
		return hardCover;
	}
	public void setHardCover(boolean hardCover) {
		this.hardCover = hardCover;
	}
	
	
}
