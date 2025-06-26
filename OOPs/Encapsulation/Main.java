import amrita.*;

public class Main {
    
    public static void main(String[] args) {
       //Bank b = new Bank(1234, "ABCD1234");
        Bank b = new Bank();
        b.setAccno(1234);
        b.setIFSC("ABCD1234");

       //b.display();
       int myAcc = b.getAccno();
       String myIFSC = b.getIFSC();
       System.out.println("The account no is "+myAcc);
       System.out.println("IFSC code is: "+myIFSC);

    }
}
