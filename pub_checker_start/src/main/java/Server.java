public class Server {
    public boolean canServeGuest(Guest guest) {

        //guest age over 18?

        if (guest.getAge() >= 18 && guest.getWallet() >=5) {
            return true;
        }
        return false;
    }
}
