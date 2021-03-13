package com.ceiba;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AppTesting {

    @Test
    public void ProbarPromedio(){
        Alumno alumno = new Alumno("LA123","Carlos",4.00,3.8);
        Double result;
        result = alumno.CalcularPromedio();
        assertEquals((4+3.8)/2,result,0);
    }

}
