package com.stacjaPogody.maven.eclipse.Model;

//Java program to implement a
//City class

//Defining a city class
public class City {

 // Initializing the properties
 // of the city class
 private String name;

 // Parameterized constructor to
 // initialize the city class
 public City(String name)
 {
     this.name = name;

 }

 // Getters to get the name and
 // temperature
 public String getName()
 {
     return name;
 }


 // Overriding the toString method
 // to return the name and temperature
 @Override
 public String toString()
 {
     return name + " --> ";
 }
}
