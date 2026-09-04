package com.progII;

import com.progII.dao.EmpleadoDao;
import com.progII.entities.Empleado;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        EmpleadoDao empleadoDao = new EmpleadoDao();
        List<Empleado> lista= empleadoDao.getAll();

        for (Empleado empleado : lista) {
            System.out.println(empleado.toString());
        }
    }
}
