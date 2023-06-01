package com.deitel.ch17;
// A classe AccountRecord mantém informações para uma conta

public final class AccountRecord {
    
    private int account;
    private String firtsName;
    private String lastName;
    private double balance;

    //construtor sem argumentos chama outro construtor com valores padrão
    public AccountRecord () 
    {
        
        this(0,"", "", 0.0);
       
    } // fim do construtor de AccountRecord sem argumentos
    
    
    public AccountRecord( int acct, String first, String last, double bal){
        
        setAccount( acct );
        setFirstName( first );
        setLastName( last );
        setBalance( bal );
                
    } // fim do construtor de AccountRecord com 4 argumentos
    
    
    
    // configura o número da conta
    public void setAccount( int acct ){
        
        account = acct;
    } //fim do método setAccount
    
    
    
    //obtém número de conta
    public int getAccount(){
        
        return account;
    }// fim do método getAccount

    
    
    // obtém o primeiro nome
    public String getFirstName() {
        return firtsName;
    }

    
    // configura o nome
    public void setFirstName(String firtsName) {
        this.firtsName =  firtsName;
    } // fim do método setFirtsName

    
    // configura o sobrenome
    public void setLastName(String last) {
        this.lastName = last;
    } // fim do método setLastName
    
    
    // obtém o último nome 
    public String getLastName() {
        return lastName;
    } // fim do método getLastName
    
    
    
    // configura saldo
    public void setBalance(double bal) {
        this.balance = bal;
    }// fim do método setBalance
    
    
    // obtém saldo
     public double getBalance() {
        return balance;
    } // fim do método getBalance
    
    
} // fim da classe AccountRecord
