
public class ComputerScience extends BasicClass {
public String Discription;
public String ClassRoom;
public int Duration;
public ComputerScience(String teacher, String course, int numOfStudents,
		String discription, String classRoom, int duration) {
	super(teacher, course, numOfStudents);
	Discription = discription;
	ClassRoom = classRoom;
	Duration = duration;
}
public String getDiscription() {
	return Discription;
}
public void setDiscription(String discription) {
	Discription = discription;
}
public String getClassRoom() {
	return ClassRoom;
}
public void setClassRoom(String classRoom) {
	ClassRoom = classRoom;
}
public int getDuration() {
	return Duration;
}
public void setDuration(int duration) {
	Duration = duration;
}
@Override
public String toString() {
	return "ComputerScience [Discription=" + Discription + ", ClassRoom="
			+ ClassRoom + ", Duration=" + Duration + ", Teacher=" + Teacher
			+ ", Course=" + Course + ", NumOfStudents=" + NumOfStudents + "]";
}

}
