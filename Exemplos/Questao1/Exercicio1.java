import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome = "";
        System.out.printf("Digite o nome:");
        nome = input.next();
        System.out.printf("Números de horas trabalhadas:");
        float horas = Float.parseFloat(input.next());
        System.out.printf("Valor por hora:");
        float valor = Float.parseFloat(input.next());
        float result = valor * horas;
        System.out.printf("Valor a receber: %f \n", result);
        }
    }
