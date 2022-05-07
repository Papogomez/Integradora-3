package model;

public class Document{
    private double price;
    private String year;
    private String yearExpired;
    private String image;
    

    public Document(double price, String year, String yearExpired, String image) {
        this.price = price;
        this.year = year;
        this.yearExpired = yearExpired;
        this.image = image;
    }

    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return String return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return String return the yearExpired
     */
    public String getYearExpired() {
        return yearExpired;
    }

    /**
     * @param yearExpired the yearExpired to set
     */
    public void setYearExpired(String yearExpired) {
        this.yearExpired = yearExpired;
    }

    /**
     * @return String return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    public String toString(){
        return "Price: "+price+"\n"+
                "Year: "+year+"\n"+
                "Year expired"+yearExpired+"\n"+
                "Image: "+image+"\n";
    }

}