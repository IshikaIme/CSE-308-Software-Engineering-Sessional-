package Systems;

import Product.Product;

public class QueueSystemFactory {

    QueueSystem queueSystem;

    public QueueSystem getQueueSystem(String QueueSystem) {
        if (QueueSystem.equalsIgnoreCase("Delux")) {
            queueSystem= new Delux();
        } else if (QueueSystem.equalsIgnoreCase("Optimal")) {
            queueSystem=  new Optimal();
        } else if (QueueSystem.equalsIgnoreCase("Poor")) {
            queueSystem=  new Poor();
        }
        return queueSystem;
    }
}