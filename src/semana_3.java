import java.util.Scanner;
import javax.swing.JOptionPane;
public class semana_3 {
    public static class contagemprogressiva {
        public static void main(String[] args) {
            Scanner n1 = new Scanner(System.in);
            System.out.println("digite um número");
            int num1 = n1.nextInt();
            for (int i=1;i<num1;i++){
                System.out.println(i);
            }
        }
    }
    public static class tabuada {
        public static void main(String[] args) {
            Scanner n1 = new Scanner(System.in);
            System.out.println("digite um número para a tabuada");
            int num1 = n1.nextInt();
            for(int i = 1;i<=10;i++){
                System.out.println(i*num1);

            }
        }
    }
    public static class somar_numeros {
        public static void main(String[] args) {
            Scanner n1 = new Scanner(System.in);
            System.out.println("digite um número para a sequência");
            int num1 = n1.nextInt();
            int soma = 0;
            for (int i=1;i<=num1;i++){
                soma +=i;
            }
            System.out.println(soma);
        }
    }
    public static class ImprimirSequência {
        public static void main(String[] args) {
            Scanner n1 = new Scanner(System.in);
            System.out.println("digite um número");
            int num1 = n1.nextInt();
            for (int i=1;i<=num1;i+=2){
                System.out.println(i);
            }
        }
    }
    public static class Exibir_Números_Pares {
        public static void main(String[] args) {
            Scanner n1 = new Scanner(System.in);
            System.out.println("digite um número");
            int num1 = n1.nextInt();
            for (int i=0;i<=num1;i+=2){
                System.out.println(i);
            }
        }
    }
    public static class Escolher_a_Cor_do_Semáforo {
        public static void main(String[] args) {
            Scanner n1 = new Scanner(System.in);
            System.out.println("digite um número");
            int num1 = n1.nextInt();
            switch (num1){
                case 1:
                    System.out.println("Vermelho");
                    break;
                case 2:
                    System.out.println("Amarelo");
                    break;
                case 3:
                    System.out.println("Verde");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
    public static class MenuOpcoes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("MENU DE OPÇÕES");
                System.out.println("1. Exibir Ação 1");
                System.out.println("2. Exibir Ação 2");
                System.out.println("3. Exibir Ação 3");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        break;
                    case 2:
                        System.out.println("Ação 2");
                        break;
                    case 3:
                        System.out.println("Ação 3");
                        break;
                    case 4:
                        System.out.println("Saindo");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            } while (opcao != 4);
        }
    }
    public static class NumerosImpares {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.print(i+"-");
            }
        }
    }
    public static class EscolhaComida {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int escolha;
            do {
                System.out.println("MENU DE COMIDA");
                System.out.println("1. Pizza");
                System.out.println("2. Hambúrguer");
                System.out.println("3. Sushi");
                System.out.print("Escolha um prato (1-3): ");
                escolha = scanner.nextInt();
                if (escolha < 1 || escolha > 3) {
                    System.out.println("Opção inválida! Tente novamente");
                }
            } while (escolha < 1 || escolha > 3);
            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu: Pizza! ");
                    break;
                case 2:
                    System.out.println("Você escolheu: Hambúrguer! ");
                    break;
                case 3:
                    System.out.println("Você escolheu: Sushi! ");
                    break;
            }
        }
    }
    public static class BoasVindas {
        public static void main(String[] args) {
            String nome = JOptionPane.showInputDialog("Digite seu nome:");
            JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome);
        }
    }
    public static class CalculadoraSimples {
        public static void main(String[] args) {
            String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
            double numero1 = Double.parseDouble(input1); // Converte para número
            String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
            double numero2 = Double.parseDouble(input2); // Converte para número
            String operacao = JOptionPane.showInputDialog("Escolha a operação (+, -, *, /):");
            double resultado;
            String mensagem;
            switch (operacao) {
                case "+":
                    resultado = numero1 + numero2;
                    mensagem = "Resultado: " + numero1 + " + " + numero2 + " = " + resultado;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    mensagem = "Resultado: " + numero1 + " - " + numero2 + " = " + resultado;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    mensagem = "Resultado: " + resultado;
                    break;
                case "/":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        mensagem = "Resultado: " + numero1 + " / " + numero2 + " = " + resultado;
                    } else {
                        mensagem = "Erro: Divisão por zero não é permitida!";
                    }
                    break;
                default:
                    mensagem = "Operação inválida! Use +, -, * ou /.";
            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
    public static class ConversaoTemperatura {
        public static void main(String[] args) {
            String input = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:");
            double celsius = Double.parseDouble(input);
            double fahrenheit = (celsius * 9/5) + 32;
            JOptionPane.showMessageDialog(null, celsius + "°C equivale a " + fahrenheit + "°F.");
        }
    }
    public static class ParOuImpar {
        public static void main(String[] args) {
            String input = JOptionPane.showInputDialog("Digite um número inteiro:");
            int numero = Integer.parseInt(input);
            String mensagem = (numero % 2 == 0)
                    ? "O número " + numero + " é PAR."
                    : "O número " + numero + " é ÍMPAR.";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
    public static class CalculandoMedia {
        public static void main(String[] args) {
            String nota1 = JOptionPane.showInputDialog("Digite a primeira nota:");
            String nota2 = JOptionPane.showInputDialog("Digite a segunda nota:");
            String nota3 = JOptionPane.showInputDialog("Digite a terceira nota:");
            double n1 = Double.parseDouble(nota1);
            double n2 = Double.parseDouble(nota2);
            double n3 = Double.parseDouble(nota3);
            double media = (n1 + n2 + n3) / 3;
            JOptionPane.showMessageDialog(null, "A média das notas é: " + String.format("%.2f", media));
        }
    }
}
