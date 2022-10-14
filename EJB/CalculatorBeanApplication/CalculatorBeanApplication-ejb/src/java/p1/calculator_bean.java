/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import javax.ejb.Stateful;

/**
 *
 * @author Charu Saraswat
 */
@Stateful
public class calculator_bean implements calculator_beanRemote {

    @Override
    public int add(final int i, final int j) {
        return i+j;
    }

    

    // Add business logic below. (Right-click in editor and choose
    
// "Insert Code > Add Business Method")

   
}
