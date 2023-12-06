/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

/**
 *
 * @author PC
 */
public class User {

     String First_name;
     String Second_name;
     String user_name;
     String password;
//     String DateOfBirth;
     String Email;

    public User() {
    }

    public User(String First_name, String Second_name, String user_name, String password, String Email ) {
        this.First_name = First_name;
        this.Second_name = Second_name;
        this.user_name = user_name;
        this.password = password;
//        this.DateOfBirth = DateOfBirth;
        this.Email = Email;
    }

    public User(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;

    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public String getFirst_name() {
        return First_name;
    }

    public String getSecond_name() {
        return Second_name;
    }

//    public String getDateOfBirth() {
//        return DateOfBirth;
//    }

    public String getEmail() {
        return Email;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public void setSecond_name(String Second_name) {
        this.Second_name = Second_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void setDateOfBirth(String DateOfBirth) {
//        this.DateOfBirth = DateOfBirth;
//    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
