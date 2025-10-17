package com.example.listycity;

import java.util.Objects;

/**
 * Represents a City with a name and province.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructs a City.
     *
     * @param city the city name
     * @param province the province/state/region name
     */
    public City(String city, String province) {
        if (city == null || province == null) {
            throw new IllegalArgumentException("City and province must be non-null");
        }
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     *
     * @return the city name
     */
    public String getCityName() {
        return city;
    }

    /**
     * Gets the province/region name.
     *
     * @return the province/region name
     */
    public String getProvinceName() {
        return province;
    }

    /**
     * Compares this city to another by city name, then by province.
     *
     * @param other the other city to compare with
     * @return a negative integer, zero, or a positive integer as this city
     */
    @Override
    public int compareTo(City other) {
        int byName = this.city.compareTo(other.city);
        return (byName != 0) ? byName : this.province.compareTo(other.province);
    }

    /**
     * Checks equality based on city and province.
     *
     * @param o the object to compare with
     *
     * @return true if both city and province are equal; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city1 = (City) o;
        return city.equals(city1.city) && province.equals(city1.province);
    }

    /**
     * Computes a hash code consistent with equals.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
