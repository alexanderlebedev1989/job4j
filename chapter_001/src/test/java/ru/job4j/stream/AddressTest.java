package ru.job4j.stream;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AddressTest {
    @Test
    public void whenOrderAddress() {
        Address one = new Address("Ufa", "Lenina", 18, 35);
        Address two = new Address("Moscow", "Petrovskay", 45, 12);
        Address three = new Address("Klin", "Sovetskay", 19, 19);
        Profile p1 = new Profile(one);
        Profile p2 = new Profile(two);
        Profile p3 = new Profile(three);
        List<Profile> profiles = Arrays.asList(p1, p2, p3);
        List<Address> result = p1.collect(profiles);
        List<Address> expected = Arrays.asList(one, two, three);
        assertThat(result, is(expected));
    }
}
