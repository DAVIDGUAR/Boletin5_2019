/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2019;

/**
 *
 * @author david
 */
public class Boletin5_2019 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Conta conta1 = new Conta("David","2080", 0, 100);
        Conta conta2 = new Conta("Maria","2081", 0, 3000);
        Conta conta3 = new Conta("Carolina","2082", 0, 1000);
        
        conta1.ver_datos_cuenta();
        conta2.ver_datos_cuenta();
         conta3.ver_datos_cuenta();
         
         System.out.println("Comprobacion errores ingreso,reintegro");
         System.out.println("Reintegro conta1 200€");
         conta1.reintegro(200);
          System.out.println("Reintegro conta2 -100€");
         conta2.ingreso(-100);
         
         System.out.println("Comprobacion errores tranferencia negatibas y saldo insufiente");
         
         System.out.println("TRANSFERENCIA conta2 hacia conta3 -200€");
        conta2.trasferencia(conta3, -200);
        
        System.out.println("TRANSFERENCIA conta1 hacia conta3 500€");
         conta1.trasferencia(conta3, 500);
        conta3.trasferencia(conta1, 900);
        System.out.println("Transferencia conta3 hacia conta1 =900€\n********************************************************************"
                    + "\n                 OPERACION  REALIZADA CON EXITO"
                    + "\n********************************************************************");
        conta2.trasferencia(conta3, 500);
        
        System.out.println("Transferencia conta2 hacia conta3 =500€\n********************************************************************"
                    + "\n                 OPERACION  REALIZADA CON EXITO"
                    + "\n********************************************************************");
        
        
        conta1.ver_datos_cuenta();
        conta3.ver_datos_cuenta();
    }
        
        
        
        
    }
    

