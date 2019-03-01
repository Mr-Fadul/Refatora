/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refatora;

/**
 *
 * @author 41713029
 */

public class Refatora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeradorDeNotaFiscal nota = new GeradorDeNotaFiscal();//instacia a clase gerador de notas
        Fatura fatura = new Fatura();// intancia a classe fatura
        fatura.setCliente("Marcello");
        fatura.setValorMensal(300000);
        nota.gera(fatura);// pega os valores da fatura e gera com a função na classe gerador
    }
    
}
