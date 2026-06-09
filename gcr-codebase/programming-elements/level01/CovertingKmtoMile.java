public class CovertingKmtoMile {

    double kilometer;
    
    // Constructor
    CovertingKmtoMile(double kilometer) {
        this.kilometer = kilometer;
    }
    void convertToMiles() {
        double miles = kilometer * 1.6;

        System.out.println(
            "The distance " + kilometer +
            " km in miles is " + miles
        );
    }

    public static void main(String[] args) {

        CovertingKmtoMile obj = new CovertingKmtoMile(10.8);


        obj.convertToMiles();
    }
}