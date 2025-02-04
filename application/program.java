package projeto.application;
import projeto.entities.cadastroItem;
import projeto.entities.membros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import projeto.entities.Usuario;
import projeto.entities.UserManager;


public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        UserManager userManager = new UserManager();
        
        // Variaveis de Controle
        boolean voltarMenu = true;
        boolean voltarMenu2 = true;
        boolean loop3 = true;
        int i;
        int opcao = 0;
        int escolha = 0;


        // Listas
        List <cadastroItem> listaCadastro = new ArrayList<cadastroItem>();
        List <membros> listaMembros = new ArrayList <membros>();
        
        
        // Menu
        do{
            System.out.println("1. Registrar usuario");
            System.out.println("2. Login");
            System.out.println("3. Sair");
            System.out.print("Escolha a operação: ");
                escolha = sc.nextInt();
                sc.nextLine(); // Consume newline

            switch (escolha) {
                case 1:
                System.out.print("Digite o usuario: ");
                    String usuario = sc.nextLine();
                System.out.print("Digite a senha: ");
                    String senha = sc.nextLine();
                if (userManager.register(usuario, senha)) {
                    System.out.println("Usuario foi registrado!");
                } else {
                    System.out.println("Usuario já existe.");
                }
                 
                    break;
                case 2:
                    System.out.print("Digite o usuario: ");
                        usuario = sc.nextLine();
                    System.out.print("Digite a senha: ");
                        senha = sc.nextLine();
                        Usuario user = userManager.login(usuario, senha);
                    if (user != null) {
                        System.out.println("Login feito! Bem-vindo, " + user.getUsuario());
                        do{
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("1- CADASTRAR MEMBRO / 2- CADASTRAR ITEM / ");
                            System.out.println("3- REMOVER ITEM / 4- ATUALIZAR ITEM / ");
                            System.out.println("5- EMITIR RELATORIO / 6- SAIR");
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("Digite a opção desejada: ");
                                opcao = sc.nextInt();
                        
                            switch (opcao){
                                case 1:
                                    System.out.println("CONFIRME QUANTOS MEMBROS DESEJA CADASTRAR");
                                    int n = sc.nextInt();
                                    sc.nextLine();                            
                
                                    for(i=0;i < n;i++){                    
                                        System.out.print("Insira o nome do membro: ");
                                            String nome = sc.nextLine();
                                        System.out.print("Insira o idade do membro: ");
                                            int idade = sc.nextInt();
                                            sc.nextLine();
                                        System.out.print("Insira o CPF do membro: ");
                                            String cpf = sc.nextLine();
                                        System.out.print("Insira o telefone/celular do membro: ");
                                            String contato = sc.nextLine();
                                            
                                        System.out.print("Insira o departamento que o membro pertence: ");
                                            String departamento = sc.nextLine();
                                            
                                            
                                        membros membro = new membros(nome,idade,cpf,contato,departamento);
                                        System.out.println("-----------------------------------------------------------------------------");
                                    
                                        System.out.println("Deseja gravar essas informações? (Y/N): ");
                                            char question = sc.next().charAt(0);
                                        
                                        if(question == 'y'){
                                            listaMembros.add(membro);                    
                                        } else if (question == 'n'){
                                            break;
                                        }
                                    }
                                    //Read
                                    for (membros membro : listaMembros){
                                        System.out.println("------------------------------------");
                                        System.out.println(membro.toString());
                                        System.out.println("------------------------------------");
                                    }
                                    break;
                                     
                                case 2:
                                //CREATE
                                System.out.println("CONFIRME QUANTOS ITENS DESEJA CADASTRAR");
                                    int n2 = sc.nextInt();
                                
                                for (i=0;i<n2;i++){
                                    System.out.println("----------------------------------------------------------------------------------");
                                    System.out.println("Digite o opção do ambiente desejado para cadastro: ");
                                    System.out.println("1 - Salão Principal / 2- Cozinha / 3- Banheiro / 4-Salas de ensino/ 5-Gabinete");
                                    System.out.println("----------------------------------------------------------------------------------");
                                    System.out.print("Opção: ");
                                        int local = sc.nextInt();
                                        sc.nextLine();
                                    do {  
                                        try{
                                        System.out.print("Escreva o nome do item a ser cadastrado: ");
                                            String nomeitem = sc.nextLine();
                                            
                                        System.out.print("Escreva a finalidade do item: ");
                                            String finalidade = sc.nextLine();
                                            
                                        System.out.print("Escreva a cor do item: ");
                                            String cor = sc.nextLine();
                                            
                                        System.out.print("Escreva a marca do item: ");
                                            String marca = sc.nextLine();
                                            
                                        System.out.print("Escreva a quantidade do item: ");
                                            int quantidade = sc.nextInt();

                                        System.out.println();
                                        System.out.println("Deseja gravar essas informações? (Y/N): ");
                                            char question2 = sc.next().charAt(0);
                                                
                                        if (question2 == 'y'){
                                            cadastroItem item = new cadastroItem(nomeitem, finalidade ,cor,marca,quantidade,local);
                                            listaCadastro.add(item);
                                        } else if (question2 == 'n'){
                                                break;
                                        }
                                        loop3 = false;
                                        } catch (InputMismatchException e){
                                            System.out.println("----------------------------------------------------------------------------------");
                                            System.out.println("Entrada invalida! Digite novamente.");
                                            System.out.println("----------------------------------------------------------------------------------");
                                            sc.nextLine();
                                        }
                                    }while (loop3);
                                    System.out.println();
                                    
                                    for (cadastroItem item : listaCadastro){
                                        System.out.println(item.toString());
                                    }                   
                                }
                                break;
            
                                case 3:
                                //Remover
                                    for(cadastroItem item : listaCadastro){
                                        System.out.println(item.toString());
                                    }
                
                                    sc.nextLine();
                                    System.out.println("Escreva corretamente o nome do item que deseja excluir:");
                                        String itemRemover = sc.nextLine();
                
                                    for(cadastroItem item : listaCadastro){
                                        if(item.getItem().equals(itemRemover));
                                            listaCadastro.remove(item);
                                    }
                
                                    for(cadastroItem item : listaCadastro){
                                        System.out.println(item.toString());
                                    }
                                    break;
                                
                                case 4:
                                //UPDATE
                                
                                    for(cadastroItem item : listaCadastro){
                                        System.out.println(item.toString());
                                    }
                
                                    sc.nextLine();
                                    System.out.println("Escreva corretamente o nome do item que deseja modificar:");
                                        String itemModificar = sc.nextLine();
                
                                    for(cadastroItem item : listaCadastro){
                                        if(item.getItem().equals(itemModificar));
                                        
                                            System.out.println("----------------------------------------------------------------------------------"); 
                                            System.out.println("Escolha o campo que deseja alterar: ");
                                            System.out.println();
                                            System.out.println("1- Nome / 2- Finalidade / 3-Cor");
                                            System.out.println("4- Marca / 5- Quantidade / 6-Local");
                                            
                                            System.out.println("----------------------------------------------------------------------------------");
                                                int campo = sc.nextInt();
                                                sc.nextLine();
                                                switch (campo){
                                                    case 1:
                                                        System.out.print("Escreva o nome do item substituto: ");
                                                            item.setItem(sc.nextLine()); 
                                                        
                                                    break;
                        
                                                    case 2: 
                                                        System.out.print("Escreva a finalidade do item substituto: ");
                                                            item.setFinalidade(sc.nextLine()); 
                                                        
                                                    break;
                        
                                                    case 3:
                                                        System.out.print("Escreva a cor do item substituto: ");
                                                            item.setCor(sc.nextLine()); 
                                                        
                                                    break;
                        
                                                    case 4:
                                                        System.out.print("Escreva a marca do item substituto: ");
                                                            item.setMarca(sc.nextLine()); 
                                                        
                                                    break;
                        
                                                    case 5:
                                                        System.out.print("Escreva a quantidade do item substituto: ");
                                                            item.setQuantidade(sc.nextInt()); 
                                                    break;
                
                                                    case 6:
                                                        System.out.print("Escreva o local do item substituto: ");
                                                            item.setLocal(sc.nextInt()); 
                                                    break;
                        
                                                    default:
                                                        System.out.println("Opção Invalida!");
                                                    break;
                                                }
                                    }
                                break;
                                case 5:
                                //EMITIR RELATORIO
                                    String path = "C:\\Users\\jonat\\Desktop\\MATERIAL DE ESTUDO\\Ciencia da Computação\\Programação\\JAVA\\ibs-inventory-manager\\report.txt";

                                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
                                        for (membros membro : listaMembros){
                                            bw.write(membro.toString());
                                            bw.newLine();
                                        }for (cadastroItem item : listaCadastro) {
                                            bw.write(item.toString());
                                            bw.newLine();
                                        }
                                    } catch (IOException e){
                                        e.printStackTrace();
                                    }
                
                                case 6:
                                    voltarMenu2 = false;
                                    break;
                                


                                default:
                                    System.out.println("Opção Invalida");
                                    break;
                            }
                        }while(voltarMenu2);
                    } else {
                        System.out.println("Usuario ou senha invalidos.");
                        break;
                    }
                case 3:
                    voltarMenu = false;
                    break;
                default:
                    System.out.println("Escolha invalida. Digite novamente");
                    break;
   
            }
        }while (voltarMenu);

    sc.close();
    }   
}








