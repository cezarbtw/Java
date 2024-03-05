/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioo.pkg2;

/**
 *
 * @author punis
 */
public class Exercicioo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Exercicio 1a
        int quantirmaos = 3;
        if (quantirmaos >= 2) {
            System.out.println("Voce ganhou um desconto de 10%");
        } else {
            System.out.println("Nao havera desconto");
        
            
        }

        // Exercicio 1b
        
        int alunos = 32;
        if (alunos >= 30) {
            System.out.println("Voce ganhou uma passagem para Cancun");
        } else if (alunos == 30) {
            System.out.println("Voce ganhou uma passagem para Fortaleza");
        } else {
            System.out.println("Voce ganhou uma passagem para Caldas Novas");
            

        //Exercicio 1c
        double valorCompra = 637.78;
        System.out.println ("Sua compra deu um total de R$" + valorCompra);
        if (valorCompra > 150)  {
            double desconto = valorCompra * 0.10;
            double novoValor = valorCompra - desconto;
            System.out.println("Ja que o valor da compra e maior que 150R$, voce ganhou um desconto de 10%");
            System.out.println ("o valor com desconto e de : "+ novoValor);
        }    else if (valorCompra ==50) {
            double desconto = valorCompra * 0.7;
            double novoValor = valorCompra - desconto;
            System.out.println ("Ja que o valor da compra e igual a 150R$, voce ganhou um desconto de 7%");
            System.out.println ("o valor com desconto e de : "+ novoValor);
        }else {
         double desconto = valorCompra * 0.4;
         double novoValor = valorCompra - desconto;
         System.out.println ("Já que o valor da compra é menor que 150R$, voce ganhou um desconto de 4%");
         System.out.println ("o valor com desconto e de : "+ novoValor);
         
         //Exercicio 1d
         
         
         System.out.print ("Quantos pontos voce teve na carteira no ultimo ano ? ");
         int pontosCarteira = scanner.nextInt();
         if (pontosCarteira <5 ){
             System.out.println ("você, apesar da multa, é um bom(boa) condutor(a)");
         } else if (pontosCarteira ==5) {
             System.out.println ("apesar de ser um bom condutor, tome cuidado ");
         } else  {
            System.out.println ("você é uma pessoa legal mas tem que prestar mais atenção às leis de trânsito");
            
         //Exercicio 1e
         
         int numerodeAmigos = 5;
         
         if (numerodeAmigos < 5)
         System.out.println("voce e uma pessoa tranquila");
         else if (numerodeAmigos == 5)
         System.out.println("voce e uma pessoa norma");
         else
         System.out.println ("TU TA ANIMADO");
         
         //Exercicio 4
         
         int valorA = 4;
         int valorB = 8;
         int valorC = 8;
         int valorD = 5;
         
         float somaValores = valorA+valorB+valorC+valorD;
         float mediaValores = somaValores / 4;
         System.out.println("A média dos valores apresentados é : " + mediaValores);
         
         //Exercicio 5 
         
         String blocoEstudo = "Computacao = Bloco D";
         String disciplinaProva = "LPOO";
         String dataProvaLPOO = "21/03";
         
         if ("D".equals(blocoEstudo)) {
         System.out.println("Você estuda no Bloco D.");
            
         if ("LPOO".equals(disciplinaProva)) {
                System.out.println("Sua prova de LPOO sera dia " + dataProvaLPOO);
          } else {
         System.out.println("Data da prova indisponível");}
            
          } else {
            System.out.println("voce estuda em outro bloco."); } 
         
         //Exercicio 7
         
         String nome = "Abraao Cezar";
         String endereco = "Rua T7, Quadra 31";
         int numeroCasa = 15;
         
         System.out.println("Nome: " + nome);
         System.out.println("Endereço: " + endereco);
         System.out.println("Numero da casa: " + numeroCasa);
         
         if (numeroCasa <65)
         System.out.println("voce pagara o IPTU deste ano parcelado em 3 vezes.");
         else if (numeroCasa == 65)
         System.out.println ("voce pagara o IPTU deste ano em duas parcelas ");
         else
         System.out.println ("voce pagara o IPTU à vista ");
        
        }

         
         
         
         
         
                 
         
         
         
         }
         
         
            
            
            
        }
        }
    }






