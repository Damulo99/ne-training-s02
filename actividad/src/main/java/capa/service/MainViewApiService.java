/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa.service;

import capa.business.UserCrud;
import capa.business.VehicleCrud;

/**
 *
 * @author nesas-12
 */
public class MainViewApiService {
   
    public static  void createUser(String cedula, String nombre, String descripcion){      
        System.out.println("MainViewApiServices.createUser: " +cedula+ ", " +nombre+ ", " +descripcion);
        UserCrud.getInstance().createUser(cedula, nombre, descripcion);
    }
    
    
    public static  void createVehicle(String placa, String marca, String descripcion){      
        System.out.println("MainViewApiServices.createVehicle: "+placa+", "+marca+", "+descripcion);
        VehicleCrud.getInstance().createVehicle(placa, marca, descripcion);
    }
    
}
