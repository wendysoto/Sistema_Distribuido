/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicasistemadistribuido2.principal;

import com.mycompany.practicasistemadistribuido2.entidades.Producto;
import com.mycompany.practicasistemadistribuido2.sesion.ProductoJpaController;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author WENDY
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            // TODO code application logic here
            
            EntityManagerFactory emf=Persistence.createEntityManagerFactory("practicabdd");
            
            ProductoJpaController pjc=new ProductoJpaController(emf);
            
            Producto p=new Producto();
            p.setCodigo(2);
            p.setNombre("Software Gerencia");
            
            Double precio=500.9;
            BigDecimal bd1=BigDecimal.valueOf(precio);
            p.setPrecio(bd1);
            
            p.setDescripcion("Programa financiero");
            
             try {
            pjc.create(p);
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                 System.out.println(ex.getMessage());
        }
        
             
                
                
                
                
    }
    
}
