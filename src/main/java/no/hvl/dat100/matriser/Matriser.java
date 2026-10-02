package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] ytre : matrise) {
			for (int indre : ytre) {
				System.out.print(indre + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				if (j + 1 < matrise[i].length) {
					streng += matrise[i][j] + " ";
				} else {
					streng += matrise[i][j];
				}
			}
			streng += "\n";
		}
		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] resultat = new int[matrise.length][];
		int res = 0;
		for (int i = 0; i < matrise.length; i++) {
			resultat[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				res = matrise[i][j] * tall;
				resultat[i][j] = res;
			}
		}
		return resultat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i].length == b[i].length) {
					for (int j = 0; j < a[i].length; j++) {
						if (a[i][j] != b[i][j]) {
							return false;
						}
					}
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}


	// e)
	public static int[][] speile(int[][] matrise) {
//jeg finner lengden på den lengste raden, i tilfelle radene er ulikt lange
		int maks = 0;

		for (int[] ytre : matrise) {
			if (ytre.length > maks) {
				maks = ytre.length;
			}
		}
//jeg skal nå bygge matrisen der jeg bytter mellom rader og kolonner
		int[][] resultat = new int[maks][matrise.length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				resultat[j][i] = matrise[i][j];
			}
		}
		return resultat;
		//plassene som kan mangle blir automatisk omgjort til 0 av java
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] c = new int[a.length][b[0].length];
		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
		}
		return c;
	}
}

