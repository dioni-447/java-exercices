public class Temporario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo = 1000, aux;
        int opc;
        boolean errado = true;
        
        do{
        do {
            errado=true;
            System.out.println("\n===== CAIXA ELETRÔNICO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opc = scan.nextInt();
                errado=false;
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                scan.nextLine();
                opc = -1;
            }
        }while(errado);
            switch (opc) {
                case 1:
                    System.out.printf("Saldo atual: %.2f", saldo);
                    break;
                case 2:
                    System.out.println("SACAR DINHEIRO");
                    do {
                        System.out.println("Digite uma quantia para o saque: ");
                        try {
                            aux = scan.nextDouble();
                            if (aux > 0) {
                                if (aux > saldo) {
                                    System.out.println("Saldo insuficiente");
                                    errado=true;
                                } else {
                                    saldo = saldo - aux;
                                    System.out.println("Saque realizado com sucesso.");
                                    errado = false;
                                }
                            } else {
                                System.out.println("Valor inválido! Digite um valor maior que zero.");
                                errado=true;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Digite apenas números!");
                            scan.nextLine();
                            aux = 0;
                            errado = true;
                        }
                    } while (errado);
                    break;
                case 3:
                    System.out.println("DEPOSITAR DINHEIRO");
                    do {
                        System.out.println("Digite uma quantia para o depósito: ");
                        try {
                            aux = scan.nextDouble();
                            if (aux > 0) {
                                saldo = saldo + aux;
                                System.out.println("Depósito realizado com sucesso.");
                                errado = false;
                            } else {
                                System.out.println("Valor inválido! Digite um valor maior que zero.");
                                errado=true;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Digite apenas números!");
                            scan.nextLine();
                            aux = 0;
                            errado = true;
                        }
                    } while (errado);
                    break;
                case 0:
                    System.out.println("Muito obrigado, até breve.\n Saldo final de: " + saldo);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opc != 0);

    }
}
