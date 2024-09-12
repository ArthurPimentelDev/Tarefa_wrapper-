import java.util.Scanner;

public class ConversorDeNumero {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número
        System.out.print("Digite um número inteiro: ");
        int numeroPrimitivo = scanner.nextInt(); // Lê o número como um tipo primitivo 'int'

        // Realiza a conversão de 'int' (tipo primitivo) para 'Integer' (tipo wrapper)
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        // Imprime o valor convertido usando o tipo wrapper
        System.out.println("O número convertido para o tipo wrapper Integer é: " + numeroWrapper);

        // Fechar o scanner para evitar vazamento de recurso
        scanner.close();
    }
}
