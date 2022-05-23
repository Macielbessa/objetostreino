package com.basico.projeto;

import java.math.BigDecimal;

public class Test {
   public static void main (String[]args){

      ContaCorrente contaCorrente = new ContaCorrente();
      contaCorrente.setCliente("João");

      System.out.println("João depositou R$100,00");
      contaCorrente.setSaldo(new BigDecimal(100.00));

      System.out.println("João precisar sacar R$10.00 da sua conta");
      System.out.println("Saldo atual da conta : " + contaCorrente.sacarSaldo(10.00));

      ContaCorrente corrente = new ContaCorrente();
      corrente.setCliente("Maria");

      System.out.println("------------------------------------------------");

      System.out.println("Maria depositou 500.00");
      corrente.setSaldo(new BigDecimal(500.00));

      System.out.println("Maria precisar sacar R$50.00 da sua conta");
      System.out.println("Saldo atual da conta : " + corrente.sacarSaldo(50.00));

      try{
         if(contaCorrente.getSaldo() != corrente.getSaldo()){
            System.out.println("saldos diferentes");
        } else {
            System.out.println("oi");
         }
      } catch (Exception e){
         System.out.println("oi2");
      }

   }
}
