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
        // creo empleado
        Empleado empleado1 = new Empleado("Juan", "Gutierrez", 1543217);

        EmpleadoDao empleadoDao = new EmpleadoDao();
        // lo inserto en la base de datos
        empleadoDao.insert(empleado1);
        // veo que id le asigno
        System.out.println("Empleado insertado tiene el id " +  empleado1.getId() );


            empleado1.setSalarioBase(7788882);
            empleado1.setNombre("Juan Jose");
            empleadoDao.update(empleado1);

        List<Empleado> lista= empleadoDao.getAll();
        for (Empleado empleado : lista) {
            System.out.println(empleado.toString());
        }



    }
}
