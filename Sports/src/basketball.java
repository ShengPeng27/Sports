
class Basketball extends Sports{
		
	public Basketball(){
		
	}
	public Basketball(int numberOfTeams,int highScore,int lowScore){
		this.numberOfTeams=numberOfTeams;
		this.highScore=highScore;
		this.lowScore=lowScore;
	}
	@Override
	public String toString() {
		return "Basketball [numberOfTeams=" + numberOfTeams + ", highScore="
				+ highScore + ", lowScore=" + lowScore + "]";
	}
}