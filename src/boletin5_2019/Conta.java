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
public class Conta {
    
     String nome,conta;
    double interese,saldo;

    public Conta(String nome, String conta, double interese, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.interese = interese;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getConta() {
        return conta;
    }

    public double getInterese() {
        return interese;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setInterese(double interese) {
        this.interese = interese;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public void ingreso(double ingreso){
        if (ingreso<0){
            
            System.out.println("Importe negativo ERROR");
            
            
            
        }else
            
        saldo=saldo+ingreso;
    }
    
    public void reintegro(double reintegro){
        
        if(saldo<reintegro){
            System.out.println("No es posible saldo insuficiente");
            
        }else
        
        saldo=saldo-reintegro;
        
    }
    
    
    public void ver_datos_cuenta(){
        
        System.out.println("Nombre: " + nome + "\nNumero de cuenta: " + conta + "\nSaldo Disponible: " + saldo);
        
        
    }
        public void trasferencia(Conta cuentaDestino,double importe){
            
        
            if (saldo>importe && importe>0){
                
               saldo=saldo-importe;
            cuentaDestino.ingreso(importe); 
              
            }else
            
           if (saldo<importe){
               
               System.out.println("No es posible saldo insuficiente");
           }else
            
             System.out.println("Importe negativo ERROR");
       }
    
    
    
}
