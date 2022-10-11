import java.util.Scanner;
        
public class entrada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um número: ");
        numero = input.nextInt();
        
        System.out.printf("O número informado foi " + numero + ".\n");
        
    }
}

