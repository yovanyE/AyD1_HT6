/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 *
 * @author yovany
 */
public class YOVANYENRIQUESAMINESOROZCO_201403689Test {
    
    RegistroAcademico mockitoacademico;
    
    public YOVANYENRIQUESAMINESOROZCO_201403689Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mockitoacademico=mock(RegistroAcademico.class);
        when(mockitoacademico.cheequearCarnet()).thenReturn(false);
         when(mockitoacademico.cheequearCarnet()).thenReturn(true);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generarHorario method, of class YOVANYENRIQUESAMINESOROZCO_201403689.
     */
       @Test
    public void testcarnetValidaFail(){
        mockitoacademico=new RegistroAcademico(203, "0");
        boolean estado=mockitoacademico.cheequearCarnet();
           assertFalse(estado);
        // TODO review the generated test code and remove the default call to fail.
    }
     @Test
    public void testcarnetValidaOk(){
        mockitoacademico=new RegistroAcademico(2010, "03678");
        boolean estado=mockitoacademico.cheequearCarnet();
        assertTrue(estado);
        // TODO review the generated test code and remove the default call to fail.
    }
}
