
public class Book {

	public String Title, Author;
	public int NumberOfPages;
	
	public Book(){
		this.Title = "N/A";
		this.Author = "N/A";
		this.NumberOfPages = 0;
	}
	public Book(String Title, String Author, int NumberOfPages){
		this.Title = Title;
		this.Author = Author;
		this.NumberOfPages = NumberOfPages;
	}
	
	public String toString(){
		return "The title is : " + Title + 
				".\nThe author is : " + Author +
				".\nThe number of pages is : " + NumberOfPages + "\n\n";
	}
}
