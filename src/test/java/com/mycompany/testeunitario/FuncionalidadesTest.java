/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeunitario;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sky
 */
public class FuncionalidadesTest {
    Funcionalidades f = new Funcionalidades();
    public FuncionalidadesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of somaNum method, of class Funcionalidades.
     */
    @Test
    public void testSomaNum() {
        
        assertEquals(8,f.somaNum(4, 4) );
    }

    /**
     * Test of par method, of class Funcionalidades.
     */
    @Test
    public void testPar() {
        assertTrue(f.par(7));
    }

    /**
     * Test of impar method, of class Funcionalidades.
     */
    @Test
    public void testImpar() {
        assertTrue(f.impar(8));
    }

    /**
     * Test of primo method, of class Funcionalidades.
     */
    @Test
    public void testPrimo() {
        assertTrue(f.primo(7));
    }
    
}
