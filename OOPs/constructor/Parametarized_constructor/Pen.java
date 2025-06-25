public class Pen {

    //Attributes
    String company;
    String color;
    String type;


    //Use constructor
    public Pen(String c, String co, String t){
        this.color = co;
        this.company = c;
        this.type = t;
    }

    //method
    public void write(){
        System.out.println("Writting content");
    }
    public void refill(){
        System.out.println("Refilling Pen");
    }
    public void display(){
        System.out.println("Pen company is: "+this.company+" Pen color is: "+this.color+" Pen type is: "+this.type);
    }
}