package org.design;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author lixiaoshuang
 */
public class DecorationPackageControllerTest {
    
    @Test
    public void getMatterList() {
        DecorationPackageController decoration = new DecorationPackageController();
        
        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"), 1));
        
        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"), 2));
        
        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"), 3));
    }
}