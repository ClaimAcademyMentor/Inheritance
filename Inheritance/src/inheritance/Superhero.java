package inheritance;

public class Superhero {

	String biography;
	String powersAndAbilities;
	String wardrobe;
	boolean morals;
	boolean sideKick;
	int publicationYear;
	boolean archNemesis;
	String weaknesses;

	@Override
	public String toString() {
		return "Biography: " + biography + "\nPowers and Abilities: " + powersAndAbilities + "\nWardrobe: " + wardrobe
				+ "\nDoes this hero have morals?: " + morals + "\nDoes this hero have a sidekick?: " + sideKick
				+ "\nYear of Publication: " + publicationYear + "\nDoes this hero have an archnemesis?: " + archNemesis
				+ "\nWeaknesses: " + weaknesses;
	}

}
