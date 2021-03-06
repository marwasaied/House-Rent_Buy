/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.InputStream;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class User {
    private String fName, lName, userName, pass, email,address;
    private int phoneNumber;
    private ArrayList <House> houses;
    private ArrayList <Notification> notifications;
    private ArrayList <Interest> interests;
    private InputStream photo;
    private boolean isAdmin;

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    public User(String fN, String lN, String pw, int phN, String mail, String username,String address,InputStream photo)
    {
        this.fName = fN;
       this. lName = lN;
       this. pass = pw;
        this.phoneNumber = phN;
       this. email = mail;
        this.userName = username;
        this.address=address;
        this.photo = photo;
    }

    public User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void setPhoto(InputStream photo) {
        this.photo = photo;
    }

    public InputStream getPhoto() {
        return photo;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    //Setters
    public void setfName(String fn)
    {
        fName = fn;
    }
    
    public void setlName(String ln)
    {
        lName = ln ;
    }
    public void  setuserName(String uName)
    {
        userName= uName;
    }
    public void setpass(String pss)
    {
        pass = pss;
    }
    public void  setemail(String mail)
    {
        email = mail;
    }
    public void setphoneNumber(int phNumber)
    {
        phoneNumber = phNumber;
    }

    public void setHouse(House house) {
        this.houses.add(house);
    }

    public void setNotification(Notification notification) {
        this.notifications.add(notification);
    }

    public void setInterest(Interest interest) {
        this.interests.add(interest);
    }
    
    
    //Getters
    public String getfName()
    {
        return fName;
    }
    
    public String getlName()
    {
        return lName;
    }
    public String getuserName()
    {
        return userName;
    }
    public String getpass()
    {
        return pass;
    }
    public String getemail()
    {
        return email;
    }
    public int getphoneNumber()
    {
        return phoneNumber;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public ArrayList<Notification> getNotifications() {
        return notifications;
    }

    public ArrayList<Interest> getInterests() {
        return interests;
    }
    
    
    
}
