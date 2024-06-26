import java.util.Scanner;

public class JuegoAhorcado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String palabraSecreta = "velociraptor";
        char [] palabraGuiones = new char[palabraSecreta.length()];
        int FALLOS_MAX = 8;
        int contadorFallos = 0;

        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraGuiones[i] = '_';
        }
        System.out.println("¡Bienvenido al juego del ahorcado!");



        while (!String.valueOf(palabraGuiones).equals(palabraSecreta) && contadorFallos < FALLOS_MAX) {

            
            System.out.println("La palabra a adivinar es: " + String.valueOf(palabraGuiones) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor:");
            char letra = scan.nextLine().charAt(0);
            System.out.println("Letra introducida: " + letra + "\n");
            
            boolean isLetraAcertada = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraGuiones[i] = letra;
                    isLetraAcertada = true;
                }
                
            }

            if (!isLetraAcertada) {
                contadorFallos++;
                System.out.println("¡Has fallado! Te quedan " + (FALLOS_MAX - contadorFallos)  + " intentos");
            }

            

        }

        if (String.valueOf(palabraGuiones).equals(palabraSecreta)) {
            System.out.println("¡Enhorabuena, acertaste la palabra! " + palabraSecreta.toUpperCase());
            System.out.println("¡Vuelve a jugar cuando quieras!");
        }

        if (contadorFallos == FALLOS_MAX){
            System.out.println("¡Vaya, te quedastes sin intentos! La palabra era: " + palabraSecreta);
            System.out.println("¡Más suerte la próxima vez!");
        }

    }
}
