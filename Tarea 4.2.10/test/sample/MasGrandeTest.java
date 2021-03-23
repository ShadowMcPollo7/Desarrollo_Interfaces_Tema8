/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raul-
 */
public class MasGrandeTest {
    
    public MasGrandeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of max method, of class MasGrande.
     */
    @Test
    public void testMax1() {
        System.out.println("Introduciendo valores 3, 4 y 5");
        int a[] = {3, 4, 5};
        int expResult = 5;
        int result = MasGrande.max(a);
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array posición "+ i + ": " + a[i]);
        }
        System.out.println("--------------------------");
        System.out.println("Valor esperado: " +expResult);
        System.out.println("Resultado de la prueba: " +MasGrande.max(a));
        
        assertEquals(expResult, result);
        System.out.println("*************************************************");
        
    }
    
    @Test
    public void testMax2() {
        System.out.println("Introduciendo valores 5, 3 y 4 (con orden cambiado)");
        int a[] = {5, 3, 4};
        int expResult = 5;
        int result = MasGrande.max(a);
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array posición "+ i + ": " + a[i]);
        }
        System.out.println("--------------------------");
        System.out.println("Valor esperado: " +expResult);
        System.out.println("Resultado de la prueba: " +MasGrande.max(a));
        
        assertEquals(expResult, result);
        System.out.println("*************************************************");

        
    }
    
    @Test
    public void testMax3() {
        System.out.println("Introduciendo valor 3 (un solo valor)");
        int a[] = {3};
        int expResult = 3;
        int result = MasGrande.max(a);
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array posición "+ i + ": " + a[i]);
        }
        System.out.println("--------------------------");
        System.out.println("Valor esperado: " +expResult);
        System.out.println("Resultado de la prueba: " +MasGrande.max(a));
        
        assertEquals(expResult, result);
        System.out.println("*************************************************");

        
    }
    
    @Test
    public void testMax4() {
        System.out.println("Sin introducir valores");
        int a[] = {};
        int expResult = 0;
        int result = MasGrande.max(a);
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array posición "+ i + ": " + a[i]);
        }
        System.out.println("--------------------------");
        System.out.println("Valor esperado: " +expResult);
        System.out.println("Resultado de la prueba: " +MasGrande.max(a));
        
        assertEquals(expResult, result);
        System.out.println("*************************************************");
        
    }
    
    @Test
    public void testMax5() {
        System.out.println("Introduciendo 5, 5 y 5 (tres números iguales)");
        int a[] = {5, 5, 5};
        int expResult = 5;
        int result = MasGrande.max(a);
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array posición "+ i + ": " + a[i]);
        }
        System.out.println("--------------------------");
        System.out.println("Valor esperado: " +expResult);
        System.out.println("Resultado de la prueba: " +MasGrande.max(a));
        
        assertEquals(expResult, result);
        System.out.println("*************************************************");
        
    }
    
    
    
}
