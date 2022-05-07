package model;

public abstract class Vehicle{
    private double priceBase;
    private double salePrice;
    private String mark;
    private String model;
    private double cylinder;
    private double mileager;
    private String licensePlate;
    private String state;


    private StateVehicle stateVehicle;



    public Vehicle(double priceBase, String mark, String model,double cylinder, double mileager, String licensePlate, String state){
        this.priceBase = priceBase;
        this.salePrice = salePrice;
        this.mark = mark;
        this.model = model;
        this.cylinder = cylinder;
        this.mileager = mileager;
        this.licensePlate = licensePlate;
        this.state = state;

        stateVehicle = null;
        if(state.equals("1")){
            stateVehicle = stateVehicle.New;
        }else if(state.equals("2")){
            stateVehicle = stateVehicle.Used;
        }
    }

    public void calculateSalePrice(){

    }

    /**
     * @return double return the priceBase
     */
    public double getPriceBase() {
        return priceBase;
    }

    /**
     * @param priceBase the priceBase to set
     */
    public void setPriceBase(double priceBase) {
        this.priceBase = priceBase;
    }

    /**
     * @return double return the salePrice
     */
    public double getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return String return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return String return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return double return the cylinder
     */
    public double getCylinder() {
        return cylinder;
    }

    /**
     * @param cylinder the cylinder to set
     */
    public void setCylinder(double cylinder) {
        this.cylinder = cylinder;
    }

    /**
     * @return double return the mileager
     */
    public double getMileager() {
        return mileager;
    }

    /**
     * @param mileager the mileager to set
     */
    public void setMileager(double mileager) {
        this.mileager = mileager;
    }

    /**
     * @return String return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * @return String return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    public String toString(){
        return  "Price base: "+priceBase+"\n"+
                "Sale price: "+salePrice+"\n"+
                "Mark: "+mark+"\n"+
                "Model: "+model+"\n"+
                "Cylinder: "+cylinder+"\n"+
                "Mileager: "+mileager+"\n"+
                "License plate: "+licensePlate+"\n"+
                "State: "+state+"\n";
    }

}