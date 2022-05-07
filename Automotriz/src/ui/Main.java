package ui;
import model.ControlParking;
import java.util.Scanner;

public class Main{
	
	private ControlParking parking;
	private Scanner sc;
	
	public Main(){
        parking = new ControlParking();
        sc= new Scanner(System.in);
    }
	public static void main(String [] args) {
		
		System.out.println("Starting app");
		
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Select an option to start\n" +
				"(1) Register vehicle\n" +
				"(2) Show total price\n"+
				"(3) Show report vehicle\n"+
                "(4) Show document State\n"+  
                "(5) Map parking\n"+
                "(6) Show occupancy parking\n"+
				"(0) Exit"+"\n"+
                "Enter option"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;

		case 1:
            registerVehicle();
			break;

		case 2:
            showPriceTotal();
			break;
	
		case 3:
            showReportVehicle();
			break;

        case 4:
            showDocumentStatuses();
            break;

        case 5:
            generateMapParking();
            break;
        case 6:
            generateOccupancyReportParking();
            break;
		default:
			System.out.println("Error, optionn invalid");
		
		}
	}

    public void registerVehicle(){
        double priceBase=0;
        String mark ="";
        String model="";
        double cylinder=0;
        double mileager=0;
        String licensePlate=""; 
        String state="";
        boolean ch = false;
        String numDoor="";
        String windowPolarized="";
        double capacityGasoline=0;
        String typeVehicle="";
        String typeCar="";
        boolean chs= false;
        String typeMotorcycle="";
        String typeCarsModel="";
        double capacityTank=0;
        double batteryDuration=0;
        String gasType="";
        String chargerType="";
        double priceDocument=0;
        String year="";
        String image="";
        String dateExpired="";
        String typeDocument= "";

        while(ch==false){
            System.out.println("What is Vehicle: 1=Car , 2=MotoCycle");
            typeVehicle=sc.nextLine();
            if(!typeVehicle.equals("1") && !typeVehicle.equals("2")){
                System.out.println("Error, please try option");
            }else{
                ch=true;
            }
        
        }

        if(typeVehicle.equals("1")){
            while(chs==false){    
                System.out.println("What is car: 1=Car in gas , 2=Car in hybrid, 3=Car is electric");
                typeCar= sc.nextLine();           
                if(!typeCar.equals("1") && !typeCar.equals("2") && !typeCar.equals("3")){
                    System.out.println("Error, please try option");
                }else{
                    chs=true;
                }
            } 
            if(typeCar.equals("1")){
                
                chs=false;
                while(chs==false){
                    System.out.println("What is type vehicle: 1=Sedan , 2=Pickup Truck");
                    typeCarsModel = sc.nextLine();
                    if(!typeCarsModel.equals("1") && !typeCarsModel.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                }
                System.out.println("Price base");
                priceBase = sc.nextDouble();

                System.out.println("Model");
                sc.nextLine();
                model= sc.nextLine();

                System.out.println("Mark");
                mark=sc.nextLine();
        
                System.out.println("Cylinder");
                cylinder = sc.nextDouble();

                System.out.println("Mileager");
                mileager= sc.nextDouble();

                System.out.println("License plate");
                sc.nextLine();
                licensePlate= sc.nextLine();

                System.out.println("Number the door");
                numDoor = sc.nextLine();

                System.out.println("Capacity tank(Gallons)");
                capacityTank = sc.nextDouble();

                
                chs=false;
                while(chs==false){    
                    System.out.println("Gasoline type: 1=Extra , 2=Current , 3= Diesel");
                    gasType = sc.nextLine();
                    if(!gasType.equals("1") && !gasType.equals("2") && !gasType.equals("3")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                } 

                chs=false;
                while(chs==false){
                    System.out.println("Does your car have tinted window? 1=Yes , 2= No");
                    windowPolarized= sc.nextLine();
                    if(!windowPolarized.equals("1") && !windowPolarized.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                    chs=true;
                    }
                    
                }
                chs=false;
                while(chs==false){    
                    System.out.println("State: 1=New , 2=Used");
                    state = sc.nextLine();
                    if(!state.equals("1") && !state.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                }
                parking.addCarGas(priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, licensePlate, state, typeCarsModel, typeCar, gasType);
           
            }else if(typeCar.equals("2")){
                chs=false;
                while(chs==false){
                    System.out.println("What is type vehicle: 1=Sedan , 2=Pickup Truck");
                    typeCarsModel = sc.nextLine();
                    if(!typeCarsModel.equals("1") && !typeCarsModel.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                }
            
                System.out.println("Price base");
                priceBase = sc.nextDouble();

                System.out.println("Model");
                sc.nextLine();
                model= sc.nextLine();

                System.out.println("Mark");
                mark=sc.nextLine();
        
                System.out.println("Cylinder");
                cylinder = sc.nextDouble();

                System.out.println("Mileager");
                mileager= sc.nextDouble();

                System.out.println("License plate");
                sc.nextLine();
                licensePlate= sc.nextLine();

                System.out.println("Number the door");
                numDoor = sc.nextLine();

                System.out.println("Capacity tank(Gallons)");
                capacityTank = sc.nextDouble();

                System.out.println("Battery duration?");
                batteryDuration = sc.nextDouble();


                chs=false;
                while(chs==false){    
                    System.out.println("Gasoline type: 1=Extra , 2=Current , 3= Diesel");
                    gasType = sc.nextLine();
                    if(!gasType.equals("1") && !gasType.equals("2") && !gasType.equals("3")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                }

                System.out.println("Baterry duration");
                batteryDuration= sc.nextDouble();

                chs=false;
                while(chs==false){    
                    System.out.println("Battery type: 1=Normal , 2=Fast");
                    chargerType = sc.nextLine();
                    if(!chargerType.equals("1") && !chargerType.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                } 

                chs=false;
                while(chs==false){
                    System.out.println("Does your car have tinted window? 1=Yes , 2= No");
                    windowPolarized= sc.nextLine();
                    if(!windowPolarized.equals("1") && !windowPolarized.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                    
                }
                
                chs=false;
                while(chs==false){    
                    System.out.println("State: 1=New , 2=Used");
                    state = sc.nextLine();
                    if(!state.equals("1") && !state.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                }

                
                System.out.println("\nDocument Vehicle\n");


                System.out.println("\nSoat\n");

                System.out.println("Price soat:");
                priceDocument= sc.nextDouble();

                System.out.println("Year");
                year= sc.nextLine();

                System.out.println("Date expire");
                dateExpired= sc.nextLine();

                System.out.println("Image");
                image = sc.nextLine();



                parking.addCarHybrid(priceDocument,year,dateExpired,image,priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, 
                                     batteryDuration, licensePlate, state, typeCarsModel, typeCar, chargerType, gasType);

            }else if(typeCar.equals("3")){
                chs=false;
                while(chs==false){
                    System.out.println("What is type vehicle: 1=Sedan , 2=Pickup Truck");
                    typeCarsModel = sc.nextLine();
                    if(!typeCarsModel.equals("1") && !typeCarsModel.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                }
            
                System.out.println("Price base");
                priceBase = sc.nextDouble();

                System.out.println("Model");
                sc.nextLine();
                model= sc.nextLine();

                System.out.println("Mark");
                mark=sc.nextLine();
        
                System.out.println("Cylinder");
                cylinder = sc.nextDouble();

                System.out.println("Mileager");
                mileager= sc.nextDouble();

                System.out.println("License plate");
                sc.nextLine();
                licensePlate= sc.nextLine();

                System.out.println("Number the door");
                numDoor = sc.nextLine();

                System.out.println("Battery duration?");
                batteryDuration = sc.nextDouble();

                chs=false;
                while(chs==false){    
                    System.out.println("Battery type: 1=Normal , 2=Fast");
                    chargerType = sc.nextLine();
                    if(!chargerType.equals("1") && !chargerType.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                } 

                chs=false;
                while(chs==false){
                    System.out.println("Does your car have polarized window? 1=Yes , 2= No");
                    windowPolarized= sc.nextLine();
                    if(!windowPolarized.equals("1") && !windowPolarized.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                    chs=true;
                    }
                    
                }
                chs=false;
                while(chs==false){    
                    System.out.println("State: 1=New , 2=Used");
                    state = sc.nextLine();
                    if(!state.equals("1") && !state.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                }

                parking.addCarElectric(priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, batteryDuration, licensePlate, state, 
                                        typeCarsModel, typeCar, chargerType);
            }

        }else if(typeVehicle.equals("2")){
            
            chs=false;
            while(chs==false){
                System.out.println("Whats type motocycle is: 1=Standard , 2=Sporty , 3=Scooter , 4=Cross");
                typeMotorcycle=sc.nextLine();
                if(!typeMotorcycle.equals("1")&& !typeMotorcycle.equals("2") && !typeMotorcycle.equals("3") && !typeMotorcycle.equals("4")){
                    System.out.println("Error, please try option");
                }else{
                chs=true;
                }
            }
            
            System.out.println("Price base");
            priceBase = sc.nextDouble();
            
            System.out.println("Model");
            sc.nextLine();
            model= sc.nextLine();
            
            System.out.println("Mark");
            mark=sc.nextLine();
        
            System.out.println("Cylinder");
            cylinder = sc.nextDouble();
            
            System.out.println("Mileager");
            mileager= sc.nextDouble();
            
            System.out.println("License plate");
            sc.nextLine();
            licensePlate= sc.nextLine();
                    
            chs=false;
            while(chs==false){    
                System.out.println("Gasoline type: 1=Extra , 2=Current , 3= Diesel");
                gasType = sc.nextLine();
                if(!gasType.equals("1") && !gasType.equals("2") && !gasType.equals("3")){
                    System.out.println("Error, please try option");
                }else{
                    chs=true;
                }
            } 
            
            chs=false;
            while(chs==false){    
                System.out.println("State: 1=New , 2=Used");
                state = sc.nextLine();
                if(!state.equals("1") && !state.equals("2")){
                    System.out.println("Error, please try option");
                }else{
                    chs=true;
                }
            } 

            parking.addMotocycle(priceBase, mark, model, cylinder, mileager, capacityGasoline, licensePlate, state, typeMotorcycle, gasType);
        }
    }
    
	
	public void showPriceTotal() {
		
		System.out.println();
		
	}

    public void showReportVehicle(){
        System.out.println(parking.getVehicle().toString());
    }

    public void showDocumentStatuses(){
        System.out.println();
    }

    public void generateMapParking(){
        System.out.println();
    }
    
    public void generateOccupancyReportParking(){
        System.out.println();
    }

    
    
}