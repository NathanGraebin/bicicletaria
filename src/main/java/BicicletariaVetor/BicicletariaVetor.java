/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package BicicletariaVetor;

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
        int idConta;
        

        Scanner Ler = new Scanner(System.in);
        produtos[] novaBicicleta = new produtos[10];
        clientesVetor[] novoCliente = new clientesVetor[10];

        for (int i = 0; i < 10; i++) {
            novaBicicleta[i] = new produtos();
            novoCliente[i] = new clientesVetor();

        }

        int op = -1;
        while (op != 0) {
            System.out.println("[1] - CADASTRAR CLIENTE");
            System.out.println("[2] - BUSCAR CLIENTE");
            System.out.println("[3] - EXCLUIR CLIENTE");
            System.out.println("[4] - EDITAR CLIENTE");
            System.out.println("[5] - EXCLUIR");
            System.out.println("[6] - MANUTENÇÃO");
            System.out.println("[7] - MANUTENÇÃO");
            op = Ler.nextInt();
            switch (op) {

                case 1:
                    System.out.println("CADASTRAR CLIENTE");

                    for (int i = 0; i < 10; i++) {

                        if (novoCliente[i].getNome() == null) {
                            System.out.println("Vetor livre > " + i);
                            novoCliente[i].cadastrar();
                            i = 10;
                        } else {
                            System.out.println("Vetor Ocupado, vai para o proximo > " + i);

                        }
                    }
                    break;

                case 2:
                    
                    System.out.println("BUSCAR CLIENTE");
                    System.out.println("INFORME O ID DO CLIENTE");
                    idConta = Ler.nextInt();

                    for (int i = 0; i < 10; i++) {
                        novoCliente[i].buscarCliente(idConta);

                    }

                    break;

                case 3:
                    
                    System.out.println("BUSCAR CLIENTE PARA EXCLUIR");
                    System.out.println("INFORME O ID DO CLIENTE ");
                    idConta = Ler.nextInt();

                    for (int i = 0; i < 10; i++) {
                        novoCliente[i].excluirCliente(idConta);

                    }
                    
                    break;
                case 4:

                    
                    break;

                //case 5 -> {
                //}
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

            }
        }

    }

}
