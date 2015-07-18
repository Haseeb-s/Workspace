
public class Hockey extends Basketball {
	public int numberOfFights;
	public double shotAccuracy;
	
	public Hockey(String teamName, int amountOfWins, int amountOfLosses,
			int shotsTaken, int shotsMissed, int numberOfFights,
			double shotAccuracy) {
		super(teamName, amountOfWins, amountOfLosses, shotsTaken, shotsMissed);
		this.numberOfFights = numberOfFights;
		this.shotAccuracy = shotAccuracy;
	}

	public int getNumberOfFights() {
		return numberOfFights;
	}

	public void setNumberOfFights(int numberOfFights) {
		this.numberOfFights = numberOfFights;
	}

	public double getShotAccuracy() {
		return shotAccuracy;
	}

	public void setShotAccuracy(double shotAccuracy) {
		this.shotAccuracy = shotAccuracy;
	}

	@Override
	public String toString() {
		return "Hockey [numberOfFights=" + numberOfFights + ", shotAccuracy="
				+ shotAccuracy + ", shotsTaken=" + shotsTaken
				+ ", shotsMissed=" + shotsMissed + ", teamName=" + teamName
				+ ", amountOfWins=" + amountOfWins + ", amountOfLosses="
				+ amountOfLosses + "]";
	}
	
}
