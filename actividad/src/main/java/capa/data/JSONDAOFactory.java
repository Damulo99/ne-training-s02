/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa.data;

/**
 *
 * @author nesas-12
 */
public class JSONDAOFactory extends DAOFactory{
    
     public UserDAO userDAO = new JASONUserDAO();
     
     public VehicleDAO vehicleDAO = new JASONVehicleDAO();

    @Override
    public UserDAO getUserDAO() {
        return userDAO;
    }
    
 
    public VehicleDAO getVehicleDAO() {
        return vehicleDAO;
    }
    
}
