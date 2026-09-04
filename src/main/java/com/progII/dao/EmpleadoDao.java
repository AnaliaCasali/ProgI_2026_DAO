package com.progII.dao;

import com.progII.interfaces.AdministradorConexiones;
import com.progII.interfaces.Dao;
import com.progII.entities.Empleado;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDao implements AdministradorConexiones, Dao<Empleado, Integer> {
    private final String SQL_GETALL="SELECT * FROM empleados";
    private final String SQL_GETBY_ID="SELECT * FROM empleados WHERE empleados.id=?";



    @Override
    public List<Empleado> getAll() {
        List<Empleado> lista=new ArrayList<>();
        try {
            Connection conn = this.obtenerConexion();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL_GETALL);
            while(rs.next()){
                Empleado empleado = new Empleado();
                empleado.setId(rs.getInt("idEmpleado"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setSalarioBase(rs.getDouble("salarioBase"));
                lista.add(empleado);
            }
            // cierro
            rs.close();
            st.close();
            conn.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return lista;
    }

    @Override
    public Empleado getById(Integer id) {
        return null;
    }

    @Override
    public void insert(Empleado objeto) {

    }

    @Override
    public void update(Empleado objeto) {

    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean exists(Integer id) {
        return false;
    }
}
