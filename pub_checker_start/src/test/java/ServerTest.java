import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest;
    Guest guest2;

    @BeforeEach
    public void setUp() {
        server = new Server();
        guest = new Guest("Jack",16);
        guest2 = new Guest("Jill",21);
    }

    // TODO: test that guest can only get served if over 18

    @Test
    public void canGuestOnlyGetServedIfOver18() {

        Boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(false);

        boolean result2 = server.canServeGuest(guest2);
        assertThat(result2).isEqualTo(true);

    }



    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
