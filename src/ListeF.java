
public class ListeF {

	private Comparable[] inhalt; // Inhalt der Listenelemente
	private int lastIndex;

	public ListeF(int len) {
		inhalt = new Comparable[len];
		lastIndex = -1; // leere Liste
	}

	public void sortedInsert(Comparable neu) {
		if (lastIndex >= inhalt.length) {
			throw new RuntimeException("Liste bereits voll");
		} else if (lastIndex == -1) {
			inhalt[++lastIndex] = neu;
			return;
		}
		int wunschindex = 0;

		for (int x = 0; x <= lastIndex; x++) {
			if (inhalt[x].compareTo(neu) >= 0) {
				wunschindex = x;
				break;
			}
		}
		if (inhalt[wunschindex] != null) {
			for(int y = lastIndex; y >= wunschindex; y--) {
				inhalt[y+1] = inhalt[y];
			}
		}
		inhalt[wunschindex] = neu;
		lastIndex++;

	}

	public void ausgabe() {
		for (int x = 0; x <= lastIndex; x++) {
			System.out.println(inhalt[x].toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeF liste = new ListeF(10);
		liste.sortedInsert("Zulieferer");
		liste.sortedInsert("Abschleppwagen");
		liste.sortedInsert("Doppelkupplung");
		liste.sortedInsert("Zahnstange");
		liste.sortedInsert("Synchronring");
		liste.sortedInsert("Stoßdämpfer");
		liste.sortedInsert("Betriebsanleitung");

		liste.ausgabe();

	}

}
