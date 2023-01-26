public class Server {
    public boolean canServeGuest(Guest guest) {

        //guest age over 18?

        if (guest.getAge() >= 18) {
            return true;
        }
        return false;


    }
}
