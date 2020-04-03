package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    List<Address> collect(List<Profile> profiles) {
        List<Address> addresses = new ArrayList<>();
        addresses = profiles.stream().map(profile -> profile.address).
                sorted(Comparator.comparing(Address::getCity)).distinct().
                collect(Collectors.toList());
        return addresses;
    }
}

