import java.util.Scanner;

public class Desafio{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.printf("Digite um número inteiro:");
       int num = Integer.parseInt(input.next());
       int i = num;
       String bin = "";
       while(num!= 0){
           bin = bin + num % 2;
           num = num/2;
       }
       StringBuffer stBu = new StringBuffer(bin);
       sb.reverse();
       System.out.printf("O número %d convertido era: %s \n",i, stBu);
    }
}
