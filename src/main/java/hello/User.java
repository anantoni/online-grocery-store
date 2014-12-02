/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author anantoni
 */
public class User {
    
    @Size(min=3, max=40)
    private String username;

    @Size(min=3, max=40)
    private String firstName;
    
    @Size(min=3, max=40)
    private String lastName;
    
    @NotNull
    @Min(18)
    private Integer age;
    
    @NotNull
    @Min(0)
    private Integer credit;

    @NotNull
    @Min(0)
    private Integer currentBalance;
    
    @NotNull
    @Size(min=4, max=40)
    private String password;
    
    @NotNull
    @Size(min=6, max=60)
    private String email;
    
    @Size(min=2, max=40)
    private String street;
    
    @Size(min=2, max=40)
    private String town;
    
    @Size(min=5, max=5)
    private Integer postCode;
    
    @NotNull
    private Integer locationID;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Integer currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public Integer getLocationID() {
        return locationID;
    }

    public void setLocationID(Integer locationID) {
        this.locationID = locationID;
    }

    public String toString() {
        return "Person(Name: " + this.firstName + ", Age: " + this.age + ")";
    }

}
