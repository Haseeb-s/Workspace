		
public class Basketball extends Sport {
		public int shotsTaken;
		public int shotsMissed;
		public static double shotsAverage;
	
	public Basketball(String teamName, int amountOfWins, int amountOfLosses,
			int shotsTaken, int shotsMissed) {
		super(teamName, amountOfWins, amountOfLosses);
		this.shotsTaken = shotsTaken;
		this.shotsMissed = shotsMissed;
	}
	
	public int getShotsTaken() {
		return shotsTaken;
	}
	
	public void setShotsTaken(int shotsTaken) {
		this.shotsTaken = shotsTaken;
	}
	
	public int getShotsMissed() {
		return shotsMissed;
	}
	
	public void setShotsMissed(int shotsMissed) {
		this.shotsMissed = shotsMissed;
	}
	
	public static double getShotsAverage() {
		return shotsAverage;
	}
	
	public static void setShotsAverage(double shotsAverage) {
		Basketball.shotsAverage = shotsAverage;
	}

	@Override
	public String toString() {
		return "Basketball [shotsTaken=" + shotsTaken + ", shotsMissed="
				+ shotsMissed + ", teamName=" + teamName + ", amountOfWins="
				+ amountOfWins + ", amountOfLosses=" + amountOfLosses + "]";
	}
	
}


