import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void 一円に満たない消費税は切り捨てられること() {
        assertThat(Main.calc(10), is(10));
    }

    @Test
    public void 一円を超える消費税は加算されること() {
        assertThat(Main.calc(30), is(31));
    }
}
