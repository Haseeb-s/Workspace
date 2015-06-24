
public class Volume {
	public String volumeName;
	public int numberOfBooks;
	public Book[] Book = new Book[10];
	
	
	public Volume(){
		Volume volume = new Volume("N/A", 0, Book);
	}
	
	public Volume(String volumeName, int numberOfBooks, Book[] book){
		this.volumeName = volumeName;
		this.numberOfBooks = numberOfBooks;
		this.Book = book;
	}
	
	public String getBookArray(){
		String bookInfo = "";
		for (Book element : Book){
			bookInfo += element.toString();
		}
		return bookInfo;
	}
	
	
	public String toString(){
		return "The volume name is: " + volumeName + 
				".\nThe number of books is: " + numberOfBooks +
				".\nHere is the information for each book\n\n" + getBookArray();
	}
	
	
}
