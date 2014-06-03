
public class SportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			Sports sp1 = new Basketball(5,80,60);
			Sports sp2 = new Football(5,80,60,"Tom");
			
			display(sp1);
			display(sp2);
	}
	
	public static void display(Sports s) {
		System.out.println(s);		
	}

}
