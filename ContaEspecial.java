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
public class ContaEspecial extends Conta{
    
   public ContaEspecial(int nroConta, int agencia, PessoaFisica cliente, double chequeEspecial, String senha) {
      super(nroConta, agencia, cliente, chequeEspecial, senha);
   }

   @Override
   public void setCliente(Pessoa cliente) {
      if(cliente.getClass().equals(PessoaFisica.class)){
         super.setCliente(cliente);
      }
   }
}
