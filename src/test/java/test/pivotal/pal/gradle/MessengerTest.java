package test.pivotal.pal.gradle;

import io.pivotal.pal.gradle.Messenger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessengerTest {

    @Test
    public void testGetMessage() {
        Messenger messenger = new Messenger();

        assertEquals("hello world", messenger.getMessage());
    }
}