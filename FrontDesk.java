public class FrontDesk {
    public void requestValetService(String plateNumber) {
        Valet valet = new Valet(plateNumber);
        valet.performService();
    }

    public void requestHouseKeepingService(int roomNumber) {
        HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.performService();
    }

    public void requestCartService(int numberOfCarts) {
        Cart cart = new Cart(numberOfCarts);
        cart.performService();
    }
}