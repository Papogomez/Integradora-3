package model;
public class GassCar extends Car implements GasConsumer{
    private double capacityTank;
    private String gasType;

    private GasType gasTypeVehicle;

    public GassCar(double priceBase, String mark, String model, double cylinder, 
                    double mileager,String numDoor, String windowPolarized,double capacityTank,String licensePlate, 
                    String state,String typeCarsModel,String typeCar,String gasType) {
        super(priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, licensePlate, state, typeCarsModel, typeCar);
        this.capacityTank = capacityTank;
        this.gasType = gasType;

        
        gasTypeVehicle = null;

        if(gasType.equals("1")){
            gasTypeVehicle=gasTypeVehicle.Extra;
        }else if(gasType.equals("2")){
            gasTypeVehicle=gasTypeVehicle.Current;
        }else if(gasType.equals("3")){
            gasTypeVehicle= gasTypeVehicle.Diesel;
        }
        
    }
    
    @Override
    public double calculateGasConsumer() {
        double total = 0;
        //Para autos a gasolina: capacidad del tanque * (cilindraje / 150)  
        total= capacityTank*(super.getCylinder()/150);
        return total;
    }

    /**
     * @return double return the capacityTank
     */
    public double getCapacityTank() {
        return capacityTank;
    }

    /**
     * @param capacityTank the capacityTank to set
     */
    public void setCapacityTank(double capacityTank) {
        this.capacityTank = capacityTank;
    }

    /**
     * @return String return the gasType
     */
    public String getGasType() {
        return gasType;
    }

    /**
     * @param gasType the gasType to set
     */
    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    /**
     * @return GasType return the gasTypeVehicle
     */
    public GasType getGasTypeVehicle() {
        return gasTypeVehicle;
    }

    /**
     * @param gasTypeVehicle the gasTypeVehicle to set
     */
    public void setGasTypeVehicle(GasType gasTypeVehicle) {
        this.gasTypeVehicle = gasTypeVehicle;
    }
    
    public String toString(){
        return  super.toString()+
                "Capacity tank: "+capacityTank+"\n"+
                "Consumer gasoline: "+(calculateGasConsumer())+"\n"+
                "Gasoline type: "+gasType+"\n";
    
    }
}