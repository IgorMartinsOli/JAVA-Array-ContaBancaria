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
public class ContaCorrente extends Conta{
       public ContaCorrente(int nroConta, int agencia, PessoaFisica cliente, String senha) {
      super(nroConta, agencia, cliente, 0.0, senha);
   }

   @Override
   public void setCliente(Pessoa cliente) {
      if(cliente.getClass().equals(PessoaFisica.class)){
         super.setCliente(cliente);
      }
   }

   @Override
   public void setChequeEspecial(double chequeEspecial) {}
    
}
