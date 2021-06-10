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
public class PessoaJuridica extends Pessoa{
   private String cnpj;
   private String nomeFantasia;

   public PessoaJuridica(int idPessoa, String nome, String telefone, String cnpj, String nomeFantasia) {
      super(idPessoa, nome, telefone);
      this.cnpj = cnpj;
      this.nomeFantasia = nomeFantasia;
   }

   public String getCnpj() {
      return this.cnpj;
   }

   public void setCnpj(String cnpj) {
      this.cnpj = cnpj;
   }

   public String getNomeFantasia() {
      return this.nomeFantasia;
   }

   public void setNomeFantasia(String nomeFantasia) {
      this.nomeFantasia = nomeFantasia;
   }
    
}
