
public class Encyclopedia extends Magazine {
public String Subject;

public Encyclopedia(int numberOfPages, String title, boolean hardCover,
		int year, int issue, String subject) {
	super(numberOfPages, title, hardCover, year, issue);
	Subject = subject;
}

public String getSubject() {
	return Subject;
}

public void setSubject(String subject) {
	Subject = subject;
}

@Override
public String toString() {
	return "Encyclopedia [Subject=" + Subject + ", year=" + year + ", issue="
			+ issue + ", numberOfPages=" + numberOfPages + ", title=" + title
			+ ", hardCover=" + hardCover + "]";
}



}
