/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa.business;

import capa.data.DAOFactory;
import capa.data.UserDAO;
import capa.tools.Encryptor;

/**
 *
 * @author nesas-12
 */
public class VehicleCrud {
    private static VehicleCrud instance = null;

    public static VehicleCrud getInstance() {
        if (VehicleCrud.instance == null) {
            instance = new VehicleCrud();
        }
        return VehicleCrud.instance;
    }

    private VehicleCrud() {
    }
    
     public void createVehicle(String placa, String marca, String descripcion){
        Encryptor aesWithCbc = new Encryptor()
                .type(Encryptor.TYPES.AES)
                .cbc(true)
                .publicKey("my publi key")
                .secret("password");
        Encryptor tripleDESnoCBC = new Encryptor()
                .type(Encryptor.TYPES.TRIPLEDES)
                .cbc(false)
                .secret("password");
        
        
        String encrypt = aesWithCbc.encrypt(placa);
        String encrypt2 = tripleDESnoCBC.encrypt(placa);
        
        
        System.out.println("UserCrud.createUser: "+placa+", "+marca+", "+descripcion);
        DAOFactory daoFactory = DAOFactory.getDAOFactory(Math.random() > 0.5 ? DAOFactory.XML : DAOFactory.JASON);
        UserDAO userDAO = daoFactory.getUserDAO();
        userDAO.createUser(placa, marca, descripcion);
    }
    
}
