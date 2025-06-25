public class Pen {

    //Attributes
    String company;
    String color;
    String type;

    //methods
    public void write(){
        System.out.println("Writting Content");
    }

    public void refill(){
        System.out.println("Refilling Pen");
    }

    public void display(){
        System.out.println("Company name is: "+this.company+"color is: "+this.color+"type is: "+this.type);
    }

}