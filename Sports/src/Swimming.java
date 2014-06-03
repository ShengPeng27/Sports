
class Swimming extends Sports{
	public Swimming(){
		
	}
	public Swimming(int numberOfTames, int highScore, int lowScore) {
		this.numberOfTeams=numberOfTames;
		this.highScore=highScore;
		this.lowScore=lowScore;
	}
	@Override
	public String toString() {
		return "Swimming [numberOfTeams=" + numberOfTeams + ", highScore="
				+ highScore + ", lowScore=" + lowScore + "]";
	}
}
