package Systems;

import Components.ATMega32;
import Components.ControlUnit;
import Components.DisplayUnit;
import Components.LEDMatrix;

public class Poor implements QueueSystem {
  //  private Product product;
    private LEDMatrix ledMatrix;
    private ATMega32 atMega32;

    private DisplayUnit displayUnit;
    private ControlUnit controlUnit;

    public Poor()
    {
        //this.product= new Product();
        this.ledMatrix=new LEDMatrix();
        this.atMega32=new ATMega32();
        BuildControlUnit();
        BuildDisplayUnit();
        //this.displayUnit=new DisplayUnit();
       // this.controlUnit=new ControlUnit();
    }
    public void BuildDisplayUnit()
    {
        this.displayUnit=ledMatrix;
    };
    public void BuildControlUnit() {this.controlUnit=atMega32;};

//    public Product getProduct(){
//    return this.product;
//    }
//};

    public DisplayUnit getDisplayUnit()
    {
     return this.displayUnit;
    };
    public ControlUnit getControlUnit()
    {
        return this.controlUnit;
    };
}
