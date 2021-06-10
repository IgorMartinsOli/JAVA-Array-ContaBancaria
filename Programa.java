/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoconta;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author igor_
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Conta> contas = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        
        int opcaogeral;
        
        //INICIO DA INTERAÇÃO COM USUARIO, DO WHILE DO MENU DE LOGIN E CRIAÇÃO DE CONTAS
        do{
            //MENU INICIAL COM A OPCAO DE CRIAR OU ENTRAR EM CONTA
            System.out.println("         Banco NuCreio");
            System.out.println("|==============================|");
            System.out.println("| 1 - Criar nova conta         |");
            System.out.println("| 2 - Entrar em uma conta      |");
            System.out.println("|==============================|");
            System.out.print(" Digita a operaçaõ desejada: ");
            opcaogeral = scanner.nextInt();
            
            switch(opcaogeral){
                //CRIAÇÃO DA CONTA
                case 1:
                    //VARIAVEIS GENERICAS QUE VAO SER USADAS NA CRIAÇÃO DAS CONTAS
                    Pessoa cliente;
                    int nroConta = Conta.getContasCriadas();
                    int agencia;
                    String nome;
                    String telefone;
                    int opcaoCase1;
                    String cpf;
                    int idPessoa = Pessoa.getQtPessoas();
                    String cnpj;
                    String nomeFantasia;
                    String senha;
                    
                    
                    //MENU DE SELEÇÃO DE TIPO DE CONTA A SER CRIADAS
                    System.out.println("Vamos criar uma conta!");
                    System.out.println("|======================|");
                    System.out.println("| 1 - Corrente         |");
                    System.out.println("| 2 - Empresarial      |");
                    System.out.println("| 3 - Especial         |");
                    System.out.println("| 4 - Poupança         |");
                    System.out.println("|======================|");
                    System.out.print(" Digita a operaçaõ desejada: ");
                    opcaoCase1 = scanner.nextInt();
                    
                    //SWITCH CASE DA CRIAÇÃO DAS CONTAS
                    switch(opcaoCase1){
                        //CRIAR CONTA CORRENTE
                        case 1:
                            System.out.printf("Digite seu nome: ");
                            nome = scanner.next();
                            System.out.printf("Digite seu telefone: ");
                            telefone = scanner.next();
                            System.out.printf("Digite a agência: ");
                            agencia = scanner.nextInt();
                            System.out.printf("Digite seu CPF: ");
                            cpf = scanner.next();
                            System.out.printf("Digite sua senha: ");
                            senha = scanner.next();
                            
                            //CONSTRUTOR DE PESSOA E ACRESCENTA +1 NA CONTAGEM DE PESSOAS
                            PessoaFisica pessoa = new PessoaFisica(idPessoa, nome, telefone, cpf);
                            PessoaFisica.setQtPessoas(idPessoa+1);
                            
                            //CONSTRUTOR DE CONTA E ACRESCENTA +1 NA CONTAGEM DE CONTAS
                            ContaCorrente conta = new ContaCorrente(nroConta, agencia, pessoa, senha);
                            ContaCorrente.setContasCriadas(nroConta +1);
                            
                            //AUMENTA 1 NA QUANTIDADE DE CONTAS CRIADAS
                            Conta.setContasCriadas(Conta.getContasCriadas()+1);
                            contas.add(conta);
                            
                            conta.extrato();
                            break;
                        
                        //CRIA CONTA EMPRESARIAL
                        case 2:
                            System.out.printf("Digite seu nome: ");
                            nome = scanner.next();
                            System.out.printf("Digite seu telefone: ");
                            telefone = scanner.next();
                            System.out.printf("Digite a agência: ");
                            agencia = scanner.nextInt();
                            System.out.printf("Digite seu CNPJ: ");
                            cnpj = scanner.next();
                            System.out.printf("Digite seu nome fantasia: ");
                            nomeFantasia = scanner.next();
                            System.out.printf("Digite sua senha: ");
                            senha = scanner.next();
                            
                            //CONSTRUTOR DE PESSOA E ACRESCENTA +1 NA CONTAGEM DE PESSOAS
                            PessoaJuridica pessoajuridica = new PessoaJuridica(idPessoa, nome, telefone, cnpj, nomeFantasia);
                            PessoaJuridica.setQtPessoas(idPessoa+1);
                            
                            //CONSTRUTOR DE CONTA E ACRESCENTA +1 NA CONTAGEM DE CONTAS
                            ContaEmpresarial contaempresarial = new ContaEmpresarial(nroConta, agencia, pessoajuridica, 0, senha);
                            ContaEmpresarial.setContasCriadas(nroConta +1);
                            
                            //AUMENTA 1 NA QUANTIDADE DE CONTAS CRIADAS
                            Conta.setContasCriadas(Conta.getContasCriadas()+1);
                            contas.add(contaempresarial);
                            
                            contaempresarial.extrato();
                            break;
                            
                        //CRIA CONTA ESPECIAL
                        case 3:
                            System.out.printf("Digite seu nome: ");
                            nome = scanner.next();
                            System.out.printf("Digite seu telefone: ");
                            telefone = scanner.next();
                            System.out.printf("Digite a agência: ");
                            agencia = scanner.nextInt();
                            System.out.printf("Digite seu CPF: ");
                            cpf = scanner.next();
                            System.out.printf("Digite sua senha: ");
                            senha = scanner.next();
                            
                            //CONSTRUTOR DE PESSOA E ACRESCENTA +1 NA CONTAGEM DE PESSOAS
                            PessoaFisica pessoa2 = new PessoaFisica(idPessoa, nome, telefone, cpf);
                            PessoaFisica.setQtPessoas(idPessoa+1);
                            
                            //CONSTRUTOR DE CONTA E ACRESCENTA +1 NA CONTAGEM DE CONTAS
                            ContaEspecial conta2 = new ContaEspecial(nroConta, agencia, pessoa2, 3000, senha);
                            ContaEspecial.setContasCriadas(nroConta +1);
                            
                            //AUMENTA 1 NA QUANTIDADE DE CONTAS CRIADAS
                            Conta.setContasCriadas(Conta.getContasCriadas()+1);
                            contas.add(conta2);
                            
                            conta2.extrato();
                            break;
                            
                            
                        case 4:
                            System.out.printf("Digite seu nome: ");
                            nome = scanner.next();
                            System.out.printf("Digite seu telefone: ");
                            telefone = scanner.next();
                            System.out.printf("Digite a agência: ");
                            agencia = scanner.nextInt();
                            System.out.printf("Digite seu CPF: ");
                            cpf = scanner.next();
                            System.out.printf("Digite sua senha: ");
                            senha = scanner.next();
                            
                            //CONSTRUTOR DE PESSOA E ACRESCENTA +1 NA CONTAGEM DE PESSOAS
                            PessoaFisica pessoa3 = new PessoaFisica(idPessoa, nome, telefone, cpf);
                            PessoaFisica.setQtPessoas(idPessoa+1);
                            
                            //CONSTRUTOR DE CONTA E ACRESCENTA +1 NA CONTAGEM DE CONTAS
                            ContaPoupanca conta3 = new ContaPoupanca(nroConta, agencia, pessoa3, senha);
                            ContaPoupanca.setContasCriadas(nroConta +1);
                            
                            //AUMENTA 1 NA QUANTIDADE DE CONTAS CRIADAS
                            Conta.setContasCriadas(Conta.getContasCriadas()+1);
                            contas.add(conta3);
                            
                            conta3.extrato();
                            break;
                    }
                        
                    break;
                case 2:
                    int usuarioAtual;
                    String senhaAtual;
                    int auxLogin;
                    int auxOpcao;
                    double valor;
                    Conta aulixiar2;
                    int auxCase = 1;
                    
                   
                    do{
                    System.out.println("Digite o numero da conta: ");
                    usuarioAtual = scanner.nextInt();
                    
                    System.out.println("Digite a senha: ");
                    senhaAtual = scanner.next();
                    
                    Conta auxiliar = contas.get(usuarioAtual);
                    
                    if(auxiliar.getCliente() ==  null){
                        auxLogin = 1;
                    }else{
                        if(auxiliar.getSenha() == null ? senhaAtual != null : !auxiliar.getSenha().equals(senhaAtual)){
                            auxLogin = 1;
                        }else{
                            auxLogin = 0;
                        }
                     }
                    }while(auxLogin == 1);
                    
                    Conta auxiliar = contas.get(usuarioAtual);
                    
                    do{
                    System.out.println("   Sua conta NumCreio");
                    System.out.println("|======================|");
                    System.out.println("| 1 - Saque            |");
                    System.out.println("| 2 - Extrato          |");
                    System.out.println("| 3 - Transferencia    |");
                    System.out.println("| 4 - Depositar        |");
                    System.out.println("| 5 - Sair             |");
                    System.out.println("|======================|");
                    System.out.print(" Digita a operaçaõ desejada: ");
                    auxOpcao = scanner.nextInt();
                    
                    switch(auxOpcao){
                        case 1:
                            System.out.println("Digite o valor de saque: ");
                            valor = scanner.nextDouble();
                            
                            if(auxiliar.sacar(valor)){
                                System.out.println("Saque realizado com sucesso");
                            }else{
                                System.out.println("Não é possivel sacar");
                            }
                            break;
                        case 2:
                            auxiliar.extrato();
                            break;
                        case 3:
                            System.out.println("Informe a conta para transferencia: ");
                            usuarioAtual = scanner.nextInt();
                            
                            Conta auxiliar2 = contas.get(usuarioAtual);
                            
                            System.out.println("Digite o valor de transferencia: ");
                            valor = scanner.nextDouble();
                            
                            if(auxiliar.transferir(valor, auxiliar2)){
                                System.out.println("Transferencia realizada com sucesso");
                            }else{
                                System.out.println("Não é possivel transferir");
                            }
                            break;
                        case 4:
                            System.out.println("Digite o valor de deposito: ");
                            valor = scanner.nextDouble();
                            
                            if(auxiliar.depositar(valor)){
                                System.out.println("Deposito feito com sucesso");
                            }else{
                                System.out.println("Não é possivel depositar");
                            }
                            break;
                        
                        case 5:
                            auxCase = 0;
                            break;
                        default:
                            System.out.println("Opção de conta invalida!");
                            break;
                    }
                    
                    }while(auxCase == 1);
                    break;
                     
                default:
                    System.out.println("Opção geral invalida!");
                    break;
            }
        }while(opcaogeral == 1);
    }
}