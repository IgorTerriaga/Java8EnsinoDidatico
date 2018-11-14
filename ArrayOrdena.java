import java.util.*;

public class ArrayOrdena {
    public static void main(String[] args) {
        String[] nomes = { "Lucas", "Daniel", "Julia", "tatiana", "Izabela", "Matheus" };
        //String [] noa = new String [1];
        char[] vogais = { 'i', 'u', 'a', 'o', 'e' };
        int[] numeros = { 9, 2, 6, 7, 5, 3, 4, 8, 1, 0 };
        float[] notas = { 7.6f, 8.5f, 9.7f, 5, 4f, 7, 4f };
        Arrays.sort(nomes);

        System.out.println("\nNomes: ");
        for (String nome : nomes) {
            System.out.println(nome + ", ");
        }

        Arrays.sort(vogais);
        System.out.println("\nVogais: ");
        for (char vogs : vogais) {
            System.out.println(vogs + ", ");
        }

        Arrays.sort(numeros);
        System.out.println("\nNumeros: ");
        for (int n : numeros) {
            System.out.println(n + ", ");
        }
        System.out.println("\nNotas: ");
        Arrays.sort(notas);
        for (float n : notas) {
            System.out.println(n + ", ");

        }
        System.exit(0);
    }
}