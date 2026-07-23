class CourseFee {
    int fee;
    int discountPercent;

    CourseFee(int fee, int discountPercent) {
        this.fee = fee;
        this.discountPercent = discountPercent;
    }

    void calculateDiscount() {
        double discount = (fee * discountPercent) / 100.0;
        double discountedPrice = fee - discount;

        System.out.println("The Course Fee is INR " + fee);
        System.out.println("The Discount Amount is INR " + discount);
        System.out.println("The Fee to Pay is INR " + discountedPrice);
    }

    public static void main(String[] args) {
        CourseFee obj = new CourseFee(125000, 10);
        obj.calculateDiscount();
    }
}