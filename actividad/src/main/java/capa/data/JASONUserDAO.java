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
public class JASONUserDAO implements UserDAO {

    public JASONUserDAO() {
    }

    @Override
    public void createUser(String cedula, String nombre, String descripcion) {
        System.out.println("XMLUserDAO.createUser: " +cedula+ ", " +nombre+ ", " +descripcion);
        try {
            FileWriter myWriter = new FileWriter("/tmp/lab/users/json"+cedula+".json");
            myWriter.write(nombre);
            myWriter.write(descripcion);
            myWriter.close();
            System.out.println("Se guardo correctamente ;)");
        } catch (IOException e) {
            System.out.println("No se pudo guardar :(");
            e.printStackTrace();
        }
    }
    
}
