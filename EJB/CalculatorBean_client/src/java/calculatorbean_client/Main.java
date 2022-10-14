/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorbean_client;

import javax.ejb.EJB;
import p1.calculator_beanRemote;

/**
 *
 * @author Charu Saraswat
 */
public class Main {
    @EJB
    private static calculator_beanRemote calculator_bean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int add=calculator_bean.add(10, 20);
    }
    
}
