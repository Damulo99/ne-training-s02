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
public class UserCrud {
    private static UserCrud instance = null;

    public static UserCrud getInstance() {
        if (UserCrud.instance == null) {
            instance = new UserCrud();
        }
        return UserCrud.instance;
    }

    private UserCrud() {
    }
    
    public void createUser(String cedula, String nombre, String descripcion){ 
        Encryptor aesWithCbc = new Encryptor()
                .type(Encryptor.TYPES.AES)
                .cbc(true)
                .publicKey("my publi key")
                .secret("password");
        Encryptor tripleDESnoCBC = new Encryptor()
                .type(Encryptor.TYPES.TRIPLEDES)
                .cbc(false)
                .secret("password");
        
        
        String encrypt = aesWithCbc.encrypt(cedula);
        String encrypt2 = tripleDESnoCBC.encrypt(cedula);
        
        
        System.out.println("UserCrud.createUser: "+cedula+", "+nombre+", "+descripcion);
        DAOFactory daoFactory = DAOFactory.getDAOFactory(Math.random() > 0.5 ? DAOFactory.XML : DAOFactory.JASON);
        UserDAO userDAO = daoFactory.getUserDAO();
        userDAO.createUser(cedula, nombre,descripcion);
        
    }
    
}
