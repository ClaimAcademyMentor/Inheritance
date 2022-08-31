package inheritance;

public class Marvel extends Superhero {

	String spiderman = "Spiderman";
	String gambit = "Gambit";
	String squirrelGirl = "Squirrel Girl";

	public void fightThanos(String powersAndAbilities, String weaknesses) {
		if (powersAndAbilities.equals("Infinity Gauntlet") || powersAndAbilities.equals(weaknesses)) {
			System.out.println("The fight is over");
		} else {
			System.out.println("The fight continues");
		}
	}

	@Override
	public String toString() {
		return "Marvel [spiderman=" + spiderman + ", gambit=" + gambit + ", squirrelGirl=" + squirrelGirl
				+ ", biography=" + biography + ", powersAndAbilities=" + powersAndAbilities + ", wardrobe=" + wardrobe
				+ ", morals=" + morals + ", sideKick=" + sideKick + ", publicationYear=" + publicationYear
				+ ", archNemesis=" + archNemesis + ", weaknesses=" + weaknesses + "]";
	}

}
