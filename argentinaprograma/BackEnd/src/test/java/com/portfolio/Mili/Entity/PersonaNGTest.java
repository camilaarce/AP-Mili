/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.portfolio.Mili.Entity;

import org.springframework.web.multipart.MultipartFile;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Camila
 */
public class PersonaNGTest {
    
    public PersonaNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getPuesto method, of class Persona.
     */
    @Test
    public void testGetPuesto() {
        System.out.println("getPuesto");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getPuesto();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPuesto method, of class Persona.
     */
    @Test
    public void testSetPuesto() {
        System.out.println("setPuesto");
        String puesto = "";
        Persona instance = new Persona();
        instance.setPuesto(puesto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Persona.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Persona.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Persona instance = new Persona();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Persona.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Persona.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Persona instance = new Persona();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImg method, of class Persona.
     */
    @Test
    public void testGetImg() {
        System.out.println("getImg");
        Persona instance = new Persona();
        MultipartFile expResult = null;
        String result = instance.getImg();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImg method, of class Persona.
     */
    @Test
    public void testSetImg() {
        System.out.println("setImg");
        String img = null;
        Persona instance = new Persona();
        instance.setImg(img);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
