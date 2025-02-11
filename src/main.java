import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


//    int minha idade =20;
//    String nome = arthur
//    var ano = 2006
//    byte =-128a 127
//    short =-32.768a 32.767
//    int =-2.147.483.684a 2.147.483.683
//    long =-9.223.000.000.000.000.000L a 9.223.000.000.000.000.000L
//    botar L no final do numero long
//    float =3.3f
//    double =3.333333...
//    string ="palavras e frases"
//    aspas duplas
//    char ='um unico caracter'
//    uma aspas
//    boolean =true or false

        String[] nomesArr = new String[10];

        nomesArr[0] = "guilherme";
        nomesArr[1] = "arthur";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("pedro");// 0
        nomes.add("gabriel");// 1
        nomes.add("joao");// 2

        System.out.println(nomes.get(0));

    Scanner scan = new Scanner(System.in);
    System.out.println("digite seu nome");;

    }
}