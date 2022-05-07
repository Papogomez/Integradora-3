package model;

public class Soat extends Document{
    private double coverPrice;


    public Soat(double price, String year, String yearExpired, String image,double coverPrice) {
        super(price, year,yearExpired, image);
        this.coverPrice = coverPrice;
    }

    /**
     * @return double return the coverPrice
     */
    public double getCoverPrice() {
        return coverPrice;
    }

    /**
     * @param coverPrice the coverPrice to set
     */
    public void setCoverPrice(double coverPrice) {
        this.coverPrice = coverPrice;
    }

    public String toString(){
        return super.toString()+
                "Cove price: "+coverPrice+"\n";
    }
}