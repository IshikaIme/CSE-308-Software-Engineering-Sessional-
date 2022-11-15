package Systems;

import Components.ArduinoMega;
import Components.ControlUnit;
import Components.DisplayUnit;
import Components.LEDMatrix;
import Product.Product;

public class Optimal implements QueueSystem {
    // private Product product;
    private LEDMatrix ledMatrix;
    private ArduinoMega arduinoMega;

    private DisplayUnit displayUnit;
    private ControlUnit controlUnit;

    public Optimal() {
        // this.product= new Product();
        this.ledMatrix = new LEDMatrix();
        this.arduinoMega = new ArduinoMega();
        BuildControlUnit();
        BuildDisplayUnit();
    }

    public void BuildDisplayUnit() {
        this.displayUnit = ledMatrix;
    }

    ;

    public void BuildControlUnit() {
        this.controlUnit = arduinoMega;
    }

    ;
//    public Product getProduct(){
//        return this.product;
//    }


    public DisplayUnit getDisplayUnit() {
        return this.displayUnit;
    }

    ;

    public ControlUnit getControlUnit() {
        return this.controlUnit;
    }

    ;

}
