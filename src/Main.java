
public class Main {
    public static void main(String[] args) {
        int num1 = 1, num2 = 0;
        int fibo = 0;

        System.out.print(fibo + " "); //Primeiro termo ( 0 )

        // Dessa forma ele vai imprimir até 377. Caso o numéro passe de 377 ele imprime 610.
        while (fibo < 377) {
            fibo = num1 + num2;
            System.out.print(fibo + " ");
            num1 = num2;
            num2 = fibo;

        }
    }

}
