/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BicicletariaVetor;

import java.util.Scanner;

/**
 *
 * @author Nathanelisabetinho
 */
class clientes {

    int codigoCliente;
    String nome;
    String telefone;
    String endereço;
    String cidade;
    String estado;
    String cpf;
    String rg;
    String email;

    Scanner Ler = new Scanner(System.in);

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrar() {
        System.out.println("INFORME O NOME");
        nome = Ler.next();
        this.nome = nome;
        System.out.println("INFORME O ID");
        codigoCliente = Ler.nextInt();
        this.codigoCliente = codigoCliente;
        
        System.out.println("Cliente cadastrado com sucesso");
        System.out.println("------------------------------");

    }

    public static void editar() {

    }

    void excluirCliente(int codigoInformado) {
        
        if(this.codigoCliente == codigoInformado){
        System.out.println("############################");
        System.out.println(this.nome = null);
        System.out.println(this.codigoCliente = 0);
        System.out.println("O CADASTRO DO CLIENTE FOI ENCONTRADO VAMOS EXCLUIR");

        System.out.println("O CADASTRO FOI EXCLUIDO");
        System.out.println("-----------------------");
        }

    }
    
    public static void verificarCadastro(){
    
    }
    
    void buscarCliente(int codigoInformado){
        if(this.codigoCliente == codigoInformado){
        System.out.println("############################");
        System.out.println("O CADASTRO DO CLIENTE FOI ENCONTRADO");
        System.out.println("Nome :" + this.nome );
        System.out.println("Saldo :" + this.codigoCliente );
        }
        else{
        System.out.println("ERRO");
        System.out.println("O CADASTRO NÃO FOI ENCONTRADO");
        }
    
    }

}
