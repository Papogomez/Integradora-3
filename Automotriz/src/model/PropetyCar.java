package model;

public class PropetyCar extends Document {

    public PropetyCar(double price, String year, String yearExpired, String image) {
        super(price, year,yearExpired, image);
    }

    public String toString(){
        return super.toString();
    }
}