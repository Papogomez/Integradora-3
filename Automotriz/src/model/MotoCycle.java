package model;

public class MotoCycle extends Vehicle implements GasConsumer{
    private double capacityGasoline;
    private String typeMotorcycle;
    private String gasType;

    private TypeMotocycle typeMotocycle;
    private StateVehicle stateVehicle;
    private GasType gasTypeVehicle;

    public MotoCycle(double priceBase, String mark, String model, double cylinder, 
                    double mileager,double capacityGasoline,String licensePlate, String state, String typeMotorcycle,String gasType) {
        super(priceBase, mark, model, cylinder, mileager, licensePlate, state);
        this.capacityGasoline = capacityGasoline;
        this.typeMotorcycle = typeMotorcycle;
        this.gasType = gasType;

        stateVehicle=null;
        if(state.equals("1")){
            stateVehicle = stateVehicle.New;
        }else if(state.equals("2")){
            stateVehicle = stateVehicle.Used;
        }


        typeMotocycle= null;

        if(typeMotorcycle.equals("1")){
            typeMotocycle = typeMotocycle.Cross;
        }else if(typeMotorcycle.equals("2")){
            typeMotocycle = typeMotocycle.Scooter;
        }else if(typeMotorcycle.equals("3")){
            typeMotocycle = typeMotocycle.Sporty;
        }else if(typeMotorcycle.equals("4")){
            typeMotocycle = typeMotocycle.Standard;
        }

        gasTypeVehicle = null;

        if(gasType.equals("1")){
            gasTypeVehicle=gasTypeVehicle.Extra;
        }else if(gasType.equals("2")){
            gasTypeVehicle=gasTypeVehicle.Current;
        }else if(gasType.equals("3")){
            gasTypeVehicle= gasTypeVehicle.Diesel;
        }
    }

    /**
     * @return double return the capacityGasoline
     */
    public double getCapacityGasoline() {
        return capacityGasoline;
    }

    /**
     * @param capacityGasoline the capacityGasoline to set
     */
    public void setCapacityGasoline(double capacityGasoline) {
        this.capacityGasoline = capacityGasoline;
    }

    /**
     * @return String return the typeMotorcycle
     */
    public String getTypeMotorcycle() {
        return typeMotorcycle;
    }

    /**
     * @param typeMotorcycle the typeMotorcycle to set
     */
    public void setTypeMotorcycle(String typeMotorcycle) {
        this.typeMotorcycle = typeMotorcycle;
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
     * @return TypeMotocycle return the typeMotocycle
     */
    public TypeMotocycle getTypeMotocycle() {
        return typeMotocycle;
    }

    /**
     * @param typeMotocycle the typeMotocycle to set
     */
    public void setTypeMotocycle(TypeMotocycle typeMotocycle) {
        this.typeMotocycle = typeMotocycle;
    }

    /**
     * @return StateVehicle return the stateVehicle
     */
    public StateVehicle getStateVehicle() {
        return stateVehicle;
    }

    /**
     * @param stateVehicle the stateVehicle to set
     */
    public void setStateVehicle(StateVehicle stateVehicle) {
        this.stateVehicle = stateVehicle;
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

    @Override
    public double calculateGasConsumer() {
        double total = 0;
        // Para motocicletas: capacidad del tanque * (cilindraje / 75)
        total= capacityGasoline*(super.getCylinder()/75);
        return total;
    }

    public String toString(){
        return super.toString()+
               "Capacity gasoline: "+capacityGasoline+"\n"+
               "Consumer gasoline: "+(calculateGasConsumer())+"\n"+
               "Type motocycle: "+ typeMotorcycle+ "\n"+
               "Gasoline type: "+gasType+"\n";
    }
}

