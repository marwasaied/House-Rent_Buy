package Logical_layer;

import Classes.House;
import Classes.User;
import Model.HouseIO;
import Model.UserIO;
import java.sql.SQLException;

import java.util.ArrayList;

/**
 * Created by maryam on 12/10/17.
 */
public class AdminLogic {
    
    
    private ArrayList<House> suspendedHouses;


    public ArrayList<House> getSuspendedHouses() {
        return suspendedHouses;
    }

    public void setSuspendedHouses(ArrayList<House> suspendedHouses) {
        this.suspendedHouses = suspendedHouses;
    }


    public void removeHouse(ArrayList<House> houses, House house) throws ClassNotFoundException, SQLException{

        houses.remove(house);
        HouseIO houseIO = new HouseIO();
        houseIO.deleteHouse(house.getAdName());
        
    }
    
    public void suspendHouse(ArrayList<House> houses, ArrayList<House> suspendedHouses, House house) throws ClassNotFoundException, SQLException{
        
        houses.remove(house);
        house.setActive(0);
        suspendedHouses.add(house);
        HouseIO houseIO = new HouseIO();
        houseIO.updateHouse(house);
        
    }
    public ArrayList<User> viewusers() throws ClassNotFoundException, SQLException{
        UserIO userio=new UserIO();
        ArrayList<User> users=new ArrayList<User>();
        users=userio.viewAllusers();
        System.out.println("adminlogic");
        return users;
    }

}
