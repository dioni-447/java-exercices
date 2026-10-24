public class Temporario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo = 1000, aux;
        int opc;
        
        do{
            System.out.println("\n===== CAIXA ELETRÔNICO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opc=scan.nextInt();
            
            switch(opc){
                case 1:
                    System.out.printf("Saldo atual: %.2f", saldo);
                    break;
                case 2:
                    System.out.println("SACAR DINHEIRO");
                    System.out.println("Digite uma quantia para o saque: ");
                    aux=scan.nextDouble();
                    if(aux>saldo){
                        System.out.println("Saldo insuficiente");
                    }
                    else{
                        saldo=saldo-aux;
                    }
                    break;
                case 3:
                    System.out.println("DEPOSITAR DINHEIRO");
                    System.out.println("Digite uma quantia para o depósito: ");
                    aux=scan.nextDouble();
                    saldo=saldo+aux;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(opc!=0);
        
    }
}
