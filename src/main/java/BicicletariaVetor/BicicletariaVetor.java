/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package bicicletariaVetor;


import java.util.Scanner;

/**
 *
 * @author Nathanelisabetinho
 */
public class BicicletariaVetor {

    public static void main(String[] args) {

    

        menu();

    }



    public static void menu() {
        
        
        Scanner Ler = new Scanner(System.in);
        bicicletasVetor[] novaBicicleta = new bicicletasVetor[10];
        clientesVetor[] novoCliente = new clientesVetor[10];
        
        for (int i = 0; i < 10; i++) {
            novaBicicleta[i] = new bicicletasVetor();
            novoCliente[i] = new clientesVetor();

        }
        

        int op = -1;
        while (op != 0) {
            System.out.println("[1] - CADASTRAR CLIENTE");
            System.out.println("[2] - CADASTRAR PRODUTO");
            System.out.println("[3] - EFETUAR VENDA");
            System.out.println("[4] - EDITAR CLIENTE");
            System.out.println("[5] - EXCLUIR");
            System.out.println("[6] - MANUTENÇÃO");
            System.out.println("[7] - MANUTENÇÃO");
            op = Ler.nextInt();
            switch (op) {

                case 1:
                    
                    System.out.println("CADASTRAR CLIENTE");

                    for (int i = 0; i < 10; i++) {
                        //novoCliente[i].codigoCliente = 0 + i;
                        //novoCliente[i].nome = "Neita" + i;
                        //novoCliente[i].telefone = ("KFT BIKES" + (i));
                        //novoCliente[i].endereço = ("FENRE 21v" + (i));
                        //novoCliente[i].cidade = ("JOWKL" + (i));
                        //novoCliente[i].estado = ("Carbono 2" + (i));
                        //novoCliente[i].cpf = ("preta maron" + (i));
                        //novoCliente[i].rg = ("29" + (i));
                        //novoCliente[i].email = ("algo@email.com" + (i));
                        

                        System.out.println(novoCliente[i].codigoCliente);
                        
                        novoCliente[i].cadastrar(novoCliente[i].codigoCliente,novoCliente[i].nome,
                        novoCliente[i].telefone,novoCliente[i].endereço,novoCliente[i].cidade,
                        novoCliente[i].estado,novoCliente[i].cpf,novoCliente[i].rg,novoCliente[i].email);
                    }
                    
                    
                    break;

                case 2:

                    System.out.println("CADASTRAR PRODUTO");

                    for (int i = 0; i < 10; i++) {
                        novaBicicleta[i].codigoBicicleta = 0 + i;
                        novaBicicleta[i].estoque = 0 + i;
                        novaBicicleta[i].marca = ("KFT BIKES" + (i));
                        novaBicicleta[i].modelo = ("FENRE 21v" + (i));
                        novaBicicleta[i].fabricante = ("JOWKL" + (i));
                        novaBicicleta[i].materialQuadro = ("Carbono 2" + (i));
                        novaBicicleta[i].cor = ("preta maron" + (i));
                        novaBicicleta[i].aro = ("29" + (i));
                        novaBicicleta[i].tamanho = ("145 x 80 x 23 cm; 15 Quilogramas" + (i));
                        novaBicicleta[i].raio = ("Atakaf" + (i));
                        novaBicicleta[i].pneu = ("Atakaf" + (i));
                        novaBicicleta[i].freio = ("Shimaru" + (i));
                        novaBicicleta[i].pedaleira = ("Pedal em Nylon" + (i));
                        novaBicicleta[i].cambio = ("Shimaru" + (i));
                        novaBicicleta[i].corrente = ("Shimaru" + (i));
                        novaBicicleta[i].coroa = ("Shimaru" + (i));
                        novaBicicleta[i].quantidadeMarchas = ("21" + (i));
                        novaBicicleta[i].guidao = ("Mahunte" + (i));
                        novaBicicleta[i].banco = ("Kaffer" + (i));
                        novaBicicleta[i].suspensão = ("Dianteira" + (i));

                        System.out.println(novaBicicleta[i].guidao);
                    }
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("------------------------------");
                        System.out.println(novaBicicleta[i].codigoBicicleta);
                        System.out.println(novaBicicleta[i].estoque);
                        System.out.println(novaBicicleta[i].marca);
                        System.out.println(novaBicicleta[i].modelo);
                        System.out.println(novaBicicleta[i].fabricante);
                        System.out.println(novaBicicleta[i].materialQuadro);
                        System.out.println(novaBicicleta[i].cor);
                        System.out.println(novaBicicleta[i].aro);
                        System.out.println(novaBicicleta[i].tamanho);
                        System.out.println(novaBicicleta[i].raio);
                        System.out.println(novaBicicleta[i].pneu);
                        System.out.println(novaBicicleta[i].freio);
                        System.out.println(novaBicicleta[i].pedaleira);
                        System.out.println(novaBicicleta[i].cambio);
                        System.out.println(novaBicicleta[i].corrente);
                        System.out.println(novaBicicleta[i].coroa);
                        System.out.println(novaBicicleta[i].quantidadeMarchas);
                        System.out.println(novaBicicleta[i].guidao);
                        System.out.println(novaBicicleta[i].banco);
                        System.out.println(novaBicicleta[i].suspensão);

                    }
                    break;

                case 7:
                    break;

            }
        }

    }

}
