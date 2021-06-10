/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoconta;

/**
 *
 * @author igor_
 */
public abstract class Pessoa {
   private static int qtPessoas;
   private int idPessoa;
   private String nome;
   private String telefone;

   public Pessoa(int idPessoa, String nome, String telefone) {
      this.idPessoa = idPessoa;
      this.nome = nome;
      this.telefone = telefone;
   }
   
   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getTelefone() {
      return this.telefone;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }
   
   public int getIdPessoa() {
       return idPessoa;
   }
    
   public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
   }
   
    public static int getQtPessoas() {
        return qtPessoas;
    }

    public static void setQtPessoas(int aQtPessoas) {
        qtPessoas = aQtPessoas;
    }
}
