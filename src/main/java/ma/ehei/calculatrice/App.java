package ma.ehei.calculatrice;

public class App {
	public static void main(String[] args) {
		Calculatrice calc = new Calculatrice();
        int resultatMultiplication = calc.multiplication(5, 3);
        System.out.println("Résultat de la multiplication : " + resultatMultiplication);
	}
}
