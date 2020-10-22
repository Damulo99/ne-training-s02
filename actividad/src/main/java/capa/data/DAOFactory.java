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
public abstract class DAOFactory {
    
    public static final int XML = 1;
    public static final int JASON = 2;
   // public static final int SYBASE = 3;
    
    
    
    public abstract UserDAO getUserDAO();
    
    public static DAOFactory getDAOFactory(
            int whichFactory) {

        switch (whichFactory) {
            case XML:
                return new XMLDAOFactory();
            case JASON:
                return new JSONDAOFactory();
            default:
                return null;
        }
    }
}
