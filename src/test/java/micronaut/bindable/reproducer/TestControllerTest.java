package micronaut.bindable.reproducer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
public class TestControllerTest {

    @Inject
    @Client("/test")
    RxHttpClient client;

    @Test
    public void testIndex() {
        assertEquals("123", client.toBlocking().retrieve("/path?q=123"));
    }
}
