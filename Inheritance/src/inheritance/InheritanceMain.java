package inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		DC dc1 = new DC();
		Marvel m1 = new Marvel();

		dc1.powersAndAbilities = "Wealth, Master Combatant, World's Greatest Detective";
		dc1.morals = true;
		dc1.biography = "Born into wealth, parents killed while young dedicating him to a life of justice";
		dc1.sideKick = true;
		dc1.archNemesis = true;
		dc1.publicationYear = 1939;
		dc1.wardrobe = "Bat suit";
		dc1.weaknesses = "Normal human (in peak physical condition), moral code";
//		System.out.println(dc1);

		IronWorks iw1 = new IronWorks();
		System.out.println(iw1.gambit);
		double newDebt = iw1.debtCollected - 3000000;
		iw1.debtCollected = newDebt;
		System.out.println((long) iw1.debtCollected);

		m1.powersAndAbilities = "Super Strength";
		m1.weaknesses = "Paper Skin";
		m1.fightThanos(m1.powersAndAbilities, m1.weaknesses);
		System.out.println(m1);

	}

}
