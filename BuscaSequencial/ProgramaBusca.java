public class ProgramaBusca {
    public static void main(String[] args) {

        
        buscaSequencial busca = new buscaSequencial();
        
        
        int[] listaNumeros = { 40, 63, 40, 36, 10, 89, 74,
            32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52,
            25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19,
            33, 21, 57, 19, 55, 93, 31, 54, 31, 50,
            66, 44, 54, 55, 29, 75, 43, 88, 61, 65,
            49, 87, 10, 25, 33, 70, 84, 125, 345, 400,
            77, 32, 41, 66, 33, 70, 84, 125, 600,
            38, 43, 51, 34, 76, 25, 48, 14, 50, 71,
            1, 98, 86, 38, 91, 65, 96, 60, 43, 75,
            86, 59, 17, 86, 12, 10, 16, 10, 33, 15,
            77, 22, 56, 4, 9, 63, 49, 80, 39, 53,
            97, 36, 34, 16, 1, 98, 78, 92, 100, 35};

            
            int numeroUm = 77, numeroDois = 600, numeroTres = 56, numeroQuatro = 65;

     
            int result = busca.buscarSequencial(listaNumeros, numeroUm);
            if (result > -1 ) {
                System.out.println("\nO número " + numeroUm + " está na posição: " + result);
            } else {
                System.out.println("Não contém este número no array!!");
            }

     
            int resultDois = busca.buscarSequencial(listaNumeros, numeroDois);
            if (resultDois > -1 ) {
                System.out.println("\nO número " + numeroDois + " está na posição: " + resultDois);
            } else {
                System.out.println("Não contém este número no array!!");
            }
            
     
            int resultTres = busca.buscarSequencial(listaNumeros, numeroTres);
            if (resultTres > -1 ) {
                System.out.println("\nO número " + numeroTres + " está na posição: " + resultTres);
            } else {
                System.out.println("Não contém este número no array!!");
            }

     
             int resultQuatro = busca.buscarSequencial(listaNumeros, numeroQuatro);
             if (resultQuatro > -1 ) {
                 System.out.println("\nO número " + numeroQuatro + " está na posição: " + resultQuatro);
             } else {
                 System.out.println("Não contém este número no array!!");
             }

     
            int tamanho = busca.pegarTamanhoDoArray(listaNumeros, numeroQuatro);

            
            int[] posicoes = new int[tamanho];

            
            busca.encontrarIndices(listaNumeros, numeroQuatro, posicoes);

            
             System.out.println("\nPosições do número 65 no array: ");
             for (int i =0; i<posicoes.length; i++) {
                System.out.println(posicoes[i]);

            }
            
    }
    
}