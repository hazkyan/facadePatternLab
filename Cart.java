public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart() {
        System.out.println("Cart: Requesting " + numberOfCarts + " luggage cart(s).");
    }

    @Override
    public void performService() {
        requestCart();
    }
}