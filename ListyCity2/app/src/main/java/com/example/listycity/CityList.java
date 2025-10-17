package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A container for {{City}} objects with basic list operations:
 * add unique cities, check membership, delete, count, and get a sorted view.
 */
public class CityList {
    /** Backing store; not exposed directly. */
    private final ArrayList<City> cities = new ArrayList<>();

    /**
     * Adds a city if it does not already exist.
     *
     * @param city the city to add
     * @throws IllegalArgumentException if the city already exists
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists");
        }
        cities.add(city);
    }

    /**
     * Checks whether the list contains the given city.
     *
     * @param city the city to check
     * @return true if the city exists in the list; false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city that exists.
     *
     * @param city the city to delete
     * @throws IllegalArgumentException if the city is not in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City does not exist");
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities currently stored.
     *
     * @return the number of cities
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * Returns an unmodifiable, lexicographically sorted view of cities.
     *
     * @return a sorted, unmodifiable list of cities
     */
    public List<City> getCities() {
        ArrayList<City> copy = new ArrayList<>(cities);
        Collections.sort(copy);
        return Collections.unmodifiableList(copy);
    }
}
