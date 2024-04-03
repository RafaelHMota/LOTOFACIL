import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao;

        // Mostra o menu
        do {
            System.out.println("|*****************************|");
            System.out.println("|       Menu LotoFacil:       |");
            System.out.println("| 1)Apostar de 0 a 100        |");
            System.out.println("| 2)Apostar de A a Z          |");
            System.out.println("| 3)Apostar em Par ou Impar   |");
            System.out.println("| 0)Sair                      |");
            System.out.println("|*****************************|");
            System.out.println("Escolher uma opcao:           ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    apostarDe0a100(scanner, random);
                    break;
                case 2:
                    apostaDeAaZ(scanner);
                    break;
                case 3:
                    apostarParouImpar(scanner);
                    break;
                case 0:
                    System.out.println("Obrigado por jogar!!.");
            }
        } while (opcao != 0);
        scanner.close();
    }

    // Metodo para apostar de 0 a 100
    public static void apostarDe0a100(Scanner scanner, Random random) {
        System.out.print("Digite um numero de 0 a 100:");
        int aposta = scanner.nextInt();

        // Verifica se a aposta esta dentro do intervalo valido
        if (aposta < 0 || aposta > 100) {
            System.out.println("Aposta invalida.");
            return;
        }

        int numeroSorteado = random.nextInt(101);

        // Verifica se a aposta foi correta
        if (aposta == numeroSorteado) {
            System.out.println("Voce ganhou R$ 1.000,00 reais.");
        } else {
            System.out.println("Que pena! O numero sorteado foi:" + numeroSorteado + ".");
        }
    }
    // Metodo para apostar de A a Z
    public static void apostaDeAaZ(Scanner scanner) {
        System.out.print("Digite uma letra de A a Z:");
        char aposta =
        Character.toUpperCase(scanner.next().charAt(0));
        // Verifica se a aposta foi correta
        if (!Character.isLetter(aposta)) {
            System.out.println("Aposta invalida.");
            return;
        }
        char letraPremiada = 'R';
        // Verifica se a aposta foi correta
        if (aposta == letraPremiada) {
            System.out.println("Voce ganhou R$ 500,00 reais.");
        } else {
            System.out.println("Que pena! A letra sorteada foi" + letraPremiada + ".");
        }
    }
    // Metodo para apostar em Par ou Impar
    public static void apostarParouImpar(Scanner scanner) {
        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        // Verifica se o numero e par ou impar
        if (numero % 2 == 0) {
            System.out.println("Voce ganhou R$ 100,00 reais.");
        } else {
            System.out.println("Que pena! O numero digitado e impar e a premiacao foi para os numeros pares.");
        }
    }
}
