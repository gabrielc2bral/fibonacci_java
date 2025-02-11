
public class Main {
    public static void main(String[] args) {
        long num1 = 1, num2 = 0;
        long fibo = 0;
        int i = 0;

        // Dessa forma ele vai imprimir até 377. Caso o numéro passe de 377 ele imprime 610.
        while (fibo < 337) {

            fibo = num1 + num2;

            System.out.println(i+"° número da sequência de Fibonacci: " + fibo);

            num1 = num2;
            num2 = fibo;
            i++;

        }
    }

}
