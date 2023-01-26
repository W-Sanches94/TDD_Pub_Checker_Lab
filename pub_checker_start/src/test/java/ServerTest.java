import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;

    @BeforeEach
    public void setUp() {
        server = new Server();
        guest = new Guest("Jack",21,5,50);
        guest2 = new Guest("Jill",16,5,50);
        guest3 = new Guest("John",21,3,50);
        guest4 = new Guest("Jane",21,5,50);
        guest5 = new Guest("Joel",21,5,40);
    }

    // TODO: test that guest can only get served if over 18

    @Test
    public void canGuestOnlyGetServedIfOver18() {

        Boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);

        Boolean result2 = server.canServeGuest(guest2);
        assertThat(result2).isEqualTo(false);

    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    public void canGuestAffordDrink() {

        Boolean AffordDrink = server.canServeGuest(guest2);
        assertThat(AffordDrink).isEqualTo(false);

        AffordDrink = server.canServeGuest(guest3);
        assertThat(AffordDrink).isEqualTo(false);

        AffordDrink = server.canServeGuest(guest4);
        assertThat(AffordDrink).isEqualTo(true);

    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    @Test
    public void isGuestSoberEnough() {

        Boolean soberEnough = server.canServeGuest(guest4);
        assertThat(soberEnough).isEqualTo(true);

        soberEnough = server.canServeGuest(guest5);
        assertThat(soberEnough).isEqualTo(false);

    }

    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
