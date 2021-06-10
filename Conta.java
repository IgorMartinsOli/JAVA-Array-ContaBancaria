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
public abstract class Conta {

   private static int contasCriadas;
   private Pessoa cliente;
   private int nroConta;
   private int agencia;
   private double saldo;
   private double chequeEspecial;
   private String senha;

   public Conta(int nroConta, int agencia, Pessoa cliente, double chequeEspecial, String senha) {
      this.nroConta = nroConta;
      this.agencia = agencia;
      this.cliente = cliente;
      this.saldo = 0.0;
      this.chequeEspecial = chequeEspecial;
      this.senha = senha;
   }
   
   public int getNroConta() {
      return this.nroConta;
   }
   
   public void setNroConta(int nroConta) {
      this.nroConta = nroConta;
   }
   
   public int getAgencia() {
      return this.agencia;
   }
   
   public void setAgencia(int agencia) {
      this.agencia = agencia;
   }
   
   public double getSaldo() {
      return this.saldo;
   }
   
   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }
   
   public void extrato(){
      System.out.println("Nro Conta: "+this.nroConta+" - Saldo: "+ this.saldo);
   }
   
   public Pessoa getCliente() {
      return this.cliente;
   }
   
   public void setCliente(Pessoa cliente) {
      this.cliente = cliente;
   }
   
   public double getChequeEspecial() {
      return this.chequeEspecial;
   }
   
   public void setChequeEspecial(double chequeEspecial) {
      this.chequeEspecial = chequeEspecial;
   }
   
    public static int getContasCriadas() {
        return contasCriadas;
    }
    
    public static void setContasCriadas(int aContasCriadas) {
        contasCriadas = aContasCriadas;
    }
    
        public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
   //Depositar
   public boolean depositar(double valor){
      if(valor > 0){
         this.saldo += valor;
         System.out.println("Deposito realizado com sucesso!");
         return true;
      }else{
         System.out.println("Não foi possível realizar o deposito!");
         return false;
      }
   }
   
   public boolean transferir(double valor, Conta conta){
      if(this.sacar(valor)){
         conta.depositar(valor);
         System.out.println("Transferência realizada com sucesso!");
         return true;
      }else{
         System.out.println("Não foi possível realizar a transferencia!");
         return false;
      }
   }
   
   public boolean sacar(double valor){
      if(valor>0 && valor <= this.saldo+this.chequeEspecial){
         this.saldo = this.saldo - valor;
         System.out.println("Saque realizado com sucesso!");
         return true;
      }else{
         System.out.println("Não foi possível realizar o saque!");
         return false;
      }
   }
   

}
