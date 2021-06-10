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
public class PessoaFisica extends Pessoa{
    
    private String cpf;

   public PessoaFisica(int idPessoa, String nome, String telefone, String cpf) {
      super(idPessoa, nome, telefone);
      this.cpf = cpf;
   }
   
   public String getCpf() {
      return this.cpf;
   }

   public void setCpf(String cpf) {
      this.cpf = cpf;
   }
    
}
