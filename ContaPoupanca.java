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
public class ContaPoupanca extends ContaCorrente{
    
   public ContaPoupanca(int nroConta, int agencia, PessoaFisica cliente, String senha) {
      super(nroConta, agencia, cliente, senha);
   }

   public void render(){
      Double saldo = super.getSaldo();
      super.setSaldo(saldo * 1.005);
   }
}
