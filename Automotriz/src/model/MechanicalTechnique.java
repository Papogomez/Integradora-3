package model;

public class MechanicalTechnique extends Document {
    private String gasLevel;


    public MechanicalTechnique(double price, String year, String yearExpired, String image,String gasLevel) {
        super(price, year, yearExpired,image);
        this.gasLevel = gasLevel;
    }

    /**
     * @return String return the gasLevel
     */
    public String getGasLevel() {
        return gasLevel;
    }

    /**
     * @param gasLevel the gasLevel to set
     */
    public void setGasLevel(String gasLevel) {
        this.gasLevel = gasLevel;
    }

    public String toString(){
        return super.toString()+
                "Level gas: "+gasLevel+"\n";
    }

}