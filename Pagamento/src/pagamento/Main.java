/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamento;

/**
 *
 * @author aniii
 */
class Main {
    
    public static void main (String [] args) {
        Pagamento objetoPagamento [] = new Pagamento [4];
        objetoPagamento [0] = (Pagamento) new Fatura ("01234","Monitor",2,375.00);
        objetoPagamento [1] = (Pagamento) new Fatura ("56789","Estabilizador",4,79.95);
        objetoPagamento [2] = (Pagamento) new TrabalhadorAssalariado ("Marcelo","111-11-111",800.00);
        System.out.println (" Processamento poliformico: \n");
        for (Pagamento pagamentoCorrente : objetoPagamento)
        {
           System.out.printf ("%s \n %s: $%, .2f \n \n", pagamentoCorrente.toString (), "pagamento", pagamentoCorrente.valorPagamento());
        }
    }}
