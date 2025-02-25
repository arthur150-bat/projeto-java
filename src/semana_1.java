import java.util.Scanner;
public class semana_1 {
    public static class idade {
        public static void main(String[] args) {
            byte idade_pessoa = 20;
        }
    }

    public static class valor_pi{
        public static void main(String[] args) {
            double valor_pi = 3.14159;
            System.out.println(valor_pi);
        }
    }

    public static class nome_profissão {
        public static void main(String[] args) {
            String nome = "Arthur";
            String profissao = "programador";
            System.out.println(" nome: " + nome + " profissão: " + profissao );
        }
    }

    public static class operações {
        public static void main(String[] args) {
            int n1 = 10;
            int n2 = 5;
            int soma = n1 + n2;
            int v = n1 * n2;
            int div = n1 / n2;
            System.out.println(" soma = " + soma + " multiplicação = " + v + " divisão = " + div);
        }
    }

    public static class variaveis {
        public static void main(String[] args) {
            byte b1 = 127;
            short s1 = 32767;
            int i1 = 2147483647;
            long l = 9223000000000000000L;
            float f = 3.3f;
            double d = 3.33333333333;
            char c = 'a';
            boolean b = true;
            System.out.println("byte = " + b1);
            System.out.println("short = " + s1);
            System.out.println("int = " + i1);
            System.out.println("long = " + l);
            System.out.println("float = " + f);
            System.out.println("double = " + d);
            System.out.println("char = " + c);
            System.out.println("boolean = " + b);
        }
    }

    public static class divisao_int_double {
        public static void main(String[] args) {
            int i2 = 10;
            double d3 = 3.33333333333333333333333333;
            double divisao = i2 / d3;
            System.out.println(divisao);
        }
    }
    public static class converterwrap {
        public static void main(String[] args) {
            Integer a = 19;
            int meuIntPrimitivo = a.intValue();
        }
    }
    public static class doubletodouble {
        public static void main(String[] args) {
            double fd = 3.343434;
            String conversão = String.valueOf(fd);
            System.out.println(conversão);
        }
    }
    public static class doubletodoub {
        public static void main(String[] args) {
        double a = 9.99999;
        int valordob = (int) a;
        System.out.println(a);
        System.out.println(valordob);
        }
    }
    public static class intconparse {
        public static void main(String[] args) {
            String numero = "10";
            int valor = Integer.parseInt(numero);
        }
    }
    public static class mediaaritimetica {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("valor 1:");
            int num1 = scanner.nextInt();
            System.out.println("valor 2:");
            int num2 = scanner.nextInt();
            System.out.println("valor 3:");
            int num3 = scanner.nextInt();
            int media = (num1+num2+num3)/3;
            System.out.println(media);

        }
    }
    public static class raiocirculo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("valor do raio:");
            float raio = scanner.nextInt();
            float area = (float) (raio * raio * Math.PI);
            System.out.println(area);
        }
    }
    public static class seepar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            boolean resultado = (num % 2 == 0) && true;
            System.out.println("Resultado da expressão (num % 2 == 0) && true: " + resultado);
            System.out.println("Explicação:");
            System.out.println("1. num % 2 == 0 verifica se o número é par.");
            System.out.println("2. true é sempre verdadeiro.");
            System.out.println("3. A expressão usa o operador lógico '&&' (E), que só retorna true se ambas as partes forem verdadeiras.");
            System.out.println("4. Se o número for par, a expressão será true; caso contrário, será false.");

        }
    }
    public static class gctofh {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a temperatura em graus celcius: ");
            double celsius = scanner.nextInt();
            double fahrenheit = (celsius * 9/5) + 32.;
            System.out.print(fahrenheit);
        }
    }
    public static class maioridade {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            boolean maiorDeIdade = (idade >= 18);
            System.out.println("É maior de idade? " + maiorDeIdade);
        }
    }
    public static class bolintervalo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("digite um numero para estar no intervalo de 10 e 50: ");
            int num = scanner.nextInt();
            boolean intervalo = (num >= 10 && num <= 50);
            System.out.println("esta no intervalo? " + intervalo);
        }
    }
    public static class acesso {
        public static void main(String[] args) {
            boolean acessoPermitido;
            Scanner scanner = new Scanner(System.in);
            System.out.print("digite o usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("digite a senha: ");
            String senha = String.valueOf(scanner.nextInt());
            boolean permissao = (usuario.equals("admin") && senha.equals("1234"));
            System.out.println(" acesso " + permissao);
        }
    }
    public static class positnuloneg {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("digite um numero: ");
            int num = scanner.nextInt();
            boolean positivo = (num>0);
            boolean negativo = (num<0);
            boolean nulo = (num==0);
            System.out.println("o numero é positivo?" + positivo);
            System.out.println("o numero é negativo?" + negativo);
            System.out.println("o numero é nulo?" + nulo);
        }
    }
    public static class aprovado {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite sua nota: ");
            int nota = scanner.nextInt();
            boolean aprovado = (nota >= 6);
            System.out.println("foi aprovado? " + aprovado);
        }
    }
}
