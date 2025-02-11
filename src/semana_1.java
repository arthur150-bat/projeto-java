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
}
