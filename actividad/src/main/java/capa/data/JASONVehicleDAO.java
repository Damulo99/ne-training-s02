/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa.data;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nesas-12
 */
public class JASONVehicleDAO implements VehicleDAO{
    
      public JASONVehicleDAO() {
    }


    @Override
    public void createVehicle(String placa, String marca, String descripcion) {
         System.out.println("XMLUserDAO.createUser: " +placa+ ", " +marca+ ", " +descripcion);
        try {
            FileWriter myWriter = new FileWriter("/tmp/lab/vehicles/json"+placa+".json");
            myWriter.write(marca);
            myWriter.write(descripcion);
            myWriter.close();
            System.out.println("Se guardo correctamente ;)");
        } catch (IOException e) {
            System.out.println("No se pudo guardar :(");
            e.printStackTrace();
        }
    }
    
    
}
