package ma.ehei.calculatrice;

public class App {
	public static void main(String[] args) {

		System.out.println(Calculatrice.add(10, 5));
		System.out.println(Calculatrice.add(6, 99));

		Calculatrice calc = new Calculatrice();
        int resultatMultiplication = calc.multiplication(5, 3);
        System.out.println("Résultat de la multiplication : " + resultatMultiplication);
	}
}
