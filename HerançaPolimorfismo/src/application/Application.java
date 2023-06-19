package application;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Application {

    public static void main(String[] args) {

        // Herança é uma relação "é-um" = Significa que a classe matriz e a subclasse é a mesma, ou seja, é um
        // A classe matriz é uma generalização/genérica, e a subclasse é uma classe específica/especialização
        // Superclasse (classe base) / subclasse (classe derivada)
        // Herança é uma extensão = extends
        // Herança é uma associação entre classes (e não de objetos). Na herança, instancio um objeto com membros de outra classe
        // Na composição, tenho dois tipos de objetos relacionados a classes diferentes

       // Account acc = new Account(1001, "Alex", 0.0);
      //  BussinesAccount bacc = new BussinesAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        // Atribui um objeto/método da subclasse para uma variável
        // de uma classe matriz, pois elas são do mesmo tipo = "é um".

      //  Account acc1 = bacc;
       // Account acc2 = new BussinesAccount(1003, "Thiago", 0.0, 200.0);
      //  Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING
        // Atribui um objeto/método da superclasse para uma variável de uma subclasse
        // Processo inverso ao upcasting
        // O casting deve ser feito manualmente

        //BussinesAccount acc4 = (BussinesAccount) acc2;
      //  acc4.loan(100.0);

        // Algumas vezes, o compilador não irá apontar o erro
        // Mas é preciso usar a palavra-chave "instanceof" caso as subclasses
        // não sejam do mesmo tipo

     
        
      // if (acc3 instanceof BussinesAccount) {
           // BussinesAccount acc5 = (BussinesAccount) acc3;
          //  acc5.loan(200.0);
            System.out.println("Loan!");
       // }  // Essse if falha pq a ainstancia do objeto não é a mesma e o downcast falha
        
       // if(acc3 instanceof SavingsAccount) {
        //	SavingsAccount acc5 = (SavingsAccount)acc3;
        	//acc5.updateBalane();
        	//System.out.println("Updated!");
        	
        }
        
        //IMPORTANTE: SEMPRE USAR INSTANCEOF, CASO NÃO SEJAM DO MESMO TIPO
        //ISSO FAZ COM QUE EU POSSA ACESSSAR METODOS E OBJETOS DAS SUBCLASSES
        //COM ESSE TIPO DE DOWNCASTING
        //Isso ajuda a evitar erros e permite um acesso seguro aos membros das subclasses;
    }
