import java.util.Scanner;
public class semana_2 {
    public static class nsiguais {
        public static void main(String[] args) {
            Scanner n1 = new Scanner(System.in);
            System.out.println("digite o número");
            int num1 = n1.nextInt();
            Scanner n2 = new Scanner(System.in);
            System.out.println("digite o número");
            int num2 = n2.nextInt();
            if(num1==num2){
                System.out.println("os números são iguais");
            }
            else{
                System.out.println("os números são diferentes");
            }
        }
    }
    public static class maioroigual {
        public static void main(String[] args) {
            Scanner n1 = new Scanner(System.in);
            System.out.println("digite o número 1");
            int num1 = n1.nextInt();
            Scanner n2 = new Scanner(System.in);
            System.out.println("digite o número 2");
            int num2 = n2.nextInt();
            if(num1>num2){
                System.out.println("o numero 1 é maior que o numero 2");
            }
            else if (num1 == num2){
                System.out.println("os números são iguais");
            }
        }
    }
    public static class maiornum {
        public static void main(String[] args) {
            Scanner n1 = new Scanner(System.in);
            System.out.println("digite o número 1");
            int num1 = n1.nextInt();
            Scanner n2 = new Scanner(System.in);
            System.out.println("digite o número 2");
            int num2 = n2.nextInt();
            if(num1>num2){
                System.out.println("o numero 1 é maior que o numero 2");
            }
            else if (num1 < num2){
                System.out.println("o numero 2 é maior que o numero 1");
            }
        }
    }
    public static class incremento {
        public static void main(String[] args) {
            int saldo = 500;
            while(saldo<600){
                saldo+=2;}
            System.out.println(saldo);

        }
    }
    public static class desconto {
        public static void main(String[] args) {
            double preco = 150.0;
            preco *= 0.9;
            System.out.println(preco);
        }
    }
    public static class IncrementoDecremento {
        public static void main(String[] args) {
            int x = 10;
            System.out.println(x++);
            System.out.println(x);
            System.out.println(++x);
            System.out.println(x--);
            System.out.println(x);
            System.out.println(--x);
        }
    }
    public static class LoginSistem {
        public static void main(String[] args) {
            final String senha = "1234";
            int tentativas = 5;
            Scanner scanner = new Scanner(System.in);
            while (tentativas > 0) {
                System.out.print("Digite a senha: ");
                String senhaDigitada = scanner.nextLine();
                if (senhaDigitada.equals(senha)) {
                    System.out.println("Login bem-sucedido!");
                    break;
                } else {
                    tentativas--;
                    if (tentativas > 0) {
                        System.out.println("Senha incorreta! Tentativas restantes: " + tentativas);
                    } else {
                        System.out.println("Conta bloqueada! Tentativas esgotadas.");
                    }
                }
            }
        }
    }
    public static class opternario {
        public static void main(String[] args) {
            Scanner n1 = new Scanner(System.in);
            System.out.println("digite sua idade");
            int num1 = n1.nextInt();
            String maioridade = num1>=18 ? "Você é maior de idade" : "Você é menor de idade";
            System.out.println(maioridade);
        }
    }
    public static class VerificaNumero {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();
            if (numero > 0) {
                System.out.println("O número é positivo.");
            } else if (numero < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            }
        }
    }
    public static class ClassificacaoAluno {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            if (nota >= 7) {
                System.out.println("Aprovado");
            } else if (nota >= 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
    public static class DescontoEstudante {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Você tem mais de 18 anos? (true/false): ");
            boolean maiorDe18 = scanner.nextBoolean();
            System.out.print("Você é estudante? (true/false): ");
            boolean estudante = scanner.nextBoolean();
            if (maiorDe18 && estudante) {
                System.out.println("tem direito ao desconto!");
            } else {
                System.out.println("não tem direito ao desconto.");
            }
        }
    }
    public static class imprimir {
        public static void main(String[] args) {
            int num = 0;
            while(num<100){
                num++;
                System.out.println(num);
            }
        }
    }
    public static class imprimi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            int inicio = 0;
            while (inicio<numero){
                inicio++;
                System.out.println(inicio);
            }
        }
    }
    public static class SomaDosAnteriores {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            int soma = 0;

            for (int i = 1; i <= num; i++) {
                soma += i;
            }
            System.out.println("A soma dos números de 1 até " + num + " é: " + soma);
        }
    }
    public static class SenhaCorreta {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String senhaCorreta = "1234";
            String senhaInformada;
            do {
                System.out.print("Digite a senha: ");
                senhaInformada = scanner.nextLine();
            } while (!senhaInformada.equals(senhaCorreta));
            System.out.println("Senha correta! Acesso liberado.");
        }
    }
    public static class RepetirAcao {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int repeticoes;
            do {
                System.out.print("Quantas vezes deseja repetir a ação? (valor > 0): ");
                repeticoes = scanner.nextInt();
            } while (repeticoes <= 0);
            for (int i = 1; i <= repeticoes; i++) {
                System.out.println("Executando ação número " + i);
            }
        }
    }

}
