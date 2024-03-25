public class buscaSequencial {

    
    private int posicao;
    
    
    public buscaSequencial() {
    }

    
    public int buscarSequencial(int[] array, int numero) {
        for (int i=0; i<array.length; i++) {
            if ( array[i] == numero) {
                posicao = i;
                return posicao;
            }
        }
        return -1;
    }

    
    public int pegarTamanhoDoArray(int[] array, int numeroQuatro) {
        int tamanhoArray = 0;
        for (int j=0;j< array.length; j++) {
            if ( array[j] == numeroQuatro) {
             tamanhoArray++;
        }
        }
        return tamanhoArray;
    }


    
    public void encontrarIndices(int[] array, int numeroQuatro, int[] posicoes) {
        int c = 0;
        for (int i=0; i<array.length; i++) {
            if ( array[i] == numeroQuatro) {
                posicoes[c] = i;
                c += 1;
            }
        }
    }


}   