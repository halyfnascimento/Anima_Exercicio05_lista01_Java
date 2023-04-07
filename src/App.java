import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double metro;
        double centimetro;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual valor em metros será convertido");
        metro = teclado.nextDouble();
        centimetro = metro * 100;
        System.out.println("o valorem metro convertido para centimetro é " + centimetro);
    }
}
// Tambem pode ser feito com variavel (int), porem fiz com double para caso fose
// ser convertido numeros decimais.