
public class MathClass extends ComputerScience{
public int NumberOfExams;
public double classAverage;
public int getNumberOfExams() {
	return NumberOfExams;
}
public void setNumberOfExams(int numberOfExams) {
	NumberOfExams = numberOfExams;
}
public double getClassAverage() {
	return classAverage;
}
public void setClassAverage(double classAverage) {
	this.classAverage = classAverage;
}
public MathClass(String teacher, String course, int numOfStudents,
		String discription, String classRoom, int duration, int numberOfExams,
		double classAverage) {
	super(teacher, course, numOfStudents, discription, classRoom, duration);
	NumberOfExams = numberOfExams;
	this.classAverage = classAverage;
}
@Override
public String toString() {
	return "MathClass [NumberOfExams=" + NumberOfExams + ", classAverage="
			+ classAverage + ", Discription=" + Discription + ", ClassRoom="
			+ ClassRoom + ", Duration=" + Duration + ", Teacher=" + Teacher
			+ ", Course=" + Course + ", NumOfStudents=" + NumOfStudents + "]";
}


}
