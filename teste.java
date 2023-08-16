import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        Person pessoa = new Person(idade, nome);
        pessoa.ola();

        // Fechar o scanner
        scanner.close();
    }
    
}
