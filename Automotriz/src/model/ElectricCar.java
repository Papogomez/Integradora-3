package model;

public class ElectricCar extends Car implements BatteryConsumer{
    private double batteryDuration;
    private String chargeType;

    private ChargeType chargeTypeVehicle;

    public ElectricCar(double priceBase, String mark, String model, double cylinder, double mileager,
                        String numDoor, String windowPolarized,double batteryDuration,String licensePlate, String state, 
                        String typeCarsModel,String typeCar,String chargeType) {
        super(priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, licensePlate, state, typeCarsModel, typeCar);
        this.batteryDuration = batteryDuration;
        this.chargeType = chargeType;
        
        chargeTypeVehicle = null;

        if(chargeType.equals("1")){
            chargeTypeVehicle = chargeTypeVehicle.Normal;
        }else if(chargeType.equals("2")){
            chargeTypeVehicle = chargeTypeVehicle.Fast;
        }
    }



    @Override
    public double calculateBatteryConsumer() {
       double total = 0;
        //Si el tipo de cargador es rápido: (duración batería + 13) * (cilindraje / 100)
        //Si el tipo de cargador es normal: (duración batería + 18) * (cilindraje / 100)

        if(chargeType.equals("1")){
            total= ((batteryDuration+ 18) * (super.getCylinder()/100));
        }else if(chargeType.equals("2")){
            total = ((batteryDuration+ 13)* (super.getCylinder()/100));
        }

        return total;
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
        return  super.toString()+
                "Battery duration: "+batteryDuration+"\n"+
                "Consumer battery: "+(calculateBatteryConsumer())+"\n";
    
    }

}