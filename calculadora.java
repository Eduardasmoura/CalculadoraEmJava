import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        double valorUm;
        double valorDois;
        String oparacao;
        boolean continuar;


  try {
      do {
          System.out.println("Digite um valor: ");
          valorUm = numeros.nextDouble();

          System.out.println("Digite a oparação desejada ( +, -, /, *): ");
          oparacao = numeros.next();

          System.out.println("Digite o segundo valor: ");
          valorDois = numeros.nextDouble();

          System.out.println("Resultado: " + realizarCalculo(valorUm, valorDois, oparacao));
          continuar = verificarNovaOperação();
      } while (continuar);
  } catch (InputMismatchException ex) {
      System.out.println("Os valores para o calculo precisam ser numéricos!" );

  }
  }


    public static boolean verificarNovaOperação(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova oparação? (S ou N) ");
            return !sc.nextLine().toUpperCase().equals("N");
        }


    public static double realizarCalculo(double valorUm, double valorDois, String oparacao) {
        double resultadoCalculo = 0.0;
        switch (oparacao) {
            case "+":
                resultadoCalculo = valorUm + valorDois;
                break;
            case "-":
                resultadoCalculo = valorUm - valorDois;
                break;
            case "*":
                resultadoCalculo = valorUm * valorDois;
                break;
            case "/":
                resultadoCalculo = valorUm / valorDois;
                break;

            default:
                System.out.println("Operação Inválida :( ");
}
return resultadoCalculo;
}
}
