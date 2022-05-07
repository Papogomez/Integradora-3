package model;

public class HybridCar extends Car implements GasConsumer{
    private double capacityTank;
    private double batteryDuration;
    private String chargeType;
    private String gasType;


    private GasType gasTypeVehicle;
    private ChargeType chargeTypeVehicle;
 

    public HybridCar(double priceBase, String mark, String model, double cylinder, double mileager,
                    String numDoor, String windowPolarized,double capacityTank,double batteryDuration,
                    String licensePlate, String state,String typeCarsModel,String typeCar,String chargeType,String gasType) {
        super(priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, licensePlate, state, typeCarsModel, typeCar);
        this.capacityTank = capacityTank;
        this.batteryDuration = batteryDuration;                
        this.chargeType = chargeType;
        
        gasTypeVehicle = null;

        if(gasType.equals("1")){
            gasTypeVehicle=gasTypeVehicle.Extra;
        }else if(gasType.equals("2")){
            gasTypeVehicle=gasTypeVehicle.Current;
        }else if(gasType.equals("3")){
            gasTypeVehicle= gasTypeVehicle.Diesel;
        }

        chargeTypeVehicle = null;
        
        if(chargeType.equals("1")){
            chargeTypeVehicle = chargeTypeVehicle.Normal;
        }else if(chargeType.equals("2")){
            chargeTypeVehicle = chargeTypeVehicle.Fast;
        }
    }

    @Override
    public double calculateGasConsumer() {
        //Para autos híbridos: capacidad del tanque * (cilindraje / 180
        double total = 0;

        total = capacityTank * (super.getCylinder()/180);
        return total;
    }

    public double calculateBatteryConsumer(){
        double total=0;
        // Si el tipo de cargador es rápido: duración batería * (cilindraje / 200)
        // Si el tipo de cargador es normal: (duración batería + 7) * (cilindraje / 200) 

        if(chargeType.equals("1")){
            total=batteryDuration*(super.getCylinder()/200);
        }else if(chargeType.equals("2")){
            total=((batteryDuration+7)*(super.getCylinder()/200));
        }

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
     * @return double return the batteryDuration
     */
    public double getBatteryDuration() {
        return batteryDuration;
    }

    /**
     * @param batteryDuration the batteryDuration to set
     */
    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }

    /**
     * @return String return the chargeType
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * @param chargeType the chargeType to set
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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

    /**
     * @return ChargeType return the chargeTypeVehicle
     */
    public ChargeType getChargeTypeVehicle() {
        return chargeTypeVehicle;
    }

    /**
     * @param chargeTypeVehicle the chargeTypeVehicle to set
     */
    public void setChargeTypeVehicle(ChargeType chargeTypeVehicle) {
        this.chargeTypeVehicle = chargeTypeVehicle;
    }

    public String toString(){
        return super.toString()+"Consumer gasoline: "+//+"\n"+
                                "Capacity tank: "+ capacityTank+"\n"+
                                "Consumer battery: "+(calculateBatteryConsumer()) +""+
                                "Duration battery: "+batteryDuration+"\n"+
                                "Gasoline type: "+gasType+"\n"+
                                "Consumer gasoline: "+(calculateGasConsumer())+"\n"+
                                "Charger type: "+ chargeType+"\n";
    }
}
