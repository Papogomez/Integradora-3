package model;
import java.util.ArrayList;;

public class ControlParking{
    private ArrayList<Vehicle> vehicles;
	private ArrayList<Document> documents;
    

    public ControlParking() {
        vehicles = new ArrayList<Vehicle>();
		documents = new ArrayList<Document>();
    }
 
    
    public int findVehicle(String LicensePlate){
		boolean flagVehicle= false;
		int indexVehicle=-1;
		for(int i=0; i< vehicles.size() && !flagVehicle; i++){
			if(vehicles.get(i) instanceof Vehicle){
				if(vehicles.get(i)!=null && ((Vehicle)vehicles.get(i)).getLicensePlate().equals(LicensePlate)){
					flagVehicle=true;
					indexVehicle = i;
				}
			}
		}
		return indexVehicle;
	}

	/*public void addCar(double priceBase, double salePrice, String mark, String model, double cylinder, 
						double mileager,String numDoor, String windowPolarized,String licensePlate, String state,String typeCarsModel,String typeCar,
						double batteryDuration, double consumerBattery,double capacityTank,double consumerGasoline,String gasType, String chargerType){

		/*ElectricCar electricCar = new ElectricCar(priceBase, salePrice, mark, model, cylinder, mileager, numDoor, windowPolarized, batteryDuration, consumerBattery, licensePlate, state, typeCarsModel, typeCar);
		HybridCar hybridCar = new HybridCar(priceBase, salePrice, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, consumerGasoline, licensePlate, state, typeCarsModel, typeCar);
		GassCar gassCar = new GassCar(priceBase, salePrice, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, consumerGasoline, licensePlate, state, typeCarsModel, typeCar);
		*/
		/*vehicles.add(new ElectricCar(priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, batteryDuration, licensePlate, state, typeCarsModel, typeCar,gasType));
		vehicles.add(new HybridCar(priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, batteryDuration, licensePlate, state, typeCarsModel, typeCar,chargerType,gasType));
		vehicles.add(new GassCar(priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, licensePlate, state, typeCarsModel, typeCar, chargerType));
	}*/

	public void addCarElectric(double price, String year, String yearExpired, String image,double priceBase, String mark, String model, double cylinder, double mileager,
		String numDoor, String windowPolarized,double batteryDuration,String licensePlate, String state, 
		String typeCarsModel,String typeCar,String chargeType){
			
		vehicles.add(new ElectricCar(priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, batteryDuration, licensePlate, state, typeCarsModel, typeCar, chargeType));
		documents.add(new Document(price,year,yearExpired,image));
	}

	public void addCarGas(double price, String year,String yearExpired, String image,double priceBase, String mark, String model, double cylinder, 
		double mileager,String numDoor, String windowPolarized,double capacityTank,String licensePlate, 
		String state,String typeCarsModel,String typeCar,String gasType){

		vehicles.add(new GassCar(priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, licensePlate, state, typeCarsModel, typeCar,gasType));
		documents.add(new Document(price, year,yearExpired, image));
	}

	public void addCarHybrid(double price, String year,String yearExpired, String image,double priceBase, String mark, String model, double cylinder, double mileager,
		String numDoor, String windowPolarized,double capacityTank,double batteryDuration,
		String licensePlate, String state,String typeCarsModel,String typeCar,String chargeType,String gasType){
		
		vehicles.add(new HybridCar(priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, batteryDuration, licensePlate, state, typeCarsModel, typeCar, chargeType, gasType));
		documents.add(new Document(price, year,yearExpired, image));
	}

	public void addMotocycle(double price, String year, String yearExpired, String image,double priceBase, String mark, String model,double cylinder, 
							double mileager,double capacityGasoline,String licensePlate, String state, String typeMotorcycle,String gasType){
        vehicles.add(new MotoCycle(priceBase, mark, model, cylinder, mileager, capacityGasoline, licensePlate, state, typeMotorcycle,gasType));
		documents.add(new Document(price, year,yearExpired, image));
	}



	public String getVehicle(){
		String out = "";
		boolean exit = false;
		for(int i= 0; i< vehicles.size() && exit == false; i++){
			if(vehicles.get(i) != null){
				out +=((Vehicle)vehicles.get(i)).toString();
			}else{
				exit =true;
			}
		}
		return out;
	}

	
}