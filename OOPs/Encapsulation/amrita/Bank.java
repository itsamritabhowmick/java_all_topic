package amrita;

public class Bank {

    //Attributes
    private int bank_no;
    private String ifsc;
    
    //methods
    //parametarized constructor
    public Bank(int bank_no, String ifsc){
        this.bank_no = bank_no  ;
        this.ifsc = ifsc;
    }
    
    public Bank(){
        this.bank_no = 0;
        this.ifsc = "";
    }
    public void display(){
        System.out.println("The bank account number is: "+this.bank_no);
        System.out.println("IFSC code is: "+this.ifsc);
    }

    //getter methods
    public String getIFSC(){
        return  this.ifsc;
    }
    public int getAccno(){
        return this.bank_no;
    }

    //setter method
    public void setIFSC(String ifsc){
        this.ifsc = ifsc;
    }

    public void setAccno(int bank_no){
        this.bank_no = bank_no;
    }
}