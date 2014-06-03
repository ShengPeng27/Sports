
class Football extends Sports{
	String playerName;
	public Football(){
		
	}
	
	public Football(int numberOfTames, int highScore, int lowScore, String playerName) {
		this.numberOfTeams=numberOfTames;
		this.highScore=highScore;
		this.lowScore=lowScore;
		this.playerName = playerName;
	}
	@Override
	public String toString() {
		return "Footballs [numberOfTeams=" + numberOfTeams + ", highScore="
				+ highScore + ", lowScore=" + lowScore + "Player name" + playerName +"]";
	}
}