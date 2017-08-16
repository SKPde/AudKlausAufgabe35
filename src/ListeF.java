
public class ListeF {

	private Comparable[] inhalt; //Inhalt der Listenelemente
	private int lastIndex;
	
	public ListeF(int len) {
		inhalt = new Comparable[len];
		lastIndex = -1; // leere Liste
	}
	
	public void sortedInsert (Comparable neu) {
		if(lastIndex >= inhalt.length) {
			throw new RuntimeException("Liste bereits voll");
		} else if (lastIndex == -1) {
			inhalt[++lastIndex] = neu;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
