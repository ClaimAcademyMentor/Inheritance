package inheritance;

public class DC extends Superhero {

	String batman = "Batman";
	String superman = "Superman";

	public void fightDarkseid(String powersAndAbilities, String weaknesses) {
		if (powersAndAbilities.equals(weaknesses)) {
			System.out.println("The fight is over");
		} else {
			System.out.println("The fight continues");
		}

	}
}
