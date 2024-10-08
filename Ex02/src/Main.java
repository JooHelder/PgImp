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
        }

        // Questão 9
        int[] vetor = new int[6];
        int contador = 0;
        while (contador < 6) {
            System.out.print("Digite um valor inteiro par para o vetor [" + contador + "]: " );
            int valor = sc.nextInt();

            if (valor % 2 == 0) { // Verifica se o número é par
                vetor[contador] = valor; // Armazena o valor no array
                contador++; // Incrementa o contador
            } else {
                System.out.println("Valor inválido! Por favor, digite um número par.");
            }
        }
        for (int i = vetor.length - 1; i >=0; i--){
            System.out.print(vetor[i] + " ");
        }

        // Questão 10
        int[] vetor = new int[15];
        double media = 0.0;
        double soma = 0.0;
        preencherVetor(vetor);
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
            media = soma / vetor.length;
        }
        System.out.println(media);


        // Questão 11
        double[] vetor = new double[10];
        int quantNegativo = 0;
        double somaPositivos = 0.0;
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Vetor real[" + i + "]: ");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 0; i < vetor.length; i ++){
            if (vetor[i] < 0){
                quantNegativo++;
            } else {
                somaPositivos += vetor[i];
            }
        }
        System.out.println("Quantidade de números negativos: " + quantNegativo);
        System.out.println("Soma dos números positivos: " + somaPositivos);


        // Questão 12
        double[] vetor = new double[5];
        preencherVetorDouble(vetor);
        double maior = vetor[0];
        double menor = vetor[0];
        double soma = 0;
        double media = 0;
        for (int i =0; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
            }
            else if (vetor[i] < menor){
                menor = vetor[i];
            }
            soma += vetor[i];
        }
        for (int i =0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        media = soma / vetor.length;
        System.out.println();
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média é: " + media);

        // Questão 13
        double[] vetor = new double[5];
        preencherVetorDouble(vetor);
        double maior = vetor[0];
        double menor = vetor[0];
        int posMaior = 0, posMenor = 0;
        for (int i =0; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
                posMaior = i;
            }
            if (vetor[i] < menor){
                menor = vetor[i];
                posMenor = i;
            }
        }
        System.out.println("O maior valor é " + maior + " e está na posição " + posMaior);
        System.out.println("O menor valor é " + menor + " e está na posição " + posMenor);*/

        // Questão 14
        int[] vetor = new int[10];
        preencherVetor(vetor);
        for (int i = 0; i < vetor.length; i++){
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[i] == vetor[j]){
                    System.out.println("Valor " + vetor[i] + " se repete nas posições " + i +  " e " + j);
                }
            }
        }
    }
    
    public static void preencherVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Vetor " + i + ": ");
            vetor[i] = sc.nextInt();
        }
    }

    public static void preencherVetorDouble(double[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Vetor " + i + ": ");
            vetor[i] = sc.nextDouble();
        }
    }
}