package com.milerarch.dao;
import com.milerarch.model.Coche;
import com.milerarch.util.ConectorBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CocheDao {
    private Connection connection;

    public CocheDao() {
        connection = ConectorBD.getConnection();
    }
    public void addCoche(Coche coche) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO coches (matricula, marca, modelo, color, precio, cliente) VALUES (?, ?, ?, ?, ?)"
            );
            preparedStatement.setString(1, coche.getMatricula());
            preparedStatement.setString(2, coche.getMarca());
            preparedStatement.setString(3, coche.getModelo());
            preparedStatement.setString(4, coche.getColor());
            preparedStatement.setDouble(5, coche.getPrecio());
            preparedStatement.executeUpdate();

            System.out.println(coche + " creado");
        } catch (SQLException e) {
            System.out.println("Error al crear el coche: " + e.getMessage());
        }
    }
    public void updateCoche(Coche coche){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE coches SET matricula=?, marca=?, modelo=?, color=?, precio=? "
            );
            preparedStatement.setString(1, coche.getMatricula());
            preparedStatement.setString(2, coche.getMarca());
            preparedStatement.setString(3, coche.getModelo());
            preparedStatement.setString(4, coche.getColor());
            preparedStatement.setDouble(5, coche.getPrecio());
            preparedStatement.executeUpdate();
            System.out.println(coche + " editado");
        } catch (SQLException e) {
            System.out.println("Error al editar al coche: " + e.getMessage());
        }
    }
    public void deleteCoche(String matricula){
        try {


            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM coche WHERE matricula=?"
            );
            preparedStatement.setString(1, matricula);
            preparedStatement.executeUpdate();

            System.out.println(matricula + " eliminado");
        } catch (SQLException e) {
            System.out.println("Error al editar el coche: " + e.getMessage());
        }
    }

    public List<Coche> getALLCoches(){
        List<Coche> coches = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM coches");
            while (resultSet.next()){
                Coche coche = new Coche();
                coche.setMatricula(resultSet.getNString("matricula"));
                coche.setMarca(resultSet.getNString("marca"));
                coche.setModelo(resultSet.getNString("modelo"));
                coche.setColor(resultSet.getNString("color"));
                coche.setPrecio(resultSet.getDouble("telefono"));

                coches.add(coche);
            }
        }catch (SQLException e){
            System.out.println("Error al listar los coches: " + e.getMessage());
        }
        return coches;
    }

}
