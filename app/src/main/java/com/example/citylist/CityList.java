package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list of cities
     */
    public List<City> getCities(int n) {
        List<City> cityList = cities;

        if (n == 0) {
            Comparator<City> nameComparator = new Comparator<City>() {
                @Override
                public int compare(City city1, City city2) {
                    return city1.getCityName().compareTo(city2.getCityName());
                }
            };
            Collections.sort(cityList, nameComparator);
        }
        if (n == 1) {
            Comparator<City> provinceComparator = new Comparator<City>() {
                @Override
                public int compare(City city1, City city2) {
                    return city1.getProvinceName().compareTo(city2.getProvinceName());
                }
            };
            Collections.sort(cityList, provinceComparator);
        }
        return cityList;

    }
    /**
     * This deletes a city from the list if it exists
     * @param city
     */
    public void delete(City city){
        if(!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }
    /**
     * This return the size of citylist
     * @param()
     * @return
     */
    public int count(){
        return cities.size();
    }


}


