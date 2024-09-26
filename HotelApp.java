public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValetService("ABC123");

        frontDesk.requestHouseKeepingService(101);

        frontDesk.requestCartService(2);
    }
}