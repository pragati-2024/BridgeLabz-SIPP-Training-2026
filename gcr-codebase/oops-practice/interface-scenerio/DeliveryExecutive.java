interface FoodDelivery {

    void deliverFood(String customer);

    default void trackOrder() {
        System.out.println("Tracking Food Order...");
    }

    static String generateDeliveryCode() {
        return "FD" + (int)(Math.random() * 1000);
    }
}

interface GroceryDelivery {

    void deliverGroceries(String customer);

    default void trackOrder() {
        System.out.println("Tracking Grocery Order...");
    }
}

public class DeliveryExecutive
        implements FoodDelivery, GroceryDelivery {

    @Override
    public void deliverFood(String customer) {
        System.out.println("Food delivered to "
                + customer);
    }

    @Override
    public void deliverGroceries(String customer) {
        System.out.println("Groceries delivered to "
                + customer);
    }

    @Override
    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }

    public static void main(String[] args) {

        String[] customers = {
                "Pragati",
                "Rahul",
                "Aman"
        };

        DeliveryExecutive executive =
                new DeliveryExecutive();

        for (String customer : customers) {

            System.out.println("\nCustomer: "
                    + customer);

            executive.trackOrder();

            System.out.println("Delivery Code: "
                    + FoodDelivery.generateDeliveryCode());

            executive.deliverFood(customer);
            executive.deliverGroceries(customer);
        }
    }
}