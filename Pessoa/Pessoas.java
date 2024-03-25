import java.util.ArrayList;

public class Pessoas {

    private String nome;
    private int idade;

   
    public Pessoas() {
    }

   
    public void buscarIdadeEspecifca(ArrayList<Pessoas> listaDePessoas, int idadeDesejada) {
       for (Pessoas p: listaDePessoas) {
        if (p.getIdade() == idadeDesejada) {
            System.out.println("\nA pessoa que tem " + idadeDesejada + " anos é a " + p.getNome());
        }
      }
    }

     
     public void buscarIdade(ArrayList<Pessoas> listaDePessoas, int idadeDesejada) {
        System.out.println("\nAs pessoas que tem mais de " + idadeDesejada + " anos são:");
        for (Pessoas p: listaDePessoas) {
         if (p.getIdade() > idadeDesejada) {
             System.out.println(p.getNome());
         }
       }
     }

     
     public void alterarIdade(ArrayList<Pessoas> listaDePessoas) {
        for (Pessoas p : listaDePessoas) {
            p.setIdade(18);
        } 
     }

    
    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}