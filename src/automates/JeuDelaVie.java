package automates;

public class JeuDelaVie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ligne = 20;
		int colonne = 20;

		int[][] map = new int[ligne][colonne];

		map[15][5] = 1;
		map[15][6] = 1;
		map[15][7] = 1;
		map[16][7] = 1;
		map[17][6] = 1;

		for (int c = 0; c < map.length; c++) {
			for (int l = 0; l < map[c].length; l++) {

				if (c == 0 || c == map.length - 1 || l == 0 || l == map[c].length - 1) {
					map[c][l] = 4;
				}

				System.out.print(map[c][l] + "|");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			map = generation(map, colonne, ligne);
		}

		// int[][] map2 = generation(map1, colonne, ligne);
	}

	public static int[][] generation(int[][] map, int colonne, int ligne) {

		int[][] map1 = new int[ligne][colonne];

		for (int c = 0; c < map1.length; c++) {
			for (int l = 0; l < map1[c].length; l++) {

				if (map[c][l] != 4) {

					if ((map[c - 1][l - 1]) + (map[c - 1][l]) + (map[c - 1][l + 1]) + (map[c][l - 1]) + (map[c][l + 1])
							+ (map[c + 1][l - 1]) + (map[c + 1][l]) + (map[c + 1][l + 1]) == 3) {
						map1[c][l] = 1;
						// System.out.println(x);
					} else if ((map[c - 1][l - 1]) + (map[c - 1][l]) + (map[c - 1][l + 1]) + (map[c][l - 1])
							+ (map[c][l + 1]) + (map[c + 1][l - 1]) + (map[c + 1][l]) + (map[c + 1][l + 1]) == 2) {
						map1[c][l] = map[c][l];
					} else if (((map[c - 1][l - 1]) + (map[c - 1][l]) + (map[c - 1][l + 1]) + (map[c][l - 1])
							+ (map[c][l + 1]) + (map[c + 1][l - 1]) + (map[c + 1][l]) + (map[c + 1][l + 1]) >= 4)
							|| ((map[c - 1][l - 1]) + (map[c - 1][l]) + (map[c - 1][l + 1]) + (map[c][l - 1])
							+ (map[c][l + 1]) + (map[c + 1][l - 1]) + (map[c + 1][l])+ (map[c + 1][l + 1]) < 2))

					{
						map1[c][l] = 0;
					}
				} else {
					map1[c][l] = 4;
				}

				System.out.print(map1[c][l] + "|");
			}
			System.out.println();
		}
		System.out.println();

		return map1;

	}

} /*
	 * int x = map[c][l]; int ouest = map[c-1][l]; int nord = map[c][l-1]; int est =
	 * map[c+1][l]; int sud = map[c-1][l]; int somme = ouest + nord + est + sud; if
	 * (x==1) { System.out.println("test= "+ somme) ; }
	 */

/*
 * if (c > 0 && c < colonne-1 && l > 0 && l < ligne-1 ) {
 * 
 * int x = map[c][l];
 * 
 * if (x == 1 && (((map[c - 1][l]) + (map[c + 1][l]) + (map[c][l - 1]) +
 * (map[c][l + 1]) == 2) || ((map[c - 1][l]) + (map[c + 1][l]) + (map[c][l - 1])
 * + (map[c][l + 1]) == 2))) {
 * 
 * x = 1; System.out.println(x); } else { map[c][l] = 0; } }
 */