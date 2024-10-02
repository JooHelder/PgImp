import java.util.Scanner;
public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        // Questão 1
        int soma = 0;
        int[] A = {1, 0 ,5 , -2, -5, 7};
        soma = A[0] + A[1] + A[5];
        System.out.println(soma);
        A[4]= 100;
        for (int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
        // Questão 2

        int [] vetor = new int[5];
        preencherVetor(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        // Questão 3
        double[] vetor = new double[10];
        double[] vetorQuad = new double[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + i + ": ");
            vetor[i] = sc.nextDouble();
            vetorQuad[i] = vetor[i] * vetor[i];
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < vetorQuad.length; i++) {
            System.out.print(vetorQuad[i] + " ");
        }
        // Questão 4
        int[] vetor = new int[8];
        preencherVetor(vetor);
        System.out.print("Escreva uma posição do vetor: ");
        int X = sc.nextInt();
        System.out.print("Escreva outra posição: ");
        int Y = sc.nextInt();
        int soma = 0;
        soma = vetor[X] + vetor[Y];
        System.out.println("O resultado da soma dos números na posição indicada é: " + soma);

        // Questão 5
        int[] vetor = new int[10];
        int contadorPar = 0;
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Número " + i + ": ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0){
                contadorPar++;
            }
        }
        System.out.println("Seu vetor tem "+ contadorPar + " números pares");

        // Questão 6
        int[] vetor = new int[10];
        preencherVetor(vetor);
        int num = vetor[0];
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > num){
                num = vetor[i];
            }
        }
        System.out.println("O maior valor é: " + num);
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < num){
                num = vetor[i];
            }
        }
        System.out.println("O menor número é: " + num);

        // Questão 7
        int[] vetor = new int[3];
        int numMaior = vetor[0];
        int pos = 0;
        preencherVetor(vetor);
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > numMaior){
                numMaior = vetor[i];
                pos = i;
            }
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("O número maior é: " + numMaior);
        System.out.println("Está na posição: " + pos);

        // Questão 8
        int[] vetor = new int[6];
        preencherVetor(vetor);
        for (int i = 5; i >=0; i--){
            System.out.print(vetor[i] + " ");
        }*/


        // Questão 9
        int[] vetor = new int[6];
        int count = 0;
        while (count < vetor.length){
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Vetor" + " [" + i + "]: ");
                int valor = sc.nextInt();
                if (valor % 2 == 0) {
                    vetor[count] = valor;
                    count++;
                } else {
                    System.out.println("Por favor, digite um número par.");
                }
            }
        }
        for (int i = 5; i >=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
    
    public static void preencherVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Número " + i + ": ");
            vetor[i] = sc.nextInt();
        }
    }
}