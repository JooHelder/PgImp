import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] v = new int[10];
        System.out.println("Digite 10 valores: ");
        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextInt();
        }
        boolean ordenado = verificaOrdenacao(v);
        if (ordenado) {
            System.out.println("O vetor está ordenado.");
        } else {
            System.out.println("O vetor não está ordenado.");
        }
        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite um elemento para buscar: ");
            int elemento = sc.nextInt();

            if (ordenado) {
                int posicao = buscaMelhorada(v, elemento);
                if (posicao != -1) {
                    System.out.println("Elemento encontrado na posição: " + posicao);
                } else {
                    System.out.println("Elemento não encontrado.");
                }
            } else {
                int posicao = buscaSimples(v, elemento);
                if (posicao != -1) {
                    System.out.println("Elemento encontrado na posição: " + posicao);
                } else {
                    System.out.println("Elemento não encontrado.");
                }
            }

            System.out.print("Deseja continuar a busca? (s/n): ");
            char resposta = sc.next().charAt(0);
            continuar = (resposta == 's' || resposta == 'S');
        }
    }
    public static boolean verificaOrdenacao(int[] v) {
        for (int i = 1; i < v.length; i++) {
            if (v[i] < v[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static int buscaSimples(int[] v, int x){
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static int buscaMelhorada(int[] v, int x) {
        int esquerda = 0;
        int direita = v.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (v[meio] == x) {
                return meio;
            }
            if (v[meio] < x) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -1;
    }
}