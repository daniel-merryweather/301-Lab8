package com.example.simpleparadox.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;
    private boolean isCaptial;

    City(String city, String province){
        this.city = city;
        this.province = province;
        this.isCaptial = false;
    }
    
    City(String city, String province, boolean isCaptial){
        this.city = city;
        this.province = province;
        this.isCaptial = isCaptial;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }
    
    boolean getIsCaptial(){
        return this.isCaptial;
    }

    @Override
    public int compareTo(City o) {
        return city.compareTo(o.getCityName());
    }
}
