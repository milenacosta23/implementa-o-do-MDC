/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introducaojunit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author patricia
 */
public class MathUtilTest {
    
       //sao  teste da propiedade 1
    @Test
    public void testSomeMethodAparP1() {
       final int a = 6;
       final int b = 3;
        final int esperado = b;
        int obtido =  MathUtil.mdd(a, b); 
        assertEquals(esperado, obtido); 
    }
    //sao  teste da propiedade 1
    
    void testMdcAImparP1(){
       final int a = 9;
       final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdd(a, b);
        assertEquals(esperado, obtido); 
    
    }
    }
/////////////////////////////////////////////////////