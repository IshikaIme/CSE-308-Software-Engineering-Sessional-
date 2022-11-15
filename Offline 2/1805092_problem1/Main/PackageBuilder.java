package Main;

import Components.*;
import Systems.QueueSystemFactory;
import Product.*;
import Systems.*;

public class PackageBuilder {
    private QueueSystem QSBuilder;
    private CommunicationSystem communicationSystem;
    private Product Plan;

    public PackageBuilder() {
        QSBuilder=null;
        communicationSystem=null;
        Plan=null;
    }



    public Product MakePackage (String QueueSystem, String CommunicationChannel, int NoOfDisplayUnits){
        QueueSystemFactory qsFactory = new QueueSystemFactory();
        QSBuilder = qsFactory.getQueueSystem(QueueSystem);
        CommunicationFactory comFactory= new CommunicationFactory();
        communicationSystem= comFactory.getCommunicationSysytem(CommunicationChannel);

       // QSBuilder.BuildControlUnit();
       // QSBuilder.BuildDisplayUnit();
        DisplayUnit displayUnit = QSBuilder.getDisplayUnit();
        ControlUnit controlUnit = QSBuilder.getControlUnit();
        Application application = new Application();

        Plan= new Product(displayUnit,controlUnit,application,communicationSystem,NoOfDisplayUnits);


        return Plan;
    }

//    public void show()
//    {
//        System.out.println("Display System is: "+ Plan.getDisplayUnit().getName() + " ,Price: "+ Plan.getDisplayUnit().getPrice());
//        System.out.println("Application System is: "+ Plan.getApplication().getName() + " ,Price: "+ Plan.getApplication().getPrice());
//        System.out.println("Control System is: "+ Plan.getControlUnit().getName()+ " ,Price: "+ Plan.getControlUnit().getPrice());
//        System.out.println("Communication System is: "+ Plan.getCommunicationSystem().getName() + " ,Price: "+ Plan.getCommunicationSystem().getPrice());
//    }


}
