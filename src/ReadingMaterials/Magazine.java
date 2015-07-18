
public class Magazine extends BasicBooks {
public int year;
public int issue;
public Magazine(int numberOfPages, String title, boolean hardCover, int year,
		int issue) {
	super(numberOfPages, title, hardCover);
	this.year = year;
	this.issue = issue;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getIssue() {
	return issue;
}
public void setIssue(int issue) {
	this.issue = issue;
}
@Override
public String toString() {
	return "Magazine [year=" + year + ", issue=" + issue + ", numberOfPages="
			+ numberOfPages + ", title=" + title + ", hardCover=" + hardCover
			+ "]";
}

}
