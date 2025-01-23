package projeto.application;
import projeto.entities.cadastroItem;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;



public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List <cadastroItem> listaCadastro = new ArrayList<cadastroItem>();
        int i, n;
        int opcao = 0;
        boolean menu = true;
        boolean updateItem = true;
        boolean loop3 = true;
        

        
        do{    
            System.out.println("Digite a opção: ");
                opcao = sc.nextInt();
            switch (opcao) {
                //create
                case 1:
                    System.out.println("CONFIRME QUANTOS ITENS DESEJA CADASTRAR");
                        n = sc.nextInt();
                
                    for(i=0;i<n;i++){
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
                
                        //COLOCAR O REMOVE COM BASE NO INDICE
                
                        for (cadastroItem item : listaCadastro){
                        System.out.println(item.toString());
                    
                        }
                  
                    }

                    break;
                case 2:
                    //UPDATE

                    for(cadastroItem item : listaCadastro){
                        System.out.println(item.toString());
                    }

                    sc.nextLine();
                    System.out.println("Escreva corretamente o nome do item que deseja modificar:");
                        String itemRemovido = sc.nextLine();

                    for(cadastroItem item : listaCadastro){
                        if(item.getItem().equals(itemRemovido));
                           
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
                    

                case 4:
                    menu = false;
                    break;
                    default:
                    
                    break;
                }
            } while(menu);
            sc.close();                 
        }
    }
    
                    // //Remove
                    //     for(cadastroItem item : listaCadastro){
                    //         System.out.println(item.toString());
                    //     }
    
                    //     sc.nextLine();
                    //     System.out.println("Escreva corretamente o nome do item que deseja excluir:");
                    //         String itemRemovido = sc.nextLine();
    
                    //     for(cadastroItem item : listaCadastro){
                    //         if(item.getItem().equals(itemRemovido));
                    //             listaCadastro.remove(item);
                    //     }
    
                    //     for(cadastroItem item : listaCadastro){
                    //         System.out.println(item.toString());
                    //     }
                    //     break;
