public class Sport {
	public String teamName;
	public int amountOfWins;
	public int amountOfLosses;
	
	public Sport(String teamName, int amountOfWins, int amountOfLosses) {
		super();
		this.teamName = teamName;
		this.amountOfWins = amountOfWins;
		this.amountOfLosses = amountOfLosses;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getAmountOfLosses() {
		return amountOfLosses;
	}
	public void setAmountOfLosses(int amountOfLosses) {
		this.amountOfLosses = amountOfLosses;
	}
	public void setAmountOfWins(int amountOfWins) {
		this.amountOfWins = amountOfWins;
	}
	
}

