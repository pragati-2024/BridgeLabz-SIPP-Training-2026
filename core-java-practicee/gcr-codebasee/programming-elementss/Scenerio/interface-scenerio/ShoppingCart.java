interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

public class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {
        return code.startsWith("SAVE")
                && CouponValidator.isLengthValid(code);
    }

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "OFF20",
                "SAVE",
                "SAVE50",
                "DISC100"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid Coupon");
            } else {
                System.out.println(coupon + " -> Invalid Coupon");
            }
        }
    }
}