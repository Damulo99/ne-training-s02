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
public class XMLDAOFactory extends DAOFactory {
    
    public UserDAO userDAO = new XMLUserDAO();
    
    public VehicleDAO vehicleDAO = new XMLVehicleDAO();

    @Override
    public UserDAO getUserDAO() {
        return userDAO;
    }
    
    
    public VehicleDAO getVehicleDAO() {
        return vehicleDAO;
    }
}
