package model;

public class Car extends Vehicle{
    private String numDoor;
    private String windowPolarized;
    private String typeCarsModel;
    private String typeCar;
    
    private TypeCarModel typeCarModel;
    private StateVehicle stateVehicle;

    public Car(double priceBase, String mark, String model, double cylinder, 
                double mileager,String numDoor, String windowPolarized,String licensePlate, String state,String typeCarsModel,String typeCar) {
        super(priceBase, mark, model, cylinder, mileager, licensePlate, state);
        this.numDoor = numDoor;
        this.windowPolarized = windowPolarized;
        this.typeCarsModel = typeCarsModel;
        this.typeCar = typeCar;
        
        typeCarModel=null;
        if(typeCarsModel.equals("1")){
            typeCarModel=typeCarModel.Sedan;
        }else if(typeCarsModel.equals("2")){
            typeCarModel = typeCarModel.PickupTruck;
        }

        stateVehicle=null;
        if(state.equals("1")){
            stateVehicle= stateVehicle.New;
        }else if(state.equals("2")){
            stateVehicle = stateVehicle.Used;
        }
    }

    /**
     * @return String return the numDoor
     */
    public String getNumDoor() {
        return numDoor;
    }

    /**
     * @param numDoor the numDoor to set
     */
    public void setNumDoor(String numDoor) {
        this.numDoor = numDoor;
    }

    /**
     * @return String return the windowPolarized
     */
    public String getWindowPolarized() {
        return windowPolarized;
    }

    /**
     * @param windowPolarized the windowPolarized to set
     */
    public void setWindowPolarized(String windowPolarized) {
        this.windowPolarized = windowPolarized;
    }

    /**
     * @return String return the typeCarsModel
     */
    public String getTypeCarsModel() {
        return typeCarsModel;
    }

    /**
     * @param typeCarsModel the typeCarsModel to set
     */
    public void setTypeCarsModel(String typeCarsModel) {
        this.typeCarsModel = typeCarsModel;
    }

    /**
     * @return String return the typeCar
     */
    public String getTypeCar() {
        return typeCar;
    }

    /**
     * @param typeCar the typeCar to set
     */
    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    /**
     * @return TypeCarModel return the typeCarr
     */
    public TypeCarModel getTypeCarr() {
        return typeCarModel;
    }

    /**
     * @param typeCarr the typeCarr to set
     */
    public void setTypeCarr(TypeCarModel typeCarModel) {
        this.typeCarModel = typeCarModel;
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

    public String toString(){
        return super.toString()+"Car"+"\n"+
               "Num door: "+numDoor+"\n"+
               "Window polarized: "+windowPolarized+"\n"+
               "Type model car: "+ typeCarModel;
    }

}
