
public class PEDClass extends BasicClass{
	public int HoursAtGym;
	public int CaloriesConsumed;
	public String FoodJournalEntry;
	
	
	public PEDClass(String teacher, String course, int numOfStudents,
			int hoursAtGym, int caloriesConsumed, String foodJournalEntry) {
		super(teacher, course, numOfStudents);
		HoursAtGym = hoursAtGym;
		CaloriesConsumed = caloriesConsumed;
		FoodJournalEntry = foodJournalEntry;
	}
	
	public int getHoursAtGym() {
		return HoursAtGym;
	}
	public void setHoursAtGym(int hoursAtGym) {
		HoursAtGym = hoursAtGym;
	}
	public int getCaloriesConsumed() {
		return CaloriesConsumed;
	}
	public void setCaloriesConsumed(int caloriesConsumed) {
		CaloriesConsumed = caloriesConsumed;
	}
	public String getFoodJournalEntry() {
		return FoodJournalEntry;
	}
	public void setFoodJournalEntry(String foodJournalEntry) {
		FoodJournalEntry = foodJournalEntry;
	}

	@Override
	public String toString() {
		return "PEDClass [HoursAtGym=" + HoursAtGym + ", CaloriesConsumed="
				+ CaloriesConsumed + ", FoodJournalEntry=" + FoodJournalEntry
				+ ", Teacher=" + Teacher + ", Course=" + Course
				+ ", NumOfStudents=" + NumOfStudents + "]";
	}
	

}
