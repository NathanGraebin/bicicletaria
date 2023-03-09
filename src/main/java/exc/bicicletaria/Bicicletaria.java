/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package exc.bicicletaria;

import java.util.Scanner;

/**
 *
 * @author Nathanelisabetinho
 */
public class Bicicletaria {

    public static void main(String[] args) {

    

        menu();

    }

    public static void iniciarCliente() {

        cliente novoCliente1 = new cliente();
        cliente novoCliente2 = new cliente();
        cliente novoCliente3 = new cliente();
        cliente novoCliente4 = new cliente();

        novoCliente1.Nome = "Joao Jose Almeida";
        novoCliente1.Telefone = " 99988-2552";
        novoCliente1.Endereço = "Rua do Maranhão";
        novoCliente1.Cidade = "Mundo Antigo";
        novoCliente1.Estado = "Mato Grosso do Sul";
        novoCliente1.Cpf = "025.696.957-88";
        novoCliente1.rg = "14.556.65-96";
        novoCliente1.email = "joaojose@hotmail.com";

        novoCliente2.Nome = "Joao Jose Almeida";
        novoCliente2.Telefone = " 99988-2552";
        novoCliente2.Endereço = "Rua do Maranhão";
        novoCliente2.Cidade = "Mundo Antigo";
        novoCliente2.Estado = "Mato Grosso do Sul";
        novoCliente2.Cpf = "025.696.957-88";
        novoCliente2.rg = "14.556.65-96";
        novoCliente2.email = "joaojose@hotmail.com";

        novoCliente3.Nome = "Joao Jose Almeida";
        novoCliente3.Telefone = " 99988-2552";
        novoCliente3.Endereço = "Rua do Maranhão";
        novoCliente3.Cidade = "Mundo Antigo";
        novoCliente3.Estado = "Mato Grosso do Sul";
        novoCliente3.Cpf = "025.696.957-88";
        novoCliente3.rg = "14.556.65-96";
        novoCliente3.email = "joaojose@hotmail.com";

        novoCliente4.Nome = "Joao Jose Almeida";
        novoCliente4.Telefone = " 99988-2552";
        novoCliente4.Endereço = "Rua do Maranhão";
        novoCliente4.Cidade = "Mundo Antigo";
        novoCliente4.Estado = "Mato Grosso do Sul";
        novoCliente4.Cpf = "025.696.957-88";
        novoCliente4.rg = "14.556.65-96";
        novoCliente4.email = "joaojose@hotmail.com";

    }

    public static void iniciarBicicleta() {

        bicicleta novaBicicleta1 = new bicicleta();
        bicicleta novaBicicleta2 = new bicicleta();
        bicicleta novaBicicleta3 = new bicicleta();
        bicicleta novaBicicleta4 = new bicicleta();

        novaBicicleta1.codigoBicicleta = 1;
        novaBicicleta1.estoque = 5;
        novaBicicleta1.marca = "KFT BIKES";
        novaBicicleta1.modelo = "FENRE 21v";
        novaBicicleta1.fabricante = "JOWKL";
        novaBicicleta1.materialQuadro = "Carbono 2";
        novaBicicleta1.cor = "preta maron";
        novaBicicleta1.aro = "29";
        novaBicicleta1.tamanho = "145 x 80 x 23 cm; 15 Quilogramas";
        novaBicicleta1.raio = "Atakaf";
        novaBicicleta1.pneu = "Atakaf";
        novaBicicleta1.freio = "Shimaru";
        novaBicicleta1.pedaleira = "Pedal em Nylon";
        novaBicicleta1.cambio = "Shimaru";
        novaBicicleta1.corrente = "Shimaru";
        novaBicicleta1.coroa = "Shimaru";
        novaBicicleta1.quantidadeMarchas = "21";
        novaBicicleta1.guidao = "Mahunte";
        novaBicicleta1.banco = "Kaffer";
        novaBicicleta1.suspensão = "Dianteira";

        novaBicicleta2.codigoBicicleta = 2;
        novaBicicleta2.estoque = 2;
        novaBicicleta2.marca = "‎2";
        novaBicicleta2.modelo = "2";
        novaBicicleta2.fabricante = "2";
        novaBicicleta2.materialQuadro = "2";
        novaBicicleta2.cor = "2";
        novaBicicleta2.aro = "2";
        novaBicicleta2.tamanho = "2";
        novaBicicleta2.raio = "2";
        novaBicicleta2.pneu = "2";
        novaBicicleta2.freio = "2";
        novaBicicleta2.pedaleira = "2";
        novaBicicleta2.cambio = "2";
        novaBicicleta2.corrente = "2";
        novaBicicleta2.coroa = "2";
        novaBicicleta2.quantidadeMarchas = "2";
        novaBicicleta2.guidao = "2";
        novaBicicleta2.banco = "2";
        novaBicicleta2.suspensão = "2";

        novaBicicleta3.codigoBicicleta = 3;
        novaBicicleta3.estoque = 3;
        novaBicicleta3.marca = "3";
        novaBicicleta3.modelo = "3";
        novaBicicleta3.fabricante = "3";
        novaBicicleta3.materialQuadro = "3";
        novaBicicleta3.tamanho = "3";
        novaBicicleta3.raio = "3";
        novaBicicleta3.pneu = "3";
        novaBicicleta3.freio = "3";
        novaBicicleta3.pedaleira = "3";
        novaBicicleta3.cambio = "3";
        novaBicicleta3.corrente = "3";
        novaBicicleta3.coroa = "3";
        novaBicicleta3.quantidadeMarchas = "3";
        novaBicicleta3.guidao = "3";
        novaBicicleta3.banco = "3";
        novaBicicleta3.suspensão = "3";

    }

    public static void menu() {
        iniciarCliente();
        iniciarBicicleta();
        
        Scanner Ler = new Scanner(System.in);
        bicicletas[] novaBicicleta = new bicicletas[10];
        clientesVetor[] novoCliente = new clientesVetor[10];
        
        for (int i = 0; i < 10; i++) {
            novaBicicleta[i] = new bicicletas();
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
                    
                    System.out.println("CADASTRAR ClENT");

                    for (int i = 0; i < 10; i++) {
                        novoCliente[i].codigoCliente = 0 + i;
                        novoCliente[i].nome = "Neita" + i;
                        novoCliente[i].telefone = ("KFT BIKES" + (i));
                        novoCliente[i].endereço = ("FENRE 21v" + (i));
                        novoCliente[i].cidade = ("JOWKL" + (i));
                        novoCliente[i].estado = ("Carbono 2" + (i));
                        novoCliente[i].cpf = ("preta maron" + (i));
                        novoCliente[i].rg = ("29" + (i));
                        novoCliente[i].email = ("algo@email.com" + (i));
                        

                        System.out.println(novoCliente[i].codigoCliente);
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
