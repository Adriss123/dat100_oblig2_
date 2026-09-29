package no.hvl.dat100.tabeller;

import static java.lang.System.out;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			out.print(tabell[i] + " ");
		}
		out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String resultat = "[";

		for (int i = 0; i < tabell.length; i++) {
			resultat += tabell[i];
			if (i<tabell.length-1) {
				resultat += ",";
			}
		}
		resultat += "]";
		System.out.println(resultat);
		return resultat;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum= 0 ;
		for (int i = 0; i < tabell.length; i++) {
			 sum += Integer.parseInt(String.valueOf(tabell[i]));
		}
		System.out.println(sum);
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				out.println(tabell[i]);
				return true;
            }
		}
		out.println(tall);
		return false;
	}
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				out.println(i);
				return i;
			}
		}
		out.println(-1);
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversert = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			reversert[i] = tabell[tabell.length - 1 - i];
		}
		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] resultat = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			resultat[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			resultat[tabell1.length + i] = tabell2[i];
		}
		return resultat;
	}
}
