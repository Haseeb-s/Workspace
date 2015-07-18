
public class BasicClass {
public String Teacher;
public String Course;
public int NumOfStudents;
public BasicClass(String teacher, String course, int numOfStudents) {
	super();
	Teacher = teacher;
	Course = course;
	NumOfStudents = numOfStudents;
}
public String getTeacher() {
	return Teacher;
}
public void setTeacher(String teacher) {
	Teacher = teacher;
}
public String getCourse() {
	return Course;
}
public void setCourse(String course) {
	Course = course;
}
public int getNumOfStudents() {
	return NumOfStudents;
}
public void setNumOfStudents(int numOfStudents) {
	NumOfStudents = numOfStudents;
}
@Override
public String toString() {
	return "BasicClass [Teacher=" + Teacher + ", Course=" + Course
			+ ", NumOfStudents=" + NumOfStudents + "]";
}

}
