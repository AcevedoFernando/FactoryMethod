/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cezz_
 */
public class NaveFabrica extends Fabrica {
    
    @Override
    public Producto createProduct(){
        return new Nave();
    }
}
