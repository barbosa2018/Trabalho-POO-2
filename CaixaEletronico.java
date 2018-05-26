import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            Bandeja b1 = new Bandeja(100.0, 20);
            Bandeja b2 = new Bandeja(50.0, 20);
            Bandeja b3 = new Bandeja(20.0, 20);
            Bandeja b4 = new Bandeja(10.0, 20);
            
            Caixa2 c1 = new Caixa2("ibc123", 319, "Livino Pedroso do Amaral", "Sumare", "SP", b1 , b2 , b3 , b4);
            
            
       boolean i = true;
        while (i) {
            System.out.println("**********CAIXA ELETRONICO**********");
            System.out.println("1 - Saldo total do Caixa");
            System.out.println("2 - Saldo Bandeja");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            int x = entrada.nextInt();
            switch(x){
                case 1:
                    System.out.println("O saldo total do caixa e: R$"+c1.saldo());
                break;
            
            case 2:
                System.out.println("Qual bandeja deseja avaliar o saldo?");
                System.out.println("0 - Bandeja de R$100");
                System.out.println("1 - Bandeja de R$50");
                System.out.println("2 - Bandeja de R$20");
                System.out.println("3 - Bandeja de R$10");
                int v = entrada.nextInt();
                if(v>=0 && v<4)
                    System.out.println("O saldo da bandeja e: R$"+c1.saldoDaBandeja(v));
                else{
                    System.out.println("Valor incorreto. Tente novamente");
                }
                break;
            
            case 3:
                System.out.println("Digite o valor do saque:");
                int valor = entrada.nextInt();
                if((valor>0 && valor<=1200) && ( ((valor%100)==0) || ((valor%50)==0) || ((valor%20)==0)) || ((valor%10)==0)){
                    double vet[][] = c1.sacar(valor);
                    
                    if((vet[0][1] != 0.0) || (vet[1][1] != 0.0) || (vet[2][1] != 0.0) || vet[3][1] != 0.0){
                    
                       System.out.println("***************");
                        for(int d=0;d<4;d++){
                        for(int e=0;e<2;e++){
                            if(e==0)
                                System.out.println("R$:"+vet[d][e]);
                            else{
                                System.out.println(vet[d][e]+" Notas");
                                System.out.println("***************");
                            }
                        
                        }
                    }
                    
       }
                    else
                        System.out.println("Valor indisponÃ­vel no caixa eletronico.");
                }            
                
                else
                    System.out.println("Valor do saque invÃ¡lido.Tente novamente.");
                break;
            case 4:
                i = false;
                break;
            default:
                System.out.println("Valor incorreto. Tente novamente.");
                break;
            }
        }
       
    }

}
1
111ds1233
