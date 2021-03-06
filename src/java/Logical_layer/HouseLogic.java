/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logical_layer;

import Classes.House;
import Classes.User;
import Model.HouseIO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class HouseLogic {
    HouseIO houseIo = new HouseIO();
    
    public  int getHouseID(House house) throws SQLException, ClassNotFoundException

    {
        return houseIo.getHouseID(house);
    }
     public int getUser(int houseID) throws ClassNotFoundException, SQLException{
         return houseIo.getUser(houseID);
     }
    public void addHouse( House house, User user) throws ClassNotFoundException, SQLException
    {
       
       houseIo.addhouse(house, user);
    }
    
    public void deleteHouse(String adName) throws ClassNotFoundException, SQLException {
        houseIo.deleteHouse(adName);
    }
    
    public void editProp(House house) throws ClassNotFoundException, SQLException
    {
        houseIo.edit(house);
        
    }
    
    public House getHouseByID (int houseID) throws ClassNotFoundException, SQLException{
        HouseIO houseIO = new HouseIO();
        House house = houseIO.selectHouses(houseID);
        return house;
    }
    
    public void rate(House house, int newRate) throws SQLException, ClassNotFoundException{
        int houseID=houseIo.getHouseID(house);
        double averageRate=calculateAverage(house, newRate);
        int sum=house.getTotalRates();
        int count=house.getCountRate();
        houseIo.rate(averageRate, houseID,sum, count );
    }
    
    public ArrayList<House> selectAllHouses () throws ClassNotFoundException, SQLException { 
        return houseIo.selectAllHouses();
    }
    
    public double calculateAverage( House house, int newrate){
        int sum=house.getTotalRates() +newrate;
        int count=house.getCountRate()+1;
        house.setCountRate(count);
        house.setTotalRates(sum);
        double avRate=(double)sum/count;
        house.setRate(avRate);

        return avRate;
    }
    
    public ArrayList<House> selectUserHouse(int userID) throws SQLException, ClassNotFoundException{
        ArrayList<House> houses = houseIo.selectUserHouse(userID);
        return houses;
    }
    public ArrayList<House> selectSuspendedHouses() throws ClassNotFoundException, SQLException{
        HouseIO houseIO =new HouseIO();
        ArrayList<House> suspendedHoeses =houseIO.selectSuspendedHouses();
        return suspendedHoeses;
        
    }
    
    
    public  static void main(String[] args) throws ClassNotFoundException, SQLException{
        HouseLogic houselogic = new HouseLogic();
        //House house = new House("departement with roof", "buy" , 300, 1, 0 , "finished", "departement", "6 octobar", 0, "first departement");
        House house = new House("villa with garden", "rent" , 200, 1, 0 , "status", "villa", "6 octobar", 0.0, "first villa",10000.500);
        house.setRate(1.0);
        //House house1 = new House("roof with 2 bed rooms", "rent" , 100, 1, 4 , "status", "Roof", "Shekh Zaid", 0);
//        User user = new User("Noura", "Arafa", "noura95", 01113600147, "nouraarafa95@gmil.com", "nouraArafa");
        //houselogic.addHouse(house, user);
        houselogic.rate(house, 3);
       
       /*MArwa 
       ResultSet r=houseio.search(true, "Area", "200");
       while(r.next()){
           String des=r.getString("description");
                    System.out.println(des);
                    int floor=r.getInt("floor");  
                    System.out.println(floor);
                    String status=r.getString("status");
                    System.out.println(status);
                    String type=r.getString("type");
                    System.out.println(type);
       }
        System.out.println("House: "+houseio.search(true, "Area", "200"));
      
        houseio.rate(1, 5);
       */
        
        /*ArrayList<String> newpr = new ArrayList<>();
        ArrayList<String> pr = new ArrayList<>();
        newpr.add("villa with garden");
        pr.add("description");
        
        newpr.add("buy");
        pr.add("adtype");
        
        newpr.add("villa");
        pr.add("type");
        
        newpr.add("0");
        pr.add("floor");
        
        houseio.edit(newpr, pr, 3);*/
       // System.out.println(houseio.gethouseID(house));
        
    }

    public ArrayList<House> search(House house) throws ClassNotFoundException, SQLException{
        HouseIO houseIo=new HouseIO();
        ArrayList<House> houses=houseIo.search(house);
        return houses;
    }

}
