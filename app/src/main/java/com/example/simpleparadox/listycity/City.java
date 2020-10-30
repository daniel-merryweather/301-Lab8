package com.example.simpleparadox.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;
    private boolean isCapital;

    City(String city, String province){
        this.city = city;
        this.province = province;
        this.isCapital = false;
    }
    
    City(String city, String province, boolean isCapital){
        this.city = city;
        this.province = province;
        this.isCapital = isCapital;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }
    
    boolean getIsCapital(){
        return this.isCapital;
    }

    @Override
    public int compareTo(City o) {
        return city.compareTo(o.getCityName());
    }
}
