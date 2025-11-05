public class App {
    public static void main(String[] args) throws Exception {
        int alturaIntroducida  = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la X: "));

        int alturaInferior = (int)Math.floor(alturaIntroducida/2.0);
        int alturaSuperior = (int)Math.ceil(alturaIntroducida/2.0);

        if (alturaIntroducida % 2 == 0 || alturaIntroducida < 3)
            System.out.println("La altura debe ser impar y mayor que 3.");
        
        for (int i = 0; i < alturaSuperior; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (alturaSuperior - i)) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < alturaInferior; i++) {
            for (int j = i; j < alturaInferior - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < (i + 1) * 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
