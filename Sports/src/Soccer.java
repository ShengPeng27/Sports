
class Soccer extends Sports{
	public Soccer(){
		
	}
	public Soccer(int numberOfTames, int highScore, int lowScore) {
		this.numberOfTeams=numberOfTames;
		this.highScore=highScore;
		this.lowScore=lowScore;
	}
	@Override
	public String toString() {
		return "Soccer [numberOfTeams=" + numberOfTeams + ", highScore="
				+ highScore + ", lowScore=" + lowScore + "]";
	}
}